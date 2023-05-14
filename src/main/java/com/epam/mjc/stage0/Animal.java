package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;


    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.hasFur = hasFur;
        this.numberOfPaws = numberOfPaws;
    }

    public String getDescription() {
        return String.format("This animal is mostly %s. It has %d " + checkCounts() + " and " + checkHasFur(), color, numberOfPaws);
    }

    private String checkHasFur() {
        return hasFur ? "a fur." : "no fur.";
    }

    private String checkCounts() {
        return numberOfPaws == 1 ? "paw" : "paws";
    }
}

