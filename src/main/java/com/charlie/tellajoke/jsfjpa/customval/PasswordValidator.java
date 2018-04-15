/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsfjpa.customval;

/**
 * Used to validate a password
 * 
 * @author charlie
 */
public class PasswordValidator {
    
    /**
     * It checks weather a password is valid or not.
     * 
     * @param password 
     * @return 
     */
    public static boolean isPassword(final String password) 
   { 
      if (password != null) 
      { 
         return password.matches("^[a-zA-Z0-9!@#$%^&*\\(\\)_\\+=-]{8,}$"); 
      } 
 
      return false; 
   } 
    
    public static boolean passwordConfirmed(String password1, String password2){
        return password1.equals(password2);
    }
}
