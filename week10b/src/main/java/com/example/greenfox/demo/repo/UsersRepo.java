package com.example.greenfox.demo.repo;

import com.example.greenfox.demo.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepo extends CrudRepository<Users, Integer>{
}
