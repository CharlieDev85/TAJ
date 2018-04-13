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
@Table(name = "RATING")
public class Rating implements Serializable {

    @Id
    @Column(name = "RATING_ID")
    private Long ratingId;

    @Column(name = "RATING_VALUE")
    private int ratingValue;

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

}
