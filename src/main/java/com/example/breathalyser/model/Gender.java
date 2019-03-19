package com.example.breathalyser.model;

public enum Gender {
    MALE(0.7),
    FEMALE(0.6);

    private final double modulus;

    Gender(double modulus) {
        this.modulus = modulus;
    }

    public double getModulus() {
        return this.modulus;
    }
}
