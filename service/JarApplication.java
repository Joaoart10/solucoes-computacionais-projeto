package com.nexus.jar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.nexus.jar.repository")
public class JarApplication {

    public static void main(String[] args) {
        SpringApplication.run(JarApplication.class, args);
    }
}