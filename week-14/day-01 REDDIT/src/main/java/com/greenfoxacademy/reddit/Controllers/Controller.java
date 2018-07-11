package com.greenfoxacademy.reddit.Controllers;

import com.greenfoxacademy.reddit.Models.AmendedPost;
import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Models.Vote;
import com.greenfoxacademy.reddit.Services.PostServiceImpl;
import com.greenfoxacademy.reddit.Services.UserServiceImpl;
import com.greenfoxacademy.reddit.Services.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    PostServiceImpl postServiceImpl;

    @Autowired
    UserServiceImpl userServiceImpl;

    @Autowired
    VoteService voteService;

    @GetMapping("/posts")
    public List<AmendedPost> getPosts(@RequestHeader("username") String username) {
        List<AmendedPost> posts = new ArrayList<>();
        User user = userServiceImpl.getUserByUsername(username);
        for ( Post post : postServiceImpl.getAllPosts()) {
            posts.add(voteService.getPersonalVoteToo(user, post));
        }
        return posts;
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
    public List<Post> upvote(@PathVariable Long id,
                             @RequestHeader("username") String username) {
        Post thisPost = postServiceImpl.getPostById(id);
        User thisUser = userServiceImpl.getUserByUsername(username);
        if ((thisUser != null) && (thisPost != null)) {
            Vote thisVote = voteService.getVoteByUserAndPost(username, id);
            if (thisVote == null) {
                postServiceImpl.increaseScore(thisPost);
                thisVote = new Vote(thisUser, thisPost, true);
                voteService.voting(thisVote);
            } else if (!thisVote.isItUpVote()) {
                postServiceImpl.increaseScore(thisPost);
                postServiceImpl.increaseScore(thisPost);
                thisVote.setItUpVote(true);
                voteService.voting(thisVote);
            }
        }
        return postServiceImpl.getAllPosts();
    }

    @PutMapping("/posts/{id}/downvote")
    public List<Post> downvote(@PathVariable Long id,
                               @RequestHeader("username") String username) {
        Post thisPost = postServiceImpl.getPostById(id);
        User thisUser = userServiceImpl.getUserByUsername(username);
        if ((thisUser != null) && (thisPost != null)) {
            Vote thisVote = voteService.getVoteByUserAndPost(username, id);
            if (thisVote == null) {
                postServiceImpl.decreaseScore(thisPost);
                thisVote = new Vote(thisUser, thisPost, false);
                voteService.voting(thisVote);
            } else if (thisVote.isItUpVote()) {
                postServiceImpl.decreaseScore(thisPost);
                postServiceImpl.decreaseScore(thisPost);
                thisVote.setItUpVote(false);
                voteService.voting(thisVote);
            }
        }
        return postServiceImpl.getAllPosts();
    }

    //ToDo Fix this thing... I think the problem is with the cascade. Or the relation.
    @PutMapping("/posts/{id}/cancelvote")
    public List<Post> cancelvote(@PathVariable Long id,
                               @RequestHeader("username") String username) {
        Post thisPost = postServiceImpl.getPostById(id);
        Vote thisVote = voteService.getVoteByUserAndPost(username, id);
        if (thisVote != null) {
            voteService.cancelVote(thisVote);
        }
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
    public List<Post> updatePost(@PathVariable Long id,
                                 @RequestHeader("username") String username) {
        Post postToUpdate = postServiceImpl.getPostById(id);
        if (username.equals(postToUpdate.getOwner())) {
            postServiceImpl.updatePost(postToUpdate);
        }
        return postServiceImpl.getAllPosts();
    }
}
