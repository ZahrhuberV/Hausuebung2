package com.company;

public class Number {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return " ----------------  \n Solution: \n a = " + a  + " b = " + b + "\n ----------------";
    }
}
