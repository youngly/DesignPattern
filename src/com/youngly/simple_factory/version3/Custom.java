package com.youngly.simple_factory.version3;

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

        Operation operation = OperationFactory.createOperate(strOperate);
        String result = String.valueOf(operation.getResult(Double.parseDouble(strNumberA), Double.parseDouble(strNumberB)));
        System.out.println("结果是：" + result);
    }
}
