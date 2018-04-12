package com.greenfox.demo.Controllers;

import com.greenfox.demo.Model.Post;
import com.greenfox.demo.Repository.PostRepo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/reddit")
public class WebController {


    @Autowired
    PostRepo postRepo;


    @GetMapping(value = "/")
    public String mainPage() {

        return "main";
    }

}
