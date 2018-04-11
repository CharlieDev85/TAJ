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
        
        Type type1 = new Type();
        type1.setTypeId(1L);
        type1.setTypeName("Regular");
        
        Type type2 = new Type();
        type2.setTypeId(2L);
        type2.setTypeName("Administrator");
        
        Type type3;
        
        try{
            userTransaction.begin();
            entityManager.persist(type1);
            entityManager.persist(type2);
//            type3 = entityManager.find(Type.class, 2L);
//            type3.setTypeName("Admin");
//            entityManager.persist(type2);
//            entityManager.remove(type1);
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
