package com.youngly.simple_factory.version3;

public class OperationDiv extends Operation {
    @Override
    protected double getResult(double numberA, double numberB) {
        return numberA / numberB;
    }
}
