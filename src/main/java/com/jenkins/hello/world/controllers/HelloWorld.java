package com.jenkins.hello.world.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("hello")
    ResponseEntity<String> helloWorld(){
        return new ResponseEntity<>("HelloWorld", HttpStatus.OK);
    }
}
