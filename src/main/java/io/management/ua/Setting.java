package io.management.ua;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@Slf4j
@EnableConfigServer
@EnableEurekaServer
public class Setting {
    public static void main(String[] args) {
        SpringApplication.run(Setting.class);
        log.debug("Configuration server started");
    }
}