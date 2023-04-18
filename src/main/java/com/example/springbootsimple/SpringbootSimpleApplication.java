package com.example.springbootsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootSimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSimpleApplication.class, args);
    }

    @GetMapping("/get")
    public String test(){
        return "*----This is just an example----*";
    }

}
