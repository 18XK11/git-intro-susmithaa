package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    int i;
    @GetMapping
    public ResponseEntity<String> print(){
        return new ResponseEntity<String>("Hello world", HttpStatus.OK);
    }

    @GetMapping("{name}")
    public ResponseEntity<String> printWithName(@PathVariable String name){
        return new ResponseEntity<String>("Hello "+name, HttpStatus.OK);
    }
}