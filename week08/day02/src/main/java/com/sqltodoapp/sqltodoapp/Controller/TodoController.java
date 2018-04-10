package com.sqltodoapp.sqltodoapp.Controller;

import com.sqltodoapp.sqltodoapp.Model.Todo;
import com.sqltodoapp.sqltodoapp.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;
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



    @RequestMapping(value = "/list")
    public String list(Model model) {
        model.addAttribute("todos",todos());
        return "todolist";
    }

    public ArrayList<Todo> todos(){
        ArrayList<Todo> todos = new ArrayList<>();
        todoRepository.findAll().forEach(todos::add);
        return todos;
    }



}
