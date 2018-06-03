package com.greenfoxacademy.springstart.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    static AtomicLong counter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam (name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("counter", counter.incrementAndGet());
        return "web/greeting";
    }

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/web/greetings")
    public String greetings(@RequestParam (name="name", required=false, defaultValue="World") String name, Model model) {
        int helloNumero = (int)(Math.random() * hellos.length) - 1;
        model.addAttribute("hello", hellos[helloNumero]);
        model.addAttribute("name", name);
        model.addAttribute("size", ("style=\"font-size:" + (int)(Math.random() * 20) + 6) + "px");
        return "web/greetings";
    }


}
