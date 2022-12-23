package com.bridgelabz.coreproblems;
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        char alphabet = scan.next().charAt(0);
        switch (alphabet) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(alphabet + " is vowel");
                break;
            default:
                System.out.println(alphabet + " is consonant");
        }
    }
}

