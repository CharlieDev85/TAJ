package com.charlie.tellajoke.jpa.namedbean;

import com.charlie.tellajoke.jpa.entity.UserJoke;
import com.charlie.tellajoke.jpa.entity.UserRatingUserJoke;
import com.charlie.tellajoke.jpa.entity.UserTaj;
import com.charlie.tellajoke.jpa.entity.Rating;

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

        UserTaj voterUser;
        Rating rating;
        UserJoke userJoke;
        UserRatingUserJoke userRatingUserJoke = new UserRatingUserJoke();
        
        try{
            userTransaction.begin();

            voterUser = entityManager.find(UserTaj.class, 2L);
            rating = entityManager.find(Rating.class, 3L);
            userJoke = entityManager.find(UserJoke.class, 1L);
            userRatingUserJoke.setUserTaj(voterUser);
            userRatingUserJoke.setRating(rating);
            userRatingUserJoke.setUserJoke(userJoke);
            entityManager.persist(userRatingUserJoke);

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
