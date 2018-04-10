package com.greenfox.connectionwithmysql.Controller;

import com.greenfox.connectionwithmysql.Model.Todo;
import com.greenfox.connectionwithmysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

    private final
    TodoRepository todoRepository;

    @Autowired
    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }


    @RequestMapping(value = "/")
    public String list(Model model, @RequestParam(value = "isActive",required = false) Boolean isActive) {
       if (isActive != null){
           model.addAttribute("todos", todoRepository.findAllByDone(!isActive));
           return "todolist";
       }else
        model.addAttribute("todos", todos());
        return "todolist";
    }

    @GetMapping(value = "/add")
    public String add(Model model){
        return "addTodo";
    }


    public ArrayList<Todo> todos() {
        ArrayList<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }

    public int createTodo(String name){
        todoRepository.save(new Todo(name));
        return 0;
    }


}
