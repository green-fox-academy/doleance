package com.greenfoxacademy.dependencytasks.Service;

import org.springframework.stereotype.Service;

@Service
public class MyColorYellowImpl implements MyColor {
    @Override
    public void printColor() {
        System.out.println("I'm yellow right meow.");

    }
}
