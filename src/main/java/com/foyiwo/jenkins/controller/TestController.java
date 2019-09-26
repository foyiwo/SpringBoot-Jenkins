package com.foyiwo.jenkins.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;

@Controller
@Mapping("/")
public class TestController {


    @Mapping("")
    public String test(){
        return "test";
    }

}
