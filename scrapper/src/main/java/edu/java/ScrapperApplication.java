package edu.java;

import com.redis.om.spring.annotations.EnableRedisDocumentRepositories;
import edu.java.configuration.ApplicationConfig;
import edu.java.data.dao.jpa.entities.AssociationJpa;
import edu.java.data.dao.jpa.repositories.AssociationJpaRepository;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableRedisDocumentRepositories(basePackages = "edu.java.*")
@EnableConfigurationProperties(ApplicationConfig.class)
@EnableTransactionManagement
public class ScrapperApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScrapperApplication.class, args);
    }
}
