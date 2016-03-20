package com.company;

import java.util.Scanner;

/**
 * Created by Typer on 3/20/2016.
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();

        double aPow = Math.pow(a,2);
        double bPow = Math.pow(b,2);
        double cPow = Math.pow(c,3);
        double cSquare = Math.sqrt(c);

        double formOne = Math.pow(((aPow+bPow)/(aPow-bPow)),(a+b+c)/cSquare);
        double formTwo = Math.pow((aPow+bPow-cPow),(a-b));

        double averageSum = (((formOne+formTwo)/2)-((a+b+c)/3));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",formOne,formTwo,averageSum);
//        System.out.println(formTwo);
//        System.out.println(averageSum);
//        Average (a, b, c) – Average (f1, f2)

    }
}
