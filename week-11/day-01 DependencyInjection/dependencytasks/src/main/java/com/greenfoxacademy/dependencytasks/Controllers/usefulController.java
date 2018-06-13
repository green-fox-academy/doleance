package com.greenfoxacademy.dependencytasks.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usefulController {

    @GetMapping("/useful")
    public String chooseUsefulUtility (Model model){
        return "useful";
    }
}
