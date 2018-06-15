package com.greenfoxacademy.todoh2.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Boolean urgent;
    private Boolean done;

    public Todo(String title, boolean b1, boolean b2) {
        this.title = title;
        this.urgent = b1;
        this.done = b2;
    }
}
