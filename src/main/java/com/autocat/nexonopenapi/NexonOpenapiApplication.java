package com.autocat.nexonopenapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class NexonOpenapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NexonOpenapiApplication.class, args);
    }

}
