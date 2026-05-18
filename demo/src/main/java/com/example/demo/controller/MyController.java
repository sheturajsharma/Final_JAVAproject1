package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Note: Not @RestController if you want to show HTML
public class MyController {

    @GetMapping("/greeting")
    public String hello(Model model) {
        // This adds a variable called "name" that the HTML can use
        model.addAttribute("message", "Hello ,Seturaj!");
        return "greeting"; // This looks for index.html in src/main/resources/templates
    }


}
