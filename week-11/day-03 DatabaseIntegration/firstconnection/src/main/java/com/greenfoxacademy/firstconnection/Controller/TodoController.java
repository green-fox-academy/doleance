package com.greenfoxacademy.firstconnection.Controller;

import com.greenfoxacademy.firstconnection.Repositories.TodoRepository;
import com.greenfoxacademy.firstconnection.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value="todo")
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping(value={"/","/list"})
    public String list(Model model) {
        model.addAttribute("todos", todoService.getAll());
        System.out.println(todoService.getAll().get(0));
        return "index";
    }
}
