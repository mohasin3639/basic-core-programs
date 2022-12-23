package com.bridgelabz.coreproblems;
import java.util.Scanner;
public class PrimeFactorization {
    public static void main(String args[]) {
        int primeFactor = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int userInput = scan.nextInt();
        while (userInput > 1) {
            if (userInput % primeFactor == 0) {
                System.out.println(primeFactor);
                userInput = userInput / primeFactor;
            } else
                primeFactor++;
        }
    }
}