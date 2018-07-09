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

    public void voting(User user, Post post, boolean isItUpvote) {
        Vote vote = new Vote(user, post, isItUpvote);
        voteRepository.save(vote);
    }

    public Vote getVoteByUserAndPost(String username, Long postId) {
        return voteRepository.findByUserAndPost(userService.getUserByUsername(username), postService.getPostById(postId));
    }

    public void cancelVote(Vote voteToDelete) {
        voteRepository.delete(voteToDelete);
    }

}
