package com.example.douglas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TEST3 {
    @GetMapping("/")
    public String test() {
        return "Hello Word";

    }
}
