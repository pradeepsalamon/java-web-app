package com.myapp.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello() 
    {
        return "<h1>hello from Spring Maven</h1>";
    }
}
