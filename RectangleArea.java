package com.company;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int sideA = console.nextInt();
        int sideB = console.nextInt();
        int area = sideA*sideB;

        System.out.printf("The rectangle's area = %d",area);

    }
}
