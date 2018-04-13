package com.greenfox.demo.Service;

import com.greenfox.demo.Model.Post;
import com.greenfox.demo.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public void addVote(Long id){
        Post post = postRepo.findById(id).get();
        post.setVotes(postRepo.findById(id).get().getVotes() + 1);
        postRepo.save(post);
    }
    public void downVote(Long id){
        Post post = postRepo.findById(id).get();
        post.setVotes(postRepo.findById(id).get().getVotes() - 1);
        postRepo.save(post);
    }
}
