package com.greenfoxacademy.reddit.Models;

import javax.persistence.*;
import java.util.List;

@Entity(name="votes")
public class Vote {

    @Id
    @GeneratedValue
    Long voteId;

    @ManyToOne
    User user;
    @ManyToOne
    Post post;

    boolean isItUpVote;

    public Vote() {
    }

    public Vote(User user, Post post, boolean isItUpVote) {
        this.user = user;
        this.post = post;
        this.isItUpVote = isItUpVote;
    }

    public Long getVoteId() {
        return voteId;
    }

    public void setVoteId(Long voteId) {
        this.voteId = voteId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public boolean isItUpVote() {
        return isItUpVote;
    }

    public void setItUpVote(boolean itUpVote) {
        isItUpVote = itUpVote;
    }
}


