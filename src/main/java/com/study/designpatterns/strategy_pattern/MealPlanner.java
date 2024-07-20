package com.study.designpatterns.strategy_pattern;

public class MealPlanner {
    DietaryStrategy dietaryStrategy;

    public void setDietaryStrategy(DietaryStrategy dietaryStrategy) {
        this.dietaryStrategy = dietaryStrategy;
    }

    public String generateMealPlan() {
        return dietaryStrategy.generateMeal();
    }
}
