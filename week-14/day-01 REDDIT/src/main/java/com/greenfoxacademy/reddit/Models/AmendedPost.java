package com.greenfoxacademy.reddit.Models;

public class AmendedPost {
    Post post;
    int userPersonalVote;

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public int getUserPersonalVote() {
        return userPersonalVote;
    }

    public void setUserPersonalVote(int userPersonalVote) {
        this.userPersonalVote = userPersonalVote;
    }

    public AmendedPost() {
    }

    public AmendedPost(Post post, Boolean isItUpvote) {
        this.post = post;
        if (isItUpvote == null) {
            this.userPersonalVote = 0;
        } else if (isItUpvote) {
            this.userPersonalVote = 1;
        } else {
            this.userPersonalVote = -1;
        }
    }
}
