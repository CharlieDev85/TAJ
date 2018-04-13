package com.charlie.tellajoke.jpa.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author charlie
 */
@Entity
@Table(name = "USER_JOKE")
public class UserJoke implements Serializable {

    @Id
    @Column(name = "USER_JOKE_ID")
    private Long userJokeId;

    
    private UserTaj userTaj;


    private Joke joke;

    @Column(name = "AVG_RATING")
    private Long avgRating;

    public Long getUserJokeId() {
        return userJokeId;
    }

    public void setUserJokeId(Long userJokeId) {
        this.userJokeId = userJokeId;
    }

    public Long getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Long avgRating) {
        this.avgRating = avgRating;
    }

    public UserTaj getUserTaj() {
        return userTaj;
    }

    public void setUserTaj(UserTaj userTaj) {
        this.userTaj = userTaj;
    }



    public Joke getJoke() {
        return joke;
    }

    public void setJoke(Joke joke) {
        this.joke = joke;
    }
    
    

}
