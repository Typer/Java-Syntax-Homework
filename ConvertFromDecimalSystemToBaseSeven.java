package com.company;

import java.util.Scanner;

/**
 * Created by Typer on 3/20/2016.
 */
public class ConvertFromDecimalSystemToBaseSeven {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int dec = console.nextInt();

        String systemSeven = Integer.toString(dec,7);

        System.out.println(systemSeven);

    }
}
