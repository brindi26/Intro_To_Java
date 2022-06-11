package com.Intro_To_Java;

import java.util.Scanner;

public class FourthProblem {
    public static void main(String[] args) {

        // Request : Check if a number is palindrom( e.g palindrom 1221, 34143)

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = keyboard.nextInt();
        int mirror = 0; // We will create a mirror for our number and in this way we'll find out if the number is a palindrom or not
        int copy = n ; // here we create a copy to our number because its value will be changed meanwhile

        while (n != 0) {

            mirror = mirror * 10 + n % 10;
            n = n / 10;

        }

        if( mirror == copy )

            System.out.println("Your number is a palindrom: " + " :D");

        else

            System.out.println("Your number is not a palindrom: " + " :D");


    }
}
