package edu.java.configuration;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.util.Set;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.validation.annotation.Validated;

@ComponentScan(basePackages = "edu.java",
               excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "edu.java.domain.jooq.*"))
@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = false)
@EnableScheduling
public record ApplicationConfig(
    @Bean
    @NotNull
    ApplicationConfig.SchedulerConfig schedulerConfig,

    @NotNull
    ApiUrl stackOverflowUrl,

    @NotNull
    ApiUrl gitHubUrl,

    @NotNull
    ApiUrl telegramBotUrl,

    @NotNull
    Set<String> gitHubHostNames,

    @NotNull
    Set<String> stackOverflowHostNames,

    @NotNull
    DatabaseAccessType databaseAccessType
) {

    public boolean isGitHubHostName(String hostName) {
        return gitHubHostNames.contains(hostName);
    }

    public boolean isStackOverflowHostName(String hostName) {
        return stackOverflowHostNames.contains(hostName);
    }

    public record SchedulerConfig(boolean enable, @NotNull Duration interval, @NotNull Duration forceCheckDelay) {
    }

    public record ApiUrl(@NotBlank String defaultUrl, String configUrl) {
        public String getBaseUrl() {
            if (configUrl == null) {
                return defaultUrl;
            }
            return configUrl;
        }
    }

    public enum DatabaseAccessType {
        JDBC, JPA, JOOQ
    }

}
