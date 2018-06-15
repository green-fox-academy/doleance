package com.greenfoxacademy.todoh2.Repositories;

import com.greenfoxacademy.todoh2.Models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
