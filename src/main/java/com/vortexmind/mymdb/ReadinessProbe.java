package com.vortexmind.mymdb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/test")
public class ReadinessProbe {
    @GetMapping
    public String hello() {
        return "true";
    }
}
