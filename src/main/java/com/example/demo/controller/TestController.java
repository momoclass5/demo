package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.mapper.TestMapper;

@Controller
public class TestController {

    @Autowired
    TestMapper tm ;

    @GetMapping("/")
    public String test(Model m){

        m.addAttribute("date", tm.selectDate());
        return "index.html";
    }
}
