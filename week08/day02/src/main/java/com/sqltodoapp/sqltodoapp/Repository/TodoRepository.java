package com.sqltodoapp.sqltodoapp.Repository;

import com.sqltodoapp.sqltodoapp.Model.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {

}
