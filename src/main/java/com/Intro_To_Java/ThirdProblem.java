package com.Intro_To_Java;

import java.util.Scanner;

public class ThirdProblem {
    public static void main(String[] args) {

        //request : Display the max digit from a number

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int n = keyboard.nextInt();    // 123975

        int maxDigit = n % 10;

        if (n == 0)

            System.out.println("Your number is not valid" + "  :/");

        else {

            while (n != 0) {

                if (n % 10 > maxDigit)

                    maxDigit = n % 10;
                n = n / 10;
            }


        }
        System.out.println("The max digit from your number is: " + maxDigit + "  :D");
    }
}