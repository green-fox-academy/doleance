package com.greenfoxacademy.ttc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String indexLoad(@RequestParam(value = "name", required = false) String petName) {
        if (petName == null) {
            return "login";
        } else {
            System.out.println(petName);
            return "/?name=" + petName;
        }
    }

    @GetMapping("/login")
    public String loginLoad() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(Model model, @RequestParam(value = "name") String petName) {
        return "redirect:/?name=" + petName;
    }
}
