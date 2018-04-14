package com.charlie.tellajoke.jpa.namedbean;

import com.charlie.tellajoke.jpa.entity.Category;
import com.charlie.tellajoke.jpa.entity.Joke;
import com.charlie.tellajoke.jpa.entity.JokeCategory;
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
        
        Category category1;
        Category category2;
        Joke joke;
        JokeCategory jokeCategory1 = new JokeCategory();
        JokeCategory jokeCategory2 = new JokeCategory();
         
        try{
            
                   
            userTransaction.begin();
            
            category1 = entityManager.find(Category.class, 1L);
            category2 = entityManager.find(Category.class, 2L);
            joke = entityManager.find(Joke.class, 1L);
            
            jokeCategory1.setCategory(category1);
            jokeCategory1.setJoke(joke);
            
            jokeCategory2.setCategory(category2);
            jokeCategory2.setJoke(joke);
            
            entityManager.persist(jokeCategory1);
            entityManager.persist(jokeCategory2);

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
