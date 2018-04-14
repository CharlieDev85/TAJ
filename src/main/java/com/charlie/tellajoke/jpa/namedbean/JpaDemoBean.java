package com.charlie.tellajoke.jpa.namedbean;

import com.charlie.tellajoke.jpa.entity.Rating;
import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

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
        Rating rating = new Rating();
        rating.setRatingValue(1);
        
        try{
            userTransaction.begin();
            entityManager.persist(rating);
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
