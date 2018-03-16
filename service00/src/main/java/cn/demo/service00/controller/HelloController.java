package cn.demo.service00.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * Created by abel_xu on 2018/1/31.
 */
@RestController
public class HelloController {

    @GetMapping("user/{userId}/{sleepSec}")
    public String user(@PathVariable String userId,
                       @PathVariable int sleepSec){
        return "I am service00 :userId" +userId+",:sleepSec"+sleepSec;
    }
}
