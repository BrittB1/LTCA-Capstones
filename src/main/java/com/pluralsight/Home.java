package com.pluralsight;

import java.util.Scanner;

public class Home {
    public static Scanner input = null;

    public static void main(String[] args) {

        //set up the scanner to collect user inout
        input = new Scanner(System.in);

        String file = "src\\transactions.csv";
        // print out a welcome screen for the user
        System.out.println("Welcome!");

        // start the app - meaning display your Home menu
        // method =< showHomeScreen
        showHomeScreen(); // this calls our showHome/Screen method which allows the user to start exploring the app


    } //  we are outside the main method

    //create the Home screen method - this screen is what a user sees anytime they are back at the main menu

    private static void showHomeScreen() {

        System.out.println("""
                
                                ==================================
                                          HOME MENU\s
                                ==================================
                                Choose an option by letter:
                               \s
                                D. Add Deposit\s
                                P. Make Payment
                                L. Ledger
                                X. Exit \
                """);

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
    //here we will have another switch statement for the Ledger
    public static void ledgerMenu(int ledger) {
        String selection = input.nextLine().trim().toUpperCase();
        switch (ledger) {
        }
            case "A":
        /* will display all entries */
                break;

            case "D":
                //displays only entries that are deposits
                break;

            case "P":
                //display only negative entries(payments)
                break;

            case "R":
                // NEW screen that lets user run pre-defined reports or run a custom search
                break;

            case "H":
                ;
                // go back to home screen
            default:
                System.out.println("Sorry invalid input");
        }



