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
@Table(name = "JOKE_CATEGORY")
public class JokeCategory implements Serializable {

    @Id
    @Column(name = "JOKE_CATEGORY_ID")
    private Long jokeCategoryId;

    @ManyToOne
    @JoinColumn(name="JOKE_ID")
    private Joke joke;

    @ManyToOne
    @JoinColumn(name="CATEGORY_ID")
    private Category category;

    public Long getJokeCategoryId() {
        return jokeCategoryId;
    }

    public void setJokeCategoryId(Long jokeCategoryId) {
        this.jokeCategoryId = jokeCategoryId;
    }

    public Joke getJoke() {
        return joke;
    }

    public void setJoke(Joke joke) {
        this.joke = joke;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
