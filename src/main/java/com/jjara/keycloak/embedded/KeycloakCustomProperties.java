package com.jjara.keycloak.embedded;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Getter
@Setter
@ConfigurationProperties(prefix = "keycloak.custom")
public class KeycloakCustomProperties {

    private Server server = new Server();
    private AdminUser adminUser = new AdminUser();
    private Migration migration = new Migration();
    private Infinispan infinispan = new Infinispan();

    @Getter @Setter
    public static class Server {

        /**
         * Path relative to {@code server.servlet.context-path} for the Keycloak JAX-RS Application to listen to.
         */
        String keycloakPath = "/auth";
    }

    @Getter @Setter
    public static class Migration {
        private Resource importLocation = new FileSystemResource("keycloak-realm-config.json");
        private String importProvider = "singleFile";
    }

    @Getter @Setter
    public static class Infinispan {
        private Resource configLocation = new ClassPathResource("infinispan.xml");
    }

    @Getter @Setter
    public static class AdminUser {
        private boolean createAdminUserEnabled = true;
        private String username = "admin";
        private String password;
    }
}
