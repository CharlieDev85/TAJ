package com.charlie.tellajoke.ejb;

import com.charlie.tellajoke.jpa.entity.UserTaj;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Stateful
@LocalBean
public class UserDaoBean implements UserDao {



    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public boolean alreadyExists(String username) {
        return this.foundActiveUser(username);
    }

    @Override
    public void saveUserTaj(UserTaj userTaj) {
        entityManager.persist(userTaj);
    }

    @Override
    public UserTaj getUserTaj(Long userTajId) {
        return null;
    }

    @Override
    public void deleteUserTaj(UserTaj userTaj) {

    }


    public  boolean foundActiveUser(String usrnm) {
           boolean found = false;
        String username;

        try {
            Query query = entityManager.createQuery(
                            "SELECT u.username FROM UserTaj AS u WHERE u.username "
                                    + "= :name");

            query.setParameter("name", usrnm);

            username = (String)query.getSingleResult();
            if(!username.isEmpty()){
                found = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
            //System.out.println("user is: " + userFound.getUsername());
            //return found;
        }
        return found;
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
