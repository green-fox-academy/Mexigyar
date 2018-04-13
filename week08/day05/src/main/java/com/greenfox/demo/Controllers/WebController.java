package com.greenfox.demo.Controllers;

import com.greenfox.demo.Model.Post;
import com.greenfox.demo.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @GetMapping(value = "/add_post")
    public String addPost(Model model){
        return "addpost";
    }
    @PostMapping(value = "/add_post")
    public String addPost1(String description, String link){
        postRepo.save(new Post(link, description));
        return "redirect:/reddit/";
    }

}
