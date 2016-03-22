package com.company;

import java.util.Scanner;

/**
 * Created by Typer on 3/20/2016.
 */
public class ConvertFromBaseSevenToDecimal {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.println(toBaseSeven(str));

    }

    public static int toBaseSeven(String str){

        String reverse = new StringBuilder(str).reverse().toString();
        char[] chr = reverse.toCharArray();
        int sum = 0;
        for (int i = 0; i <chr.length ; i++) {
            int number = Integer.parseInt(String.valueOf(chr[i]));
            sum+=number*Math.pow(7,i);
        }
        return sum;
    }
}

