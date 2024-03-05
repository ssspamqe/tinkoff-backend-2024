package edu.java.bot.webClients;

import com.github.tomakehurst.wiremock.junit5.WireMockTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@WireMockTest(httpPort = 8080)
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.yml")
@ActiveProfiles("test")
public interface WebClientTest {

}

