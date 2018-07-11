package com.greenfoxacademy.reddit.Services;

import com.greenfoxacademy.reddit.Models.Post;
import com.greenfoxacademy.reddit.Models.User;
import com.greenfoxacademy.reddit.Models.Vote;
import com.greenfoxacademy.reddit.Repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoteService {

    @Autowired
    VoteRepository voteRepository;

    @Autowired
    PostServiceImpl postService;

    @Autowired
    UserServiceImpl userService;

    public void voting(Vote vote) {
        voteRepository.save(vote);
    }

    public Vote getVoteByUserAndPost(String username, Long postId) {
        return voteRepository.findByUserAndPost(userService.getUserByUsername(username), postService.getPostById(postId));
    }

    public void cancelVote(Vote voteToDelete) {
        if (voteToDelete.isItUpVote()) {
            postService.decreaseScore(voteToDelete.getPost());
        } else {
            postService.increaseScore(voteToDelete.getPost());
        }
        voteRepository.delete(voteToDelete);
    }

}
