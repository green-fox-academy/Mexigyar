package com.greenfox.demo.Controllers;

import com.greenfox.demo.Model.Post;
import com.greenfox.demo.Repository.PostRepo;
import com.sun.tools.javac.comp.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/reddit")
public class WebController {


    @Autowired
    PostRepo postRepo;


    @GetMapping(value = "/")
    public String mainPage(Model model) {
        ArrayList<Post> posts = new ArrayList<>();
        postRepo.findAll().forEach(posts::add);
        model.addAttribute("posts",posts);
        return "main";
    }

}
