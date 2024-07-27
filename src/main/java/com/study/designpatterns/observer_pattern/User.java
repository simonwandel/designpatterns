package com.study.designpatterns.observer_pattern;

public class User implements Observer {
    private final String name;

    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String meal) {
        System.out.println("Hello " + name + ", a new meal has been added: " + meal);
    }
}
