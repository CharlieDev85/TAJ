package com.charlie.tellajoke.ejb;

import com.charlie.tellajoke.jpa.entity.UserTaj;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful
@LocalBean
public class UserDaoBean implements UserDao {



    @PersistenceContext
    private EntityManager entityManager;
    private String[] registeredUsernames;


    @Override
    public boolean alreadyExists(String username) {

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

        boolean contains = false;
        for (String registeredUsername : registeredUsernames) {
            if (registeredUsername.equals(username)) {
                contains = true;
                return contains;
            }
        }
        return contains;
    }

    @Override
    public void saveUserTaj(UserTaj customer) {

    }

    @Override
    public UserTaj getUserTaj(Long customerId) {
        return null;
    }

    @Override
    public void deleteUserTaj(UserTaj customer) {

    }

    public String getUsernameMessage(String username) {
        String usernameMessage = "that is OK";
        //System.out.println("username.length is: " + username.length());
        if (username.isEmpty()) {
            usernameMessage = "";
        } else if (username.length() < 3) {
            usernameMessage = "too short";
        } else if (alreadyExists(username)) {
            usernameMessage = "already exists";
        }
        return usernameMessage;
    }


}
