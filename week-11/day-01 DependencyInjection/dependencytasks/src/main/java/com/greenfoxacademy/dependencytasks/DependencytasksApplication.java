package com.greenfoxacademy.dependencytasks;

import com.greenfoxacademy.dependencytasks.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencytasksApplication implements CommandLineRunner {

    @Autowired
    SpellChecker checker;
    @Autowired
    Printer printer;
    @Qualifier(value="myColorYellowImpl")
    @Autowired
    MyColor myColor;

    public static void main(String[] args) {
        SpringApplication.run(DependencytasksApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        checker.checkSpelling();
        printer.log("I am Sanyi.");
        myColor.printColor();
    }
}