package com.designpatterns.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsApplication {

    @GetMapping("/")
    public String home(){
        return "Welcome to AWS First";
    }
    public static void main(String[] args) {
        SpringApplication.run(AwsApplication.class, args);
    }

}
