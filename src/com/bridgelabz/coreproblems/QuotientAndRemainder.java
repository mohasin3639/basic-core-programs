package com.bridgelabz.coreproblems;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Dividend");
        int dividend = scan.nextInt();
        System.out.println("Enter a Divisor");
        int divisor = scan.nextInt();
        int quotient = dividend / divisor ;
        System.out.println("the Quotient is "+quotient);
        int reaminder = dividend % divisor ;
        System.out.println("The Remainder is "+reaminder);
    }
}
