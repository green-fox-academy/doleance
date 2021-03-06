package com.greenfoxacademy.todoh2.Controller;

import com.greenfoxacademy.todoh2.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value="todo")
public class TodoController {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping(value={"/","/list"})
    //@ResponseBody
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "index";
    }
}
