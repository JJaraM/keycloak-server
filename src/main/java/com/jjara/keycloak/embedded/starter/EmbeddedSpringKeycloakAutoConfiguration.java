package com.jjara.keycloak.embedded.starter;

import com.jjara.keycloak.embedded.EmbeddedKeycloakConfig;
import com.jjara.keycloak.embedded.KeycloakCustomProperties;
import com.jjara.keycloak.embedded.KeycloakProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({KeycloakProperties.class, KeycloakCustomProperties.class})
@ComponentScan(basePackageClasses = EmbeddedKeycloakConfig.class)
public class EmbeddedSpringKeycloakAutoConfiguration {
}