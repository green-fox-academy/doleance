package com.greenfoxacademy.reddit.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vote {

    @Id
    @GeneratedValue
    Long voteId;

    @OneToOne
    User user;
    @OneToOne
    Post post;

    boolean isItUpVote;

    public Vote() {
    }

    public Vote(User user, Post post, boolean isItUpVote) {
        this.user = user;
        this.post = post;
        this.isItUpVote = isItUpVote;
    }
}


