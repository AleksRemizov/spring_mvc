package com.remizov.brest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        System.out.println("in homeController");
        return "index";
    }
}
