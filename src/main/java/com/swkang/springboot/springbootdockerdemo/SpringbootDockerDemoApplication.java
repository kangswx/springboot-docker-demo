package com.swkang.springboot.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerDemoApplication.class, args);
    }

    @RequestMapping("/user/find")
    public Object findUser(){
        Map<String, String> map = new HashMap<>();
        map.put("name", "swkang");
        map.put("age", "27");
        return map;
    }

}
