package com.example.statisticback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.statisticback.dao")
public class StatisticBackApplication {

    public static void main(String[] args) {

        SpringApplication.run(StatisticBackApplication.class, args);
    }

}
