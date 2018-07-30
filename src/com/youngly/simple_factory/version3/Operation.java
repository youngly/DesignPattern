package com.youngly.simple_factory.version3;

public abstract class Operation {
    protected double numberA;
    protected double numberB;

    protected abstract double getResult(double numberA, double numberB);
}
