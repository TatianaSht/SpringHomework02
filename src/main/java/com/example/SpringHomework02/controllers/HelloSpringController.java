package com.example.SpringHomework02.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloSpringController {

    @RequestMapping("/index")
    public String welcome()
    {
        return "index.html";
    }

}
