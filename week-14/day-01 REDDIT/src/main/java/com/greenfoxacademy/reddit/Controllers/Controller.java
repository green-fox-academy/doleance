package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Services.PostServiceImpl;
import com.greenfoxacademy.reddit.Services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    PostServiceImpl postServiceImpl;

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postServiceImpl.getAllPosts();
    }

    @PostMapping("/posts")
    public List<Post> postSomething(@RequestBody Post[] postsToAdd,
        @RequestHeader("username") String username) {
        for ( Post post : postsToAdd ) {
            post.setOwner(username);
            User newUser = new User(username);
            postServiceImpl.addNewPost(post);
        }
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

    @DeleteMapping("/posts/{id}")
    public List<Post> deletePost(@PathVariable Long id,
                                 @RequestHeader("username") String username) {
        if (username.equals(postServiceImpl.getPostById(id).getOwner())) {
            postServiceImpl.deletePost(postServiceImpl.getPostById(id));
        }
        return postServiceImpl.getAllPosts();
    }

    @PutMapping("/posts/{id}")
    public List<Post> updatePost(@RequestBody Post postToUpdate,
                                 @RequestHeader("username") String username) {
        if (username.equals(postToUpdate.getOwner())) {
            postServiceImpl.updatePost(postToUpdate);
        }
        return postServiceImpl.getAllPosts();
    }
}
