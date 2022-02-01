package com.thoughtfocus.spring.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="movies")
public class MovieDTO implements Serializable{
	
	@Id
	private int id;
	private String name;
	@Column(name="year_released")
	private int yearreleased;
	private String language;
	private long budget;
	
	
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
	public int getYearreleased() {
		return yearreleased;
	}
	public void setYearreleased(int yearreleased) {
		this.yearreleased = yearreleased;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", yearreleased=" + yearreleased + ", language=" + language
				+ ", budget=" + budget + "]";
	}
	
	
	
	

}
