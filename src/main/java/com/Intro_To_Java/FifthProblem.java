package com.Intro_To_Java;

import java.util.Scanner;

public class FifthProblem {
    public static void main(String[] args) {

        //Request: Display all the prime numbers lower than a given number

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your number :" + " :D");
        int num = keyboard.nextInt();
        int  count;

        for (int i = 2; i < num; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;

                }
            }
            if (count == 0) {
                System.out.print( i + " ");
            }

        }
    }
}
