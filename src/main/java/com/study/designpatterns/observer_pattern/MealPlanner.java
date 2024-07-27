package com.study.designpatterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class MealPlanner implements Subject {
    List<Observer> observerList = new ArrayList<>();
    List<String> meals = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observerList) {
            o.update(meals.get(meals.size()-1));
        }
    }

    public void addMeal(String meal) {
        meals.add(meal);
        notifyObservers();
    }
}
