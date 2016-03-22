package com.company;

import java.util.Scanner;

//Create a method that takes two strings as arguments and returns the sum of their character
//codes multiplied (multiply str1.charAt (0) with str2.charAt (0) and add to the total sum).
//Then continue with the next two characters. If one of the strings is longer than the other,
//add the remaining character codes to the total sum without multiplication.
public class CharacterMultiplier {
    public static void main(String[] args) {

        Scanner consle = new Scanner(System.in);

        String strOne = consle.nextLine();
        String strTwo = consle.nextLine();

        System.out.println(sumOfString(strOne,strTwo));
    }

    public static int sumOfString(String first,String second)
    {
        char[] chrOne = first.toCharArray();
        char[] chrTwo = second.toCharArray();

        int firstSum = 0;
        int secondSum = 0;

        int sum=0;

        for (int i = 0; i < chrOne.length; i++) {
            firstSum =(int)(first.charAt((i)));
            secondSum =(int)(second.charAt((i)));

            sum+=firstSum*secondSum;
        }

        return sum;
    }
}
