/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 *
 * @author charlie
 */
@Named
@RequestScoped
public class User implements Serializable {

    private String username;
    private String email;
    private String password1;
    private String password2;
    private String usernameMessage;
    private final String[] registeredUsernames;

    public User() {
        registeredUsernames = new String[10];
        registeredUsernames[0] = "charlie";
        registeredUsernames[1] = "charlie8";
        registeredUsernames[2] = "kike8";
        registeredUsernames[3] = "marroq";
        registeredUsernames[4] = "marroq8";
        registeredUsernames[5] = "developer";
        registeredUsernames[6] = "developer8";
        registeredUsernames[7] = "coder8";
        registeredUsernames[8] = "coder";
        registeredUsernames[9] = "regularuser";
        username = "";
    }

    public String getUsernameMessage() {
        usernameMessage = "that is OK";
        System.out.println("username.length is: " + username.length());
        if (username.isEmpty()) {
            usernameMessage = "";
        } else if (username.length() < 3) {
            usernameMessage = "too short";
        } else if (alreadyExists(username)) {
            usernameMessage = "already exists";
        }
        return usernameMessage;
    }

    public boolean alreadyExists(String username) {
        boolean contains = false;
        for (String registeredUsername : registeredUsernames) {
            if (registeredUsername.equals(username)) {
                contains = true;
                return contains;
            }
        }
        return contains;
    }

    public void setUsernameMessage(String usernameMessage) {
        this.usernameMessage = usernameMessage;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
