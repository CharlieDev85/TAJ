/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jsfjpa;

import com.charlie.tellajoke.ejb.UserDaoBean;
import com.charlie.tellajoke.jpa.entity.UserTaj;
import com.charlie.tellajoke.jpa.entity.Type;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 *
 * @author charlie
 */
@Named
@RequestScoped
public class UserController implements Serializable {

    @EJB
    private UserDaoBean userDaoBean;

    private UserTaj userTaj;
    private String usernameMessage;

    private String username;
    private String email;
    private String password1;
    private String password2;
    private Type type;

    public UserController(){
        userTaj = new UserTaj();
        //userDaoBean = new UserDaoBean();
        username = "";
    }

    public String getUsernameMessage(){
        this.usernameMessage = userDaoBean.getUsernameMessage(this.username);
          return this.usernameMessage;
    }


    public UserTaj getUserTaj() {
        return userTaj;
    }

    public void setUserTaj(UserTaj userTaj) {
        this.userTaj = userTaj;
    }

    public void setUsernameMessage(String usernameMessage) {
        this.usernameMessage = usernameMessage;
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
