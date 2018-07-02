package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;


    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @Override
    public void addNewPost(Post postToSave) {
        postRepository.save(postToSave);
    }
}
