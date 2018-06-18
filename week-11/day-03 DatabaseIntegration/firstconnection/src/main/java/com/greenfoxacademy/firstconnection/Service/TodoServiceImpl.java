package com.greenfoxacademy.firstconnection.Service;

import com.greenfoxacademy.firstconnection.Models.Todo;
import com.greenfoxacademy.firstconnection.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository;

    @Override
    public void add(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void create() {
        add(new Todo("mosni",false,false));
        add(new Todo("vasalni",false,false));
        add(new Todo("elpakolni",false,true));
        add(new Todo("számítózni",true,true));
    }

    @Override
    public List<Todo> getAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public List<Todo> getAllUrgent() {
        return todoRepository.findAllByUrgent(true);
    }
}
