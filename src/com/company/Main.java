package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);

        System.out.println("Enter Length of roof");
        double roofLength = keyboard.nextDouble();

        System.out.println("Enter width of roof");
        double roofWidth = keyboard.nextDouble();

        System.out.println("Enter rainFall");
        int rainFall = keyboard.nextInt();


        double cuWater= (roofLength * 12) * (roofWidth * 12) * (rainFall);

        double gallons;
        gallons= (cuWater/231);


        System.out.println("\ncuWater " + cuWater + "\ngallons " + gallons);
    }
}
