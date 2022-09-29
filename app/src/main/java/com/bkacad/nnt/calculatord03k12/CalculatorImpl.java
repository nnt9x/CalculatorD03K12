package com.bkacad.nnt.calculatord03k12;

public class CalculatorImpl implements Calculator {
    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        if (b == 0) {
            throw new RuntimeException("Không thể chia cho 0");
        }
        return a / b;
    }

    @Override
    public long mod(long a, long b) {
        return a % b;
    }

    @Override
    public double pow(double a,double b) {
        return Math.pow(a, b);
    }
}
