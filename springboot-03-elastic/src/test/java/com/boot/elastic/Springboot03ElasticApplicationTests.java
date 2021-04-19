package com.boot.elastic;

import com.boot.elastic.bean.Article;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class Springboot03ElasticApplicationTests {

    @Autowired
    JestClient jestClient;

    @Test
    void contextLoads() {

        Article article = new Article();
        article.setId(1);
        article.setTitle("好消息");
        article.setAuthor("zhangsan");
        article.setContent("Hello World");

        Index build = new Index.Builder(article).index("atguigu").type("news").build();

        try {
            jestClient.execute(build);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
