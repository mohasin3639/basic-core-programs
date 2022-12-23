package com.bridgelabz.coreproblems;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
      int firstNumber = input.nextInt();
        System.out.println("Enter 2nd number");
        int secondNumber = input.nextInt();
        System.out.println("Before Swap " + firstNumber + " " + secondNumber);
        int swap = firstNumber;
        firstNumber = secondNumber;
        secondNumber = swap;
        System.out.println("After Swap " + firstNumber + " " + secondNumber);
    }
}
