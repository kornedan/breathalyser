package com.example.breathalyser.service;

import com.example.breathalyser.model.Gender;
import com.example.breathalyser.model.KindAlcohol;

public class BreathalyserService {

    private double pureAlcoholInGram;

    public double ResultInPrmil(Gender gender, int ml, KindAlcohol kindAlcohol, int weight) {
        pureAlcohol(ml,kindAlcohol);
        return pureAlcoholInGram/(gender.getModulus()*weight);
    }

    private void pureAlcohol(int ml, KindAlcohol kindAlcohol){
        switch (kindAlcohol){
            case BEER: this.pureAlcoholInGram = pureAlcoholForBeer(ml);
            case WINE: this.pureAlcoholInGram = pureAlcoholForWine(ml);
            case VODKA: this.pureAlcoholInGram = pureAlcoholForVodka(ml);
        }
    }

    private double pureAlcoholForBeer(int ml) {
        return (double) ml / 25;
    }

    private double pureAlcoholForWine(int ml) {
        return (double) ml/10;
    }

    private double pureAlcoholForVodka(int ml) {
        return (double) ml/3;
    }
}
