package com.youngly.simple_factory.version2;

public class Operation {
    public static double getResult(double numberA, double numberB, String operate) {
        double resultOfOperate = 0d;
        switch (operate) {
            case "+":
                resultOfOperate = numberA + numberB;
                break;
            case "-":
                resultOfOperate = numberA - numberB;
                break;
            case "*":
                resultOfOperate = numberA * numberB;
                break;
            case "/":
                    resultOfOperate = numberA / numberB;
                break;
            default:
                resultOfOperate = 0d;
        }
        return resultOfOperate;
    }
}
