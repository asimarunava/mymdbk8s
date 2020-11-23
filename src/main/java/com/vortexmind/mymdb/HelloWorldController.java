package com.vortexmind.mymdb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class HelloWorldController {

    @GetMapping
    public String hello() {
        return "Ironman...";
    }
}