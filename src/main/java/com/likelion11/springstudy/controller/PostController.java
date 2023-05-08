package com.likelion11.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PostController {
    @GetMapping("/posting")
    public String index(Model model) {
        model.addAttribute("post","Hello World");
        return "index";
    }
}
