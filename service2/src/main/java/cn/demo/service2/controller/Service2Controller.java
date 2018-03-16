package cn.demo.service2.controller;

import cn.demo.service2.client.Service0Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abel_xu on 2018/1/24.
 */
@RestController
public class Service2Controller {

    public static class User{
        private int id ;
        private String name;

        private Student student;

        public User(){

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

    public static class Student{
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
    Service0Client servcie0Client;

    @GetMapping("/service2/{userId}/{sleepSec}")
    public String test(
            @PathVariable int sleepSec,
            @PathVariable String userId
    ){
        return servcie0Client.test(userId,sleepSec);
    }

    @GetMapping("service2")
    public String test(){
        Student strName= new Student().setStuName("stuName");
        User asd = new User().setId(1).setName("service2").setStudent(strName);
        return  servcie0Client.user(asd);
    }
}
