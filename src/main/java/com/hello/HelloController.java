package com.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${authUrl}")
    private String authUrl;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        System.out.println(authUrl);
        return "Hello Spring Boot!";
    }

    @RequestMapping(value="/welcome/{name}",method = RequestMethod.GET)
    public String welcome(@PathVariable String name) {
        return String.format("Welcome, %s",name);

    }

}
