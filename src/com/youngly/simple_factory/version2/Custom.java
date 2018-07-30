package com.youngly.simple_factory.version2;

import java.util.Scanner;

public class Custom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A:");
        String strNumberA = scanner.nextLine();
        System.out.println("请选择运算符（+、-、*、/)");
        String strOperate = scanner.nextLine();
        System.out.println("请输入数字B:");
        String strNumberB = scanner.nextLine();

        String resultOfOperate = String.valueOf(Operation.getResult(Double.parseDouble(strNumberA),
                Double.parseDouble(strNumberB), strOperate));
        System.out.println("结果是： " + resultOfOperate);
    }
}
