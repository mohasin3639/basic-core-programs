package com.bridgelabz.coreproblems;

public class PowerOfTwo {
    public static void main(String[] args) {
        int argument = Integer.parseInt(args[0]);
        int i = 0;
        int powerOfTwo = 1;
        while (i <= argument) {
            System.out.println(i + "th power of 2 is " + powerOfTwo);
            powerOfTwo = 2 * powerOfTwo;
            i = i + 1;
        }
    }
}
