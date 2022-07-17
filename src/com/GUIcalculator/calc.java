package com.GUIcalculator;
import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Enter a number below:");

        Float myNum1 = myNum.nextFloat();

        System.out.println("\nEnter a number below:");

        Float myNum2 = myNum.nextFloat();

        Float sumNum = myNum1 + myNum2;

        System.out.println("\nThe sum is: " + sumNum);

    }
}
