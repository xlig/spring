package cn.demo.service1.client;

import cn.demo.service1.client.fallback.factory.HelloRemoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by abel_xu on 2018/1/31.
 */
@FeignClient(name="server0",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {

    @RequestMapping(method = RequestMethod.GET,path = "user/{userId}/{sleepSec}")
    String hello(@PathVariable("userId") String userId,
                 @PathVariable("sleepSec") int sleepSec
    );
}
