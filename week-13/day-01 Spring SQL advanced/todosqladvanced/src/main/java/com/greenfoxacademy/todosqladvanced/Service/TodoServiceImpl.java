package com.greenfoxacademy.todosqladvanced.Service;

import com.greenfoxacademy.todosqladvanced.Models.Todo;
import com.greenfoxacademy.todosqladvanced.Repositories.TodoRepository;
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
        add(new Todo("mosni","színes ruhákat mosni","Be kell tenni a mosógépbe, rálöttyinteni az öblítőt... satöbbi. Nem vágom, mi ez a content meg description.",false,false));
        add(new Todo("vasalni","a kimosott ruhákat","Érted. Vasaló a felső szekrényben.",false,false));
        add(new Todo("elpakolni","Minden szart.","A helyére.",false,true));
        add(new Todo("számítózni","programozásra","Még akkor is, ha 1 órába telt egyáltalán belőni a MySQL-t.",true,true));
    }

    @Override
    public List<Todo> getAll() {
        return (List<Todo>) todoRepository.findAll();
    }

    @Override
    public List<Todo> getAllUrgent() {
        return todoRepository.findAllByUrgent(true);
    }

    @Override
    public List<Todo> find(String keyword) {
        return todoRepository.findAllByTitleOrContentOrDescription(keyword, keyword, keyword);
    }
}
