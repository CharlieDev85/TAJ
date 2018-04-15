package com.charlie.tellajoke.jpa.namedbean;

import com.charlie.tellajoke.jpa.entity.UserJoke;
import com.charlie.tellajoke.jpa.entity.UserTaj;
import com.charlie.tellajoke.jpa.entity.Joke;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;

/**
 *
 * @author charlie
 */
@Named
@RequestScoped
public class JpaDemoBean {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Resource
    private UserTransaction userTransaction;
    
    public String updateDatabase(){
        String retval = "confirmation";
        UserTaj userTaj;
        Joke joke;
        UserJoke userJoke;
        userJoke = new UserJoke();
        
        try{
            userTransaction.begin();
            userTaj = entityManager.find(UserTaj.class, 1L);
            joke = entityManager.find(Joke.class, 1L);
            userJoke.setUserTaj(userTaj);
            userJoke.setJoke(joke);/
            entityManager.persist(userJoke);
            userTransaction.commit();
        }
        catch(HeuristicMixedException |
                HeuristicRollbackException |
                IllegalStateException |
                NotSupportedException |
                RollbackException |
                SecurityException |
                SystemException e){
        retval = "error";
        e.printStackTrace();
        }
        
        return retval;
    }
}
