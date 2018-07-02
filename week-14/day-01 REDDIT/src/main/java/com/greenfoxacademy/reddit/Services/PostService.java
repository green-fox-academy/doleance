package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    void addNewPost(Post postToSave);
}
