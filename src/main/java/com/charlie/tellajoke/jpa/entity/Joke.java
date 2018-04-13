package com.charlie.tellajoke.jpa.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JOKE")
public class Joke implements Serializable {

    @Id
    @Column(name = "JOKE_ID")
    private Long jokeId;

    @Column(name = "JOKE_TITLE")
    private String jokeTitle;

    @Column(name = "JOKE_BODY")
    private String jokeBody;

    @OneToMany(mappedBy="joke")    
    private Set<JokeCategory> jokesCategory;
    
    @OneToMany(mappedBy="joke")
    private Set<UserJoke> userJokes;

    public Long getJokeId() {
        return jokeId;
    }

    public void setJokeId(Long jokeId) {
        this.jokeId = jokeId;
    }

    public String getJokeTitle() {
        return jokeTitle;
    }

    public void setJokeTitle(String jokeTitle) {
        this.jokeTitle = jokeTitle;
    }

    public String getJokeBody() {
        return jokeBody;
    }

    public void setJokeBody(String jokeBody) {
        this.jokeBody = jokeBody;
    }

    public Set<JokeCategory> getJokesCategory() {
        return jokesCategory;
    }

    public void setJokesCategory(Set<JokeCategory> jokesCategory) {
        this.jokesCategory = jokesCategory;
    }

    public Set<UserJoke> getUserJokes() {
        return userJokes;
    }

    public void setUserJokes(Set<UserJoke> userJokes) {
        this.userJokes = userJokes;
    }
    
    

}
