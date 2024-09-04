package com.volpe.first_spring_app.service;


import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public String helloWorld(String word){
        return  "Hello New World"+word;
    }
}
