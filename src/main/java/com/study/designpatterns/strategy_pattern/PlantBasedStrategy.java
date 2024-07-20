package com.study.designpatterns.strategy_pattern;

import org.springframework.stereotype.Component;

@Component
public class PlantBasedStrategy implements DietaryStrategy {
    @Override
    public String generateMeal() {
        return "Meal: Tandoori with Lentils";
    }
}
