package com.learn.test.api.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({YmlConfig.class})
public class ServerApplication {
    //@EnableAspectJAutoProxy
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}
