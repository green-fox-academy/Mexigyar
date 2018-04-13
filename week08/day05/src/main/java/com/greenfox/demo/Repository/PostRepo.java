package com.greenfox.demo.Repository;

import com.greenfox.demo.Model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Long> {
    Post findByIdIs(Long id);
}
