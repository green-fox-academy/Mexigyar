package com.greenfox.demo.Controllers;

import com.greenfox.demo.Model.Post;
import com.greenfox.demo.Repository.PostRepo;
import com.greenfox.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
@RequestMapping(value = "/reddit")
public class WebController {


    @Autowired
    PostRepo postRepo;

    @Autowired
    PostService postService;


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

    @GetMapping(value = "/{id}/up")
    public String upVote(@PathVariable Long id){
        postService.addVote(id);
        return "redirect:/reddit/";
    }

    @GetMapping(value = "/{id}/down")
    public String downVote(@PathVariable Long id){
        postService.downVote(id);
        return "redirect:/reddit/";
    }


}
