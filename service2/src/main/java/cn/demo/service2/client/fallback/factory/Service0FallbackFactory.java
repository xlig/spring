package cn.demo.service2.client.fallback.factory;

import cn.demo.service2.client.Service0Client;
import cn.demo.service2.controller.Service2Controller;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by abel_xu on 2018/1/24.
 */
@Component
public class Service0FallbackFactory implements Service0Client {

    @Override
    public String test(@PathVariable("userId") String userId, @PathVariable("sleepSec") int sleepSec) {
        return "create fallback:" + userId + "," +sleepSec;
    }

    @Override
    public String user(Service2Controller.User user) {
            return "create fallback:" + user.toString();
    }
}
