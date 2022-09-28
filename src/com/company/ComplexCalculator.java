package com.company;

public class ComplexCalculator extends AbstractCalculator{

    public ComplexCalculator(CalculationOperation add,
                             CalculationOperation substract,
                             CalculationOperation multiply,
                             CalculationOperation divide) {
        super(add, substract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        return null;
    }

    @Override
    public Number substract(Number a, Number b) {
        return null;
    }

    @Override
    public Number multiply(Number a, Number b) {
        return null;
    }

    @Override
    public Number divide(Number a, Number b) {
        return null;
    }
}
