package com.charlie.tellajoke.jpa.entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author charlie
 */
@Entity
@Table(name = "USER_RATING_USERJOKE")
public class UserRatingUserJoke implements Serializable {

    @Id
    @Column(name = "USER_RATING_USERJOKE_ID")
    private Long userRatingUserJokeId;

    @ManyToOne
    @JoinColumn(name="USERTAJ_ID")
    private UserTaj userTaj;
    
    @ManyToOne
    @JoinColumn(name="RATING_ID")
    private Rating rating;
    
    @ManyToOne
    @JoinColumn(name="USER_JOKE_ID")
    private UserJoke userJoke;

    public Long getUserRatingUserJokeId() {
        return userRatingUserJokeId;
    }

    public void setUserRatingUserJokeId(Long userRatingUserJokeId) {
        this.userRatingUserJokeId = userRatingUserJokeId;
    }

    public UserTaj getUserTaj() {
        return userTaj;
    }

    public void setUserTaj(UserTaj userTaj) {
        this.userTaj = userTaj;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public UserJoke getUserJoke() {
        return userJoke;
    }

    public void setUserJoke(UserJoke userJoke) {
        this.userJoke = userJoke;
    }
    

    
}
