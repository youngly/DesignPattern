package com.youngly.simple_factory.version1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("请输入数字A:");
        Scanner scaner = new Scanner(System.in);
        String strNumberA = scaner.nextLine();
        System.out.println("请选择运算符（+、-、*、/)");
        String strOperate = scaner.nextLine();
        System.out.println("请输入数字B:");
        String strNumberB = scaner.nextLine();

        String resultOfOperate = "";

        switch (strOperate) {
            case "+":
                resultOfOperate = String.valueOf(Double.parseDouble(strNumberA) + Double.parseDouble(strNumberB));
                break;
            case "-":
                resultOfOperate = String.valueOf(Double.parseDouble(strNumberA) - Double.parseDouble(strNumberB));
                break;
            case "*":
                resultOfOperate = String.valueOf(Double.parseDouble(strNumberA) * Double.parseDouble(strNumberB));
                break;
            case "/":
                if (strNumberB != "0") {
                    resultOfOperate = String.valueOf(Double.parseDouble(strNumberA) / Double.parseDouble(strNumberB));
                } else {
                    resultOfOperate = "除数不能为0";
                }
                break;
            default:
                resultOfOperate = "0";
        }

        System.out.println("结果为： " + resultOfOperate);
    }
}
