/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1poe;

import java.util.regex.Pattern;

/**
 *
 * @author lab_services_student
 */
//check information
public class Checking {
    
       public boolean checkPasswordComplexity(String password){
        if (password.length() < 8){
            return false;
        }
          
         boolean hasUpper = false;
          boolean hasDigit = false;
          boolean hasSpecial = false;
          
          for (int i  = 0; i < password.length(); i++){
              char ch = password.charAt(i);
              if (Character.isUpperCase(ch)) {
                  hasUpper =true;
              }
              else if (Character.isDigit(ch)){
                  hasDigit = true;
              }
              else if (!Character.isLetterOrDigit(ch)){
                  hasSpecial = true;
                  
              }
          }
  return hasUpper&& hasDigit && hasSpecial;
                        
        }
        public boolean  checkCellPhoneNumber(String phone_number){
            String pattern= "^\\+27\\d{9}$";
            return Pattern.matches(pattern,phone_number);
            

}

public boolean checkUserName(String username){
    // To say it contains an underscore (previous exercises and w3schools)
    //also, char is a data type for character, as in the special character
    if (!username.contains("_") ||username.length() <= 5 ){
        return false; // if the username doesn't contain _ and is higher than five return false
    }
    for (int i = 0; i < username.length(); i++) { //incrementing, checking each character one by one
        char ch = username.charAt(i);
 if (Character.isDigit(ch)) { //if one of the characters are numbers it's gonna come back false
            return false;
        }
   if (!Character.isLetter(ch) && ch != '_') {
            return false;
        }
    }
    // Check each character
    for (int i = 0; i < username.length(); i++) {
        char ch = username.charAt(i);

        
        if (!Character.isLetter(ch) && ch != '_') {
            return false;
        }
    }

    return true; 
}
}


