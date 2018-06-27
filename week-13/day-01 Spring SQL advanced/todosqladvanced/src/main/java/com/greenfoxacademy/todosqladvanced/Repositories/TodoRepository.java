package com.greenfoxacademy.todosqladvanced.Repositories;

import com.greenfoxacademy.todosqladvanced.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByUrgent(Boolean isItUrgent);
    List<Todo> findAllByTitleOrContentOrDescription(String keyword1, String keyword2, String keyword3);
}
