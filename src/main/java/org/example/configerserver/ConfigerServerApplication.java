package org.example.configerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableConfigServer
public class ConfigerServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigerServerApplication.class, args);
    }
}
