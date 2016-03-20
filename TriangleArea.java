package com.company;

import java.util.Scanner;

/**
 * Created by Typer on 3/16/2016.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int sideAx = console.nextInt();
        int sideAy = console.nextInt();

        int sideBx = console.nextInt();
        int sideBy = console.nextInt();

        int sideCx = console.nextInt();
        int sideCy = console.nextInt();

        int triangleArea = (+sideAx*(sideBy-sideCy)+sideBx*(sideCy-sideAy)+sideCx*(sideAy-sideBy))/2;

        System.out.println(triangleArea);
    }
}
