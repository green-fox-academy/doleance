package com.greenfoxacademy.todosqladvanced.Service;

import com.greenfoxacademy.todosqladvanced.Models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    void add(Todo todo);

    void create();

    List<Todo> getAll();

    List<Todo> getAllUrgent();

    List<Todo> find(String keyword);
}
