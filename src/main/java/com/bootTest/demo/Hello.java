package com.bootTest.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Hello {

    @RequestMapping("/")
    public void greet(){
        System.out.println("Hello");// "Helo";
    }
}
