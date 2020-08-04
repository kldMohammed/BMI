package com.inspiresoftware.bmi;

public class BmiCalculator {

    public BmiType calculate(double weight, double height) {
        double result = (weight) / Math.pow(height, 2);
        if (result <= 18.5) {
            return BmiType.Underweight;
        } else if (result >= 18.5 && result <= 24.9) {
            return BmiType.Normal;
        } else if (result >= 25 && result <= 29.9) {
            return BmiType.Overweight;
        } else if (result >= 30) {
            return BmiType.Obesity;
        } else {
            return BmiType.UnKnown;
        }
    }
}
