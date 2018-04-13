/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.charlie.tellajoke.jpa.namedbean;

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
import com.charlie.tellajoke.jpa.entity.Type;
import com.charlie.tellajoke.jpa.entity.UserTaj;

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
        Type type;
        UserTaj userTaj = new UserTaj();
        userTaj.setUserTajId(1L);
        userTaj.setUsername("kike");
        userTaj.setEmail("kike@gmail.com");
        userTaj.setPassword("mypass");
        
        UserTaj userTaj2 = new UserTaj();
        userTaj2.setUserTajId(2L);
        userTaj2.setUsername("kike55");
        userTaj2.setEmail("kikeasdf@gmail.com");
        userTaj2.setPassword("mypassff");
        
        
            
        try{
            userTransaction.begin();
            type = entityManager.find(Type.class, 1L);
            userTaj.setType(type);
            userTaj2.setType(type);
            entityManager.persist(userTaj);
            entityManager.persist(userTaj2);
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
