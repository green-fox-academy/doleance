package com.greenfoxacademy.reddit.Controller;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostServiceImpl postServiceImpl;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postServiceImpl.getAllPosts();
    }

    @PostMapping("/posts")
    public List<Post> postSomething(@RequestBody Post postsToAdd) {
        //for ( Post post : postsToAdd ) {
            postServiceImpl.addNewPost(postsToAdd);
       // }
        return postServiceImpl.getAllPosts();
    }
}
