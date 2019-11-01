package com.example.lianxi2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/hello")
public class UserController {

    @RequestMapping("/hello")
    public String getGreen(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

}
