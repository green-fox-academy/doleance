package com.greenfoxacademy.firstconnection.Service;

import com.greenfoxacademy.firstconnection.Models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

    void add(Todo todo);

    void create();

    List<Todo> getAll();

    List<Todo> getAllUrgent();
}
