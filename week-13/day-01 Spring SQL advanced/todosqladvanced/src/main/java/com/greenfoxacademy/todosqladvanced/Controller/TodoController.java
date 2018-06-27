package com.greenfoxacademy.todosqladvanced.Controller;

import com.greenfoxacademy.todosqladvanced.Repositories.TodoRepository;
import com.greenfoxacademy.todosqladvanced.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller(value="todo")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value={"/","/list", "/index"})
    public String list(@RequestParam(value = "keyword", required = false) String keyword, Model model) {
        model.addAttribute("keyword", keyword);
        model.addAttribute("matches",todoService.find(keyword));
        //System.out.println(todoService.find(keyword).get(0));
        model.addAttribute("todos", todoService.getAll());
        return "index";
    }

    @PostMapping(value="/")
    public String search(Model model, @ModelAttribute(value = "keyword") String keyword) {
        return "redirect:/index?name=" + keyword;
    }
}
