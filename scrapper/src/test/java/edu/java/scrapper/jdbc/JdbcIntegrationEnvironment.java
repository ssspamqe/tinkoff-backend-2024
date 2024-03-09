package edu.java.scrapper.jdbc;

import java.io.File;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import liquibase.Contexts;
import liquibase.LabelExpression;
import liquibase.Liquibase;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.resource.DirectoryResourceAccessor;
import liquibase.resource.ResourceAccessor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.testcontainers.containers.JdbcDatabaseContainer;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

//TODO use transaction for rollback
@Testcontainers
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
public abstract class JdbcIntegrationEnvironment {

    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> POSTGRES;

    Connection connection;
    Statement statement;

    static {
        POSTGRES = new PostgreSQLContainer<>("postgres:16")
            .withDatabaseName("scrapper")
            .withUsername("postgres")
            .withPassword("postgres");
        POSTGRES.start();
        try {
            runMigrations(POSTGRES);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    @BeforeEach
    void beforeEach() throws SQLException {
        connection =
            DriverManager.getConnection(POSTGRES.getJdbcUrl(), POSTGRES.getUsername(), POSTGRES.getPassword());
        statement = connection.createStatement();
    }

    @AfterEach
    void afterEach() throws SQLException {
        statement.execute("TRUNCATE chat_links RESTART IDENTITY ");
        statement.execute("TRUNCATE chats RESTART IDENTITY CASCADE");
        statement.execute("TRUNCATE links RESTART IDENTITY CASCADE");

        statement.close();
        connection.close();
    }

    private static void runMigrations(JdbcDatabaseContainer<?> c) throws Exception {
        Connection connection = POSTGRES.createConnection("");

        Database database = DatabaseFactory.getInstance()
            .findCorrectDatabaseImplementation(new JdbcConnection(connection));

        Path changeLogPath = new File(".").toPath().toAbsolutePath().getParent().getParent().resolve("migrations");
        ResourceAccessor resourceAccessor = new DirectoryResourceAccessor(changeLogPath);
        Liquibase liquibase = new Liquibase("master.yaml", resourceAccessor, database);
        liquibase.update(new Contexts(), new LabelExpression());
    }
}
