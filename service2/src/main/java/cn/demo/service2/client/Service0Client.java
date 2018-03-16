package cn.demo.service2.client;

import cn.demo.service2.client.fallback.factory.Service0FallbackFactory;
import cn.demo.service2.controller.Service2Controller;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by abel_xu on 2018/1/24.
 */
@FeignClient(name="service0",fallback = Service0FallbackFactory.class)
public interface Service0Client {

    @RequestMapping(method= RequestMethod.GET, path = "user/{userId}/{sleepSec}")
    String test(
            @PathVariable("userId") String userId,
            @PathVariable("sleepSec") int sleepSec
    );

    @RequestMapping(
            method = RequestMethod.GET,
            path="test"
    )
    String user(Service2Controller.User user);


}
