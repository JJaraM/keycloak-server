package com.jjara.keycloak.embedded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class KeycloakAuthServer {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakAuthServer.class, args);
    }

}