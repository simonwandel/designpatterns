package com.study.designpatterns.strategy_pattern;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
class MealPlannerTest {

    @Autowired
    @Qualifier("plantBasedStrategy")
    DietaryStrategy plantBasedStrategy;

    @Test
    void testGenerateMealPlanForPlantBasedDiet() {
        MealPlanner mealPlanner = new MealPlanner();
        mealPlanner.setDietaryStrategy(plantBasedStrategy);

        String mealPlan = mealPlanner.generateMealPlan();

        assertEquals("Meal: Tandoori with Lentils", mealPlan);
    }
}
