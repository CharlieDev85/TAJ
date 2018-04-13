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
@Table(name = "USER_JOKE")
public class UserJoke implements Serializable {

    @Id
    @Column(name = "USER_JOKE_ID")
    private Long userJokeId;

    @ManyToOne
    @JoinColumn(name="USERTAJ_ID")
    private UserTaj userTaj;

    @ManyToOne
    @JoinColumn(name="JOKE_ID")
    private Joke joke;

    @Column(name = "AVG_RATING")
    private Double avgRating;

    @OneToMany(mappedBy="userJoke")
    private Set<UserRatingUserJoke> userRatingsUserJokes;

    public Long getUserJokeId() {
        return userJokeId;
    }

    public void setUserJokeId(Long userJokeId) {
        this.userJokeId = userJokeId;
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

    public Double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(Double avgRating) {
        this.avgRating = avgRating;
    }

    public Set<UserRatingUserJoke> getUserRatingsUserJokes() {
        return userRatingsUserJokes;
    }

    public void setUserRatingsUserJokes(Set<UserRatingUserJoke> userRatingsUserJokes) {
        this.userRatingsUserJokes = userRatingsUserJokes;
    }
    
    

}
