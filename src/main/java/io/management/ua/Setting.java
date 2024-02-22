package io.management.ua;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@Slf4j
@EnableConfigServer
@EnableDiscoveryClient
public class Setting {
    public static void main(String[] args) {
        SpringApplication.run(Setting.class);
        log.debug("Configuration server started");
    }
}