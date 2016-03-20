package com.company;

import java.util.Scanner;

/**
 * Created by Typer on 3/17/2016.
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        float b = console.nextFloat();
        float c = console.nextFloat();

        String inputA = Integer.toHexString(a);
        String inputAtwo = Integer.toString(a,2);
        String inputB = "0000000000".substring(inputAtwo.length())+inputAtwo;
        System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|",inputA,inputB,b,c);


    }
}
