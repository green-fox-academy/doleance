package com.greenfoxacademy.firstconnection.Repositories;

import com.greenfoxacademy.firstconnection.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findAllByUrgent(Boolean isItUrgent);
}
