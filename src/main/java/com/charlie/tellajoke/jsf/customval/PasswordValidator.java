/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsf.customval;

/**
 * Used to validate a password
 * 
 * @author charlie
 */
public class PasswordValidator {
    
    
    public static boolean isPassword(final String password) 
   { 
      if (password != null) 
      { 
         return password.matches("^[a-zA-Z0-9!@#$%^&*\\s\\(\\)_\\+=-]{8,}$"); 
      } 
 
      return false; 
   } 
}
