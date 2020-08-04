package com.inspiresoftware.bmi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BmiCalculatorTest {
    BmiCalculator bmiCalculator;

    @Before
    public void setUp() {
        bmiCalculator = new BmiCalculator();
    }

    @Test
    public void whenProvidingWeightEqualTo50AndHeightEqualTo186UnderweightShouldReturnUnderweight() {
        BmiType type = bmiCalculator.calculate(50, 186);
        Assert.assertEquals(type.name(), BmiType.Underweight.name());
    }

    @Test
    public void whenProvidingWeightEqualTo70AndHeightEqualTo186UnderweightShouldReturnNormal() {
        BmiType type = bmiCalculator.calculate(70, 186);
        Assert.assertEquals(type.name(), BmiType.Underweight.name());
    }
}