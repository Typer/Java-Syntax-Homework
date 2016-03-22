package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Typer on 3/20/2016.
 */
public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rnd = new Random();

        int n = console.nextInt();
        int m = console.nextInt();


        
        if (n>m){
            int sum = n-m;

            for (int i = 0; i < sum ; i++) {
                int value = rnd.nextInt(n)+m;
                System.out.print(value+" ");
            }
        }else if (m>n){
            int sum = m-n;

            for (int i = 0; i < sum ; i++) {
                int value = rnd.nextInt(m) + n;
                System.out.print(value + " ");
            }
        }else if (m==n){
            int value = rnd.nextInt(m) + n;
            System.out.print(value + " ");
        }
    }
}
