package com.study.designpatterns.observer_pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class MealPlannerTest {
    private MealPlanner mealPlanner;
    private User user;

    @BeforeEach
    void setup() {
        mealPlanner = new MealPlanner();
        user = mock(User.class);
    }

    @Test
    void testAddObserver() {
        mealPlanner.addObserver(user);
        mealPlanner.addMeal("Lasagne");
        verify(user).update("Lasagne");
    }

    @Test
    void testRemoveObserver() {
        mealPlanner.addObserver(user);
        mealPlanner.removeObserver(user);
        mealPlanner.addMeal("Lasagne");
        verify(user, never()).update("Lasagne");
    }


}
