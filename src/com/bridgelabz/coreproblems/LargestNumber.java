package com.bridgelabz.coreproblems;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int firstNumber = input.nextInt();
        System.out.println("Enter 2nd number");
        int secondNumber = input.nextInt();
        System.out.println("Enter 3rd number");
        int thirdNumber = input.nextInt();
        if(firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Largest number is " + firstNumber);
        }
        else if( secondNumber > thirdNumber) {
            System.out.println("Largest number is " + secondNumber);
        }
        else {
            System.out.println("Largest number is " + thirdNumber);
        }
    }
}
