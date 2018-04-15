package com.charlie.tellajoke.jpa.entity;

import java.io.Serializable;
import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author charlie
 */

@Entity
@Table(name = "USERTAJ")
public class UserTaj implements Serializable {

    @Id
    @Column(name = "USERTAJ_ID")
    private Long userTajId;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;
    
    @ManyToOne
    @JoinColumn(name="TYPE_ID")
    private Type type;

    @OneToMany(mappedBy="userTaj")    
    private Set<UserJoke> userJokes;
    
    @OneToMany(mappedBy="userTaj")
    private Set<UserRatingUserJoke> userRatingsUserJokes;

    public Long getUserTajId() {
        return userTajId;
    }

    public void setUserTajId(Long userTajId) {
        this.userTajId = userTajId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<UserJoke> getUserJokes() {
        return userJokes;
    }

    public void setUserJokes(Set<UserJoke> userJokes) {
        this.userJokes = userJokes;
    }

    public Set<UserRatingUserJoke> getUserRatingsUserJokes() {
        return userRatingsUserJokes;
    }

    public void setUserRatingsUserJokes(Set<UserRatingUserJoke> userRatingsUserJokes) {
        this.userRatingsUserJokes = userRatingsUserJokes;
    }
    
    
    
}
