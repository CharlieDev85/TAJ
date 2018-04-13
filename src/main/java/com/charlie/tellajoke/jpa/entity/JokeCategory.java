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
@Table(name = "JOKE_CATEGORY")
public class JokeCategory implements Serializable {

    @Id
    @Column(name = "JOKE_CATEGORY_ID")
    private Long jokeCategoryId;

    @Column(name = "JOKE_ID")
    private Long jokeId;

    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    public Long getJokeCategoryId() {
        return jokeCategoryId;
    }

    public void setJokeCategoryId(Long jokeCategoryId) {
        this.jokeCategoryId = jokeCategoryId;
    }

    public Long getJokeId() {
        return jokeId;
    }

    public void setJokeId(Long jokeId) {
        this.jokeId = jokeId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

}
