package com.charlie.tellajoke.ejb;

import com.charlie.tellajoke.jpa.entity.UserTaj;

import javax.ejb.Local;

@Local
public interface UserDao {

    public boolean alreadyExists(String username);
    public void saveUserTaj(UserTaj customer);
    public UserTaj getUserTaj(Long customerId);
    public void deleteUserTaj(UserTaj customer);

}
