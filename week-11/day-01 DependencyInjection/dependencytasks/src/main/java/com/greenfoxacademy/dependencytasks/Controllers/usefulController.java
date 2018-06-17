package com.greenfoxacademy.dependencytasks.Controllers;

import com.greenfoxacademy.dependencytasks.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/useful/email")
    public String isValidEmail (@RequestParam(name="email") String email, Model model){
        model.addAttribute("bgcolor", utilityService.randomColor());
        model.addAttribute("email", email);
        model.addAttribute("emailIsOkay", utilityService.validateEmail(email));
        return "useful/email";
    }

    @GetMapping("/useful/encode")
    public String encoded (Model model, @ModelAttribute(value = "textToEncode") String text){
        String encodedText = utilityService.caesar(text, 1);
        model.addAttribute("encodedText", encodedText);
        return "useful/encode";
    }

    @PostMapping("/useful/encode")
    public String encoding (Model model, @ModelAttribute(value = "textToEncode") String text){
        String encodedText = utilityService.caesar(text, 1);
        model.addAttribute("encodedText", encodedText);
        return "useful/encode";
    }

    @GetMapping("/useful/decode")
    @ResponseBody
    public String decoding (@RequestParam(name="text") String text,
                            @RequestParam(name="number") int number, Model model){
        String fineText = utilityService.caesar(text, -number);
        return fineText;
    }
}
