package com.crudspring.ede.crudspring.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import com.crudspring.ede.crudspring.controllers.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingsControlle {

    private static final String template = "hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    
    public Greeting helloWorld(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
