package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

    BankAccountService bankAccountService;

    @Autowired
    public BankAccountController(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("msg", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "welcome";
    }

    @GetMapping("/show")
    public String showAccount(Model model, @RequestParam("owner") String owner) {
        model.addAttribute("owner", owner);
        model.addAttribute("firstAccount", bankAccountService.getBankAccount(owner));
        model.addAttribute("accountList", bankAccountService.getAllBankAccounts());
        System.out.println(BankAccountService.getAllBankAccounts().get(1));
        return "show";
    }

}
