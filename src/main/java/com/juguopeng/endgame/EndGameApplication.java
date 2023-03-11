package com.juguopeng.endgame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
@MapperScan("com.juguopeng.endgame.mapper")//扫描路径下的包，编译后生成相应的接口类
public class EndGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(EndGameApplication.class, args);
    }

}
