package com.greenfoxacademy.reddit.Controller;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public List<Post> postSomething(@RequestBody Post postsToAdd,
                                    @RequestHeader("username") String username) {
        //for ( Post post : postsToAdd ) {
        postsToAdd.setOwner(username);
        User newUser = new User(username);
        postServiceImpl.addNewPost(postsToAdd);
       // }
        return postServiceImpl.getAllPosts();
    }

    @PutMapping("/posts/{id}/upvote")
    public List<Post> upvote(@PathVariable Long id) {
        postServiceImpl.increaseScore(postServiceImpl.getPostById(id));
        return postServiceImpl.getAllPosts();
    }

    @PutMapping("/posts/{id}/downvote")
    public List<Post> downvote(@PathVariable Long id) {
        postServiceImpl.decreaseScore(postServiceImpl.getPostById(id));
        return postServiceImpl.getAllPosts();
    }


}
