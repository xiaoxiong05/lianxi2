package com.example.lianxi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

}
