package com.greenfoxacademy.dependencytasks.Controllers;

import com.greenfoxacademy.dependencytasks.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class usefulController {

    @Autowired
    UtilityService utilityService;

    @GetMapping("/useful")
    public String chooseUsefulUtility(){
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String coloringBackground (Model model){
        model.addAttribute("bgcolor", utilityService.randomColor());
        return "useful/colored";
    }
}
