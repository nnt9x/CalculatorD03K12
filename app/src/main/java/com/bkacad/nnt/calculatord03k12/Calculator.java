package com.bkacad.nnt.calculatord03k12;

public interface Calculator {
    public double plus(double a, double b);

    public double minus(double a, double b);

    public double mul(double a, double b);

    public double div(double a, double b);

    // a % b
    public long mod(long a, long b);

    // a ^ b
    public double pow(double a, double b);
}
