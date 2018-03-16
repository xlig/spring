package cn.demo.service1.client.fallback.factory;

import cn.demo.service1.client.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by abel_xu on 2018/1/31.
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello( @PathVariable("userId") String userId, @PathVariable("sleepSec") int sleepSec) {
        return "hello" + userId + "this message send failed";
    }
}
