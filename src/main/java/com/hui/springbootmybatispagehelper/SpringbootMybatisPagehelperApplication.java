package com.hui.springbootmybatispagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hui.springbootmybatispagehelper.mapper")
@SpringBootApplication
public class SpringbootMybatisPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisPagehelperApplication.class, args);
    }

}
