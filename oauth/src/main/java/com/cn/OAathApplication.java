package com.cn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by abel_xu on 2018/2/26.
 */
@SpringBootApplication
@EnableAuthorizationServer
public class OAathApplication {
    public static void main(String[] args) {
        SpringApplication.run(OAathApplication.class,args);
    }
}
