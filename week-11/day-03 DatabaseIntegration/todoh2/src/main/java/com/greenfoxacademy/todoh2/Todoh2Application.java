package com.greenfoxacademy.todoh2;

import com.greenfoxacademy.todoh2.Models.Todo;
import com.greenfoxacademy.todoh2.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoh2Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Todoh2Application.class, args);
    }

    @Autowired
    TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("read a book", true, true));
        todoRepository.save(new Todo("translate the book", false, false));
        todoRepository.save(new Todo("make this shit work", true, false));
    }
}
