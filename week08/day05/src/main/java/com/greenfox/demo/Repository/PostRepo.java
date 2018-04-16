package com.greenfox.demo.Repository;

import com.greenfox.demo.Model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface PostRepo extends CrudRepository<Post, Long> {
}
