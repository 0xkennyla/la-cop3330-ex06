/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kenny La
 */
package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class Exercise06 {
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your current age?");
        int age = scan.nextInt();
        System.out.println("At what age would you like to retire?");
        int retireAge = scan.nextInt();
        int x = retireAge-age;
        System.out.println("You have " + x + " years left until you can retire.");
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int retireYear = currentYear + x;
        System.out.println("It's " + currentYear + ", so you can retire in " + retireYear + ".");
    }
}
