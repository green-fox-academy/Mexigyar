package com.greenfox.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int votes;
    String link;
    String description;

    public Post(String link, String description) {
        this.votes = 0;
        this.link = link;
        this.description =description;
    }

    public Post() {
    }


}
