package cn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by abel_xu on 2018/3/5.
 */

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(ConfigAppliaction.class, args);
    }
}
