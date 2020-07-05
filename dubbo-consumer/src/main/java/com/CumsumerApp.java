package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: dubbo-best
 * @description:
 * @author: zxb
 * @create: 2020-07-05 21:44
 **/
@SpringBootApplication
@EnableScheduling
public class CumsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(CumsumerApp.class);
    }
}
