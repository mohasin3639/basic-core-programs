package com.bridgelabz.coreproblems;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        double result = 0.0;
        for (int i = 1; i <= num; i++) {
            result = result + (double) 1 / i;
        }
        System.out.print(num + "th Harmonic Number is " + result);
    }
}
