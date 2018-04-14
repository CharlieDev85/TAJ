package com.charlie.tellajoke.jpa.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author charlie
 */
@Entity
@Table(name = "RATING")
public class Rating implements Serializable {

    @Id
    @Column(name = "RATING_ID")
    private Long ratingId;

    @Column(name = "RATING_NUM")
    private int ratingValue;
    
    @OneToMany(mappedBy="rating")
    private Set<UserRatingUserJoke> userRatingsUserJokes;

    public Long getRatingId() {
        return ratingId;
    }

    public void setRatingId(Long ratingId) {
        this.ratingId = ratingId;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    public Set<UserRatingUserJoke> getUserRatingsUserJokes() {
        return userRatingsUserJokes;
    }

    public void setUserRatingsUserJokes(Set<UserRatingUserJoke> userRatingsUserJokes) {
        this.userRatingsUserJokes = userRatingsUserJokes;
    }

}
