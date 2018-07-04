package com.greenfoxacademy.reddit.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(Vote.VotePK.class)
public class Vote {

    @Id
    @ManyToOne
    @JoinColumn(name="userId")
    //@ManyToMany(targetEntity = User.class)
    Long userId;

    @Id
    //@ManyToMany(targetEntity = Post.class)
    Long postId;

    public Vote() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public class VotePK implements Serializable {
        protected Long userId;
        protected Long postId;

        public VotePK() {

        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }
    }
}


