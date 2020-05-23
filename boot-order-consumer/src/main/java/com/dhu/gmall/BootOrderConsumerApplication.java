package com.dhu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootOrderConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootOrderConsumerApplication.class, args);
    }

}
