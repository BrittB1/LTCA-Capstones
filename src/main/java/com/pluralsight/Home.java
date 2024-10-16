package com.pluralsight;

import java.util.Scanner;

public class Home {
   public static Scanner input = null;

    public static void main(String[] args) {

        //set up the scanner to collect user inout
     input  = new Scanner(System.in);


     // print out a welcome screen for the user
        System.out.println("Welcome to Ledger Land");

        // start the app - meaning display your Home menu
        //Home menu method =< showHomeScreen
        showHomeScreen(); // this calls our showHome/Screen method which allows the user to start exploring the app


    } //  we are outside the main method

    //create the Home screen method - this screen is what a user sees anytime they are back at the main menu

    private static void showHomeScreen(){

        System.out.println("\n" +
                "                ==================================\n" +
                "                          HOME MENU \n" +
                "                ==================================\n" +
                "                Choose an option by letter:\n" +
                "                \n" +
                "                D. Add Deposit \n" +
                "                P. Make Payment\n" +
                "                L. Ledger\n" +
                "                X. Exit ");

                String selection = input.nextLine().trim().toUpperCase();

                        switch (selection) {

                            case "D":
                                System.out.println("Make a deposit");
                                //deposit method
                                break;

                            case "P":
                                //payment method
                                break;

                            case "L":
                                //ledger menu
                                break;

                            case "X":

                                break;

                            default:
                                System.out.println("Sorry invalid input");


                        }

    }

    //create ledger menu
    public static void ledgerMenu(){

        //here we will have another switch statement for the Ledger
    }


}
