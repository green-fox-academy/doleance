package com.greenfoxacademy.springstart.Controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    static AtomicLong lastId;

    private long id;
    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Greeting() {
        lastId.set(0);
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting(String content) {
        this(lastId.incrementAndGet(), content);
    }
}
