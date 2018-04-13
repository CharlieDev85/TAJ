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
@Table(name = "USERRATING_USERJOKE")
public class UserRatingUserJoke implements Serializable {

    @Id
    @Column(name = "USERRATING_USERJOKE_ID")
    private Long userRatingUserJokeId;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "RATING_ID")
    private Long ratingId;

    @Column(name = "USER_JOKE_ID")
    private Long userJokeId;

    public Long getUserRatingUserJokeId() {
        return userRatingUserJokeId;
    }

    public void setUserRatingUserJokeId(Long userRatingUserJokeId) {
        this.userRatingUserJokeId = userRatingUserJokeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public Long getUserJokeId() {
        return userJokeId;
    }

    public void setUserJokeId(Long userJokeId) {
        this.userJokeId = userJokeId;
    }

}
