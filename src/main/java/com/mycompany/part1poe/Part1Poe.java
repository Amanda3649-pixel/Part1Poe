package com.mycompany.part1poe;

import java.util.Scanner;

public class Part1Poe {
    
    
    //code rewritten to make it simpler 

    public static void main(String[] args) {

        Scanner zaika = new Scanner(System.in);

        //calling the cmethods in different classes
        login login = new login();
        Checking check = new Checking();

        System.out.println("Hello User! Welcome to the chat app! Please enter one of the following numbers:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        
        //for user input and int cause we want the number
        int option = zaika.nextInt();
        zaika.nextLine();

       //if statement for if they choose 1
        if (option == 1) {

            if (!login.isRegistered()) {

                System.out.println("No user registered yet.");
                System.out.println("Please register first.");

            }

        }

        // for if the user chooses to register the format is from programming etra classes
        if (option == 2 || !login.isRegistered()) {

            //  getting and checking the username
            System.out.println("Please enter your username!");
            String name = zaika.nextLine();
            boolean isValid = check.checkUserName(name);
            while (!isValid) {
                System.out.println("Username is incorrectly formatted.");
                System.out.println("Try again:");
                name = zaika.nextLine();
                isValid = check.checkUserName(name);
            }

            // getting and checking the phone number
            System.out.println("Please enter your phone number:");
            String phone_number = zaika.nextLine();
            isValid = check.checkCellPhoneNumber(phone_number);
            while (!isValid) {
                System.out.println("Cellphone number is incorrect.");
                System.out.println("Try again:");
                phone_number = zaika.nextLine();
                isValid = check.checkCellPhoneNumber(phone_number);
            }

            // getting and checking the password
            System.out.println("Enter password:");
            String password = zaika.nextLine();
            isValid = check.checkPasswordComplexity(password);
            while (!isValid) {
                System.out.println("Password is incorrect.");
                System.out.println("Try again:");
                password = zaika.nextLine();
                isValid = check.checkPasswordComplexity(password);
            }

            // to save the user  login info
            login.registerUser(name, password, phone_number);
            System.out.println("Registration successful!");
        }

        // To continue the login process
        System.out.println("====PLEASE  LOGIN ====");
        System.out.println("Enter username:");
        String loginUsername = zaika.nextLine();
        System.out.println("Enter password:");
        String loginPassword = zaika.nextLine();
        boolean loggedIn = login.loginUser(loginUsername, loginPassword);
        System.out.println(login.returnLoginStatus(loggedIn));
    }
}