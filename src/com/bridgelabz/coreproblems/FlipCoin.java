package com.bridgelabz.coreproblems;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many times you want to flip a coin");
        int userInput = scan.nextInt();
        int head = 0;
        int tail= 0;
        for (int i = 0; i < userInput; i++) {
            int flip = (int) Math.floor(Math.random() * 10) % 2;
            if (flip == 1)
                head++;
            else
            tail++;
        }
        System.out.println("Number of times head appears is " + head);
        System.out.println("Number of times tail appears is " + tail);
        float headPercentage = (float) head * 100 / userInput;
        float tailPercentage = (float) tail * 100 / userInput;
        System.out.println("The Percentage of head appearance is "+ headPercentage + "%");
        System.out.println("The Percentage of tail appearance is "+ tailPercentage + "%");
    }
}
