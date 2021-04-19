package com.boot.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootTest
class Springboot04TaskApplicationTests {
    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        for (int i = 0; i <= 50; i++){
            SimpleMailMessage message = new SimpleMailMessage();

            message.setSubject("石国强");
            message.setText("石国强是猪！！！");
            message.setTo("piller4f@gmail.com");
            message.setFrom("z1171705508@163.com");
            mailSender.send(message);
        }

    }

}
