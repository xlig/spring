package cn.demo.service1.controller;

import cn.demo.service1.client.HelloRemote;
import cn.demo.service1.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 14:21
 * @Description:
 */
@RestController
public class Service1Controller {
    public static class User {
        private int id;
        private String name;

        private Student student;

        public User() {
        }

        public int getId() {
            return id;
        }

        public User setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }

        public Student getStudent() {
            return student;
        }

        public User setStudent(Student student) {
            this.student = student;
            return this;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", student=" + student +
                    '}';
        }
    }

    public static class Student {
        private String stuName;

        public Student() {
        }

        public String getStuName() {
            return stuName;
        }

        public Student setStuName(String stuName) {
            this.stuName = stuName;
            return this;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "stuName='" + stuName + '\'' +
                    '}';
        }
    }

    @Autowired
    Service0Client service0Client;
    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/test/{userId}/{sleepSec}")
    public String test(
            @PathVariable int sleepSec,
            @PathVariable String userId
    ) {
//        if (1 == 1) {
//            System.out.println(333);
//            throw new RuntimeException("111111111111");
//        }
        return service0Client.test(userId, sleepSec);
    }

    @GetMapping("user")
    public String test() {
//        if (1 == 1) {
//            System.out.println(333);
//            throw new RuntimeException("111111111111");
//        }
        Student stuName = new Student()
                .setStuName("stuName");
        User asd = new User()
                .setId(0)
                .setName("asd")
                .setStudent(stuName);

        System.out.println(asd.toString());
        return service0Client.user(asd);
    }

    @GetMapping("/hello/{userId}/{sleepSec}")
    public String hello(@PathVariable String userId, @PathVariable int sleepSec){
       return  helloRemote.hello(userId,sleepSec);
    }
}
