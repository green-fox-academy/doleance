package com.greenfoxacademy.todosqladvanced.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Todo {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String content;
    private Boolean urgent;
    private Boolean done;

    public Todo(String title, String description, String content, Boolean urgent, Boolean done) {
        this.title = title;
        this.content = content;
        this.description = description;
        this.urgent = urgent;
        this.done = done;
    }
}
