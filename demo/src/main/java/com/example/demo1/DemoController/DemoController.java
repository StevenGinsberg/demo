package com.example.demo1.DemoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/Hello")
    public String sendGreeting(){
        return"Hello Wiley!!!";
    }
}
