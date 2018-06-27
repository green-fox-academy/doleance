package com.greenfoxacademy.todosqladvanced;

import com.greenfoxacademy.todosqladvanced.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodosqladvancedApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TodosqladvancedApplication.class, args);
    }

    @Autowired
    TodoService todoService;

    @Override
    public void run(String... args) throws Exception {
        todoService.create();
    }
}
