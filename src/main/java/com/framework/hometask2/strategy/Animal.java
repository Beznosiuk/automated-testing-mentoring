package com.framework.hometask2.strategy;

public abstract class Animal {
    MoveBehavior moveBehavior;
    FeedBehavior feedBehavior;

    public abstract void display();

    public void setMoveBehavior(MoveBehavior mb) {
        moveBehavior = mb;
    }

    public void setFeedBehavior(FeedBehavior fb) {
        feedBehavior = fb;
    }

    public void performMove() {
        moveBehavior.move();
    }

    public void performFeed() {
        feedBehavior.feed();
    }
}
