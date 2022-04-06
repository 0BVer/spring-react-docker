package com.example.springbackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class testController {

    @GetMapping(path = "/test")
    public static String test(){
        String temp = "hello world!";
        return temp;
    }
}
