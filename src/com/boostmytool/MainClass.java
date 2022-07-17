package com.boostmytool;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner Int = new Scanner(System.in);
        System.out.println("Enter Integer Below:");

        Integer Int1 = Int.nextInt();
        System.out.println("Integer 1 is: " + Int1);

        System.out.println("Enter Integer Below:");
        Integer Int2 = Int.nextInt();
        System.out.println("Integer 2 is: " + Int2);

        Integer sum = Int1 + Int2;
        System.out.println("The sum of these numbers are:\n" + sum);


    }
}
