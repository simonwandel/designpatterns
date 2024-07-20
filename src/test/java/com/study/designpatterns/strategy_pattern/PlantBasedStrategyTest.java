package com.study.designpatterns.strategy_pattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantBasedStrategyTest {
    @Test
    void testGenerateMealPlan() {
        DietaryStrategy plantBasedStrategy = new PlantBasedStrategy();
        String meal = plantBasedStrategy.generateMeal();
            assertEquals("Meal: Tandoori with Lentils", meal);
    }
}
