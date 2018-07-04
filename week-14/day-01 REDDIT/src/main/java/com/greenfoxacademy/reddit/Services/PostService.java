package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    Post getPostById(Long id);
    void addNewPost(Post postToSave);
    void increaseScore(Post postToUpvote);
    void decreaseScore(Post postToDownvote);
    void deletePost(Post postToDelete);
}
