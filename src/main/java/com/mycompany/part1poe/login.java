/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe;

/**
 *
 * @author lab_services_student
 */
public class login {
    
    /*to actually make it work more like a log in system, from using w3schools and reeevaluating how I could change my code    
    */

    // Variables to store registered details
    private String savedUsername = "";
    private String savedPassword = "";
    private String savedPhone = "";

    // Checks if a user has already registered
    public boolean isRegistered() {

        if (savedUsername.equals("")) {
            return false;
        }

        return true;
    }

    // Saves registered user information
    public void registerUser(String username, String password, String phone) {

        savedUsername = username;
        savedPassword = password;
        savedPhone = phone;

    }

    // Checks login details
    public boolean loginUser(String username, String password) {

        if (username.equals(savedUsername)
                && password.equals(savedPassword)) {

            return true;
        }

        return false;
    }

    // Returns login message
    public String returnLoginStatus(boolean loginSuccess) {

        if (loginSuccess) {

            return "Login successful! Welcome back.";

        } else {

            return "Login failed. Incorrect username or password.";

        }
    }
}
    
    

