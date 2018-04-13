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
@Table(name = "TYPE")
public class Type implements Serializable {

    @Id
    @Column(name = "TYPE_ID")
    private Long typeId;
    
    @Column(name="TYPE_NAME")
    private String typeName;
    
    @OneToMany(mappedBy="type")
    private Set<UserTaj> usersTaj;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Set<UserTaj> getUsersTaj() {
        return usersTaj;
    }

    public void setUsersTaj(Set<UserTaj> usersTaj) {
        this.usersTaj = usersTaj;
    }

    
}
