package com.volpe.first_spring_app.controller;

import com.volpe.first_spring_app.Domain.User;
import com.volpe.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController{

    @Autowired // using instead of contructor
    private HelloWorldService helloWorldService;



    @GetMapping() // Can be POST, DELETE, UPDATE...
    public String helloWorld(){
        return  helloWorldService.helloWorld(" new word2");
    }

    @PostMapping()
    public String helloWorldPost(@RequestBody User body){
        return  helloWorldService.helloWorld("email: "+body.getEmail());
    }

    @PostMapping("/{id}")
    public String helloWorldPostPath(@PathVariable String id, @RequestParam(value = "data", defaultValue = "None") String filter, @RequestBody User body){
        return  helloWorldService.helloWorld("email: "+body.getEmail());
    }
}