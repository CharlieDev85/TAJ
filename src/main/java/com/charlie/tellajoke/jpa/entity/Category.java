package com.charlie.tellajoke.jpa.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    @Id
    @Column(name = "CATEGORY_ID")
    private Long categoryId;

    @Column(name = "CATEGORY_NAME")
    private String categoryName;
    
    @OneToMany(mappedBy = "category")
    private Set<JokeCategory> jokesCategory;

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Set<JokeCategory> getJokesCategory() {
        return jokesCategory;
    }

    public void setJokesCategory(Set<JokeCategory> jokesCategory) {
        this.jokesCategory = jokesCategory;
    }
    

}
