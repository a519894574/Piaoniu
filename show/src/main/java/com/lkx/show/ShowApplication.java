package com.lkx.show;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lkx.show.dao")
public class ShowApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShowApplication.class, args);
    }

}

