package com.DigitalInovationOne.springbootconfig.config;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.processing.Generated;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter

public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;

        @Profile("dev")
        @Bean
    public String testeDataBaseConnection(){
        System.out.println("DB connection for DEV - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB connection to H2_TEST - test instance "
    }

        @Profile("prod")
        @Bean
    public String productionDataBaseConnection(){
        System.out.println("DB connection for PRODUCTION - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB connection to MYSQL_PROD - Production instance "
    }
}
