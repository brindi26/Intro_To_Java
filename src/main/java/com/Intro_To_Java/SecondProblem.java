package com.Intro_To_Java;

import java.util.Scanner;

public class SecondProblem {
    public static void main(String[] args) {

        //Request: Display the smallest number from an array of number

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the number of elements for your array: " + "  :D");
        int n = keyboard.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter the elements for your array: " + " :D");
        for (int i = 0; i < n; i++) {
            arr[i] = keyboard.nextInt();

        }
        int k = arr[0];

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");

            if (arr[i] < k)
                k = arr[i];

        }
    }
}