package com.ges.webblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("title", "Home page");
        return "home";
    }
    @GetMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("title", "About page");
        return "about";
    }
}
