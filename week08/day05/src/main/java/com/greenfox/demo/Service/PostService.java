package com.greenfox.demo.Service;

import com.greenfox.demo.Repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public void addVote(Long id){
        postRepo.findByIdIs(id).setVotes(postRepo.findByIdIs(id).getVotes() + 1);
    }
}
