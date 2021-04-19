package com.boot.amqp;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class Springboot02Amqp1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02Amqp1Application.class, args);
    }

}
