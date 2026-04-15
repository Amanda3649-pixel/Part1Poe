/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1poe;

import  java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author lab_services_student
 */
public class Part1Poe {   
    
        



    public static void main(String[] args) {
        
        //scanner to tak in user input.
        //"zaika" used because it's easier for me to remember
         Scanner zaika = new Scanner(System.in);
       //prompting the user to enter input (from class)
        System.out.println("Hello User! Welcome to the chat app!");
         System.out.println ("Please enter your username!");
         //string input that will be read (from w3schools)
         //https://www.w3schools.com/java/java_user_input.asp
         String name = zaika.nextLine(); //line for string
         //there was an error with my boolean is valid line. I went to google asking about an issue with a can not call a non static from a static
         //https://www.google.com/search?q=non+static+method+can+not+be+referenced+from+a+static+context&oq=non+static+method+can+not+be+referenced+from+a+static+context&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCzE4MzAwOGowajE1qAIIsAIB&sourceid=chrome&ie=UTF-8
         Checking check = new Checking();         
          Boolean isValid = check.checkUserName(name);
          //while loop from class about loops
          while (!isValid){
            System.out.println("Nope! That's an invalid username! Check that your username is 5 characters at most, and hasat least one underscore ");
               System.out.println ("Please enter your username!: ");
                 name = zaika.nextLine(); //line for string; (was shown by a classmate)
                 isValid = check.checkUserName(name); //this is to update the boolean
          }
          System.out.println("Nice name " +  name );
          System.out.println("Next Step! Please enter your phone number!: ");     
         //https://www.w3schools.com/java/java_user_input.asp
        String phone_number = zaika.nextLine(); //int for numbers(whole numbers, double would be used for numbers with decimals
        isValid = check.checkCellPhoneNumber(phone_number);
        while(!isValid){
            System.out.println("Nope! Make sure there's an international code and that your number is exactly 10 numbers, 'kay!");
            System.out.println("Try agaibn!:");
            phone_number = zaika.nextLine();
            isValid = check.checkCellPhoneNumber(phone_number);
        }
        System.out.println("Last thing now! Enter a unique password with one uppercase letter, one lowercase letter, a special character and at least be 8 characters long:");
        String password =zaika.next();
        isValid =check.checkPasswordComplexity(password);
        while(!isValid){
              System.out.println("Try again!:");
             password =zaika.next();
        isValid =check.checkPasswordComplexity(password);
        }
          System.out.println("Logged in!");
         
       
       
    }

}

