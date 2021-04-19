package com.boot.cache;

import com.boot.cache.bean.Employee;
import com.boot.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class Springboot01CacheApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    RedisTemplate<Object, Employee> empRedisTemplate;


    @Test
    public void test01(){
//        stringRedisTemplate.opsForValue().append("msg", "hello");
        String msg = stringRedisTemplate.opsForValue().get("msg");

        System.out.println(msg);
    }

    @Test
    public void test02(){
        Employee empById = employeeMapper.getEmpById(1);
//        redisTemplate.opsForValue().set("emp-01", empById);
        empRedisTemplate.opsForValue().set("emp-01", empById);
    }



    @Test
    void contextLoads() {
        Employee empById = employeeMapper.getEmpById(1);
        System.out.println(empById);
    }

}
