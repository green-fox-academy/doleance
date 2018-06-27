package com.greenfoxacademy.bankofsimba.Controllers;

import com.greenfoxacademy.bankofsimba.Model.BankAccount;
import com.greenfoxacademy.bankofsimba.Service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String showAccount(Model model, @RequestParam(value = "owner", required = false) String owner) {
        if (owner != null) {
            model.addAttribute("searchedAccount", bankAccountService.getBankAccount(owner));
        }
        model.addAttribute("accountList", bankAccountService.getAllBankAccounts());
        return "show";
    }

    @PostMapping("/increase_balance/{owner}")
    public String increaseBalance(@PathVariable(value = "owner") String owner) {
        bankAccountService.increase(owner);
        return "redirect:/show";
    }

    @PostMapping("/add")
    public String addNewOwner(@ModelAttribute(value = "newbie") BankAccount newbie) {
        bankAccountService.addBankAccount(newbie);
        return "redirect:/show";
    }

}
