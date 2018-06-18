package com.greenfoxacademy.firstconnection;

import com.greenfoxacademy.firstconnection.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstconnectionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(FirstconnectionApplication.class, args);
    }

    @Autowired
    TodoService todoService;

    @Override
    public void run(String... args) throws Exception {
        todoService.create();
    }
}
