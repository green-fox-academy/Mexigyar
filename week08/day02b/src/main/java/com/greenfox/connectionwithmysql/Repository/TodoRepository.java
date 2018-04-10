package com.greenfox.connectionwithmysql.Repository;

import com.greenfox.connectionwithmysql.Model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByDone(boolean isActive);

}
