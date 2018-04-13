
package com.charlie.tellajoke.jpa.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JOKE")
public class Joke implements Serializable
{
	@Id
 	@Column(name = "JOKE_ID")
 	private Long jokeId;

 	@Column(name = "JOKE_TITLE")
 	private String jokeTitle;

 	@Column(name = "JOKE_BODY")
 	private String jokeBody;

}
