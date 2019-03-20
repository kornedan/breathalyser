package com.example.breathalyser.service;

import com.example.breathalyser.model.Gender;
import org.springframework.stereotype.Service;

@Service
public class BreathalyserService {

    private final double DENSITY_OF_EYLIC_ALCOHOL = 0.79;

    public double resultInPrmil(Gender gender, int ml, int percent, int weight) {
        return pureAlcohol(ml, percent) / fluidContentInBody(gender, weight);
    }

    public double pureAlcohol(int ml, int percent) {
        return (double) ml * percent / 100 * DENSITY_OF_EYLIC_ALCOHOL;
    }

    public double fluidContentInBody(Gender gender, int weight) {
        return (double) gender.getModulus() * weight;
    }
}
