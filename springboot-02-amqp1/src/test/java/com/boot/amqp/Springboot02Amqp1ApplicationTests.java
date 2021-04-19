package com.boot.amqp;

import com.boot.amqp.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class Springboot02Amqp1ApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    public void createExchange(){
//        amqpAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
//        System.out.println("创建完成!");
//        amqpAdmin.declareQueue(new Queue("amqpadmin.queue", true));


    }

    @Test
    void contextLoads() {

//        rabbitTemplate.send();
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "这个是第一个消息");
        map.put("data", Arrays.asList("helloworld", 123, true));
        rabbitTemplate.convertAndSend("exchange.direct", "atguigu.news", new Book("西游记", "吴承恩"));
    }

    @Test
    public void receive(){
        Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
        System.out.println(o.getClass());
        System.out.println(o);
    }

}
