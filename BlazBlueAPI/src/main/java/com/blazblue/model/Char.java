package com.blazblue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="characters", schema="blazblue")
public class Char {


	@Id
	private int id;
	@Column(name="name")
	private String name;
	
	@Column(name="image_link")
	private String imageLink;
	
	public Char(int id, String name, String imageLink) {
		super();
		this.id = id;
		this.name = name;
		this.imageLink = imageLink;
	}

	
	public Char() {
		super();
		this.id = 0;
		this.name = "";
		this.imageLink = "";
	}

	@Override
	public String toString() {
		return "Chars [id=" + id + ", name=" + name + ", imageLink=" + imageLink + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
}