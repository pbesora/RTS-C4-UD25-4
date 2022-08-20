package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="movies")
public class Movie  {
 
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "age_restriction")
	private int ageRes;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Screen> screen;
	
	//Constructors
	
	public Movie() {
	
	}

	/**
	 * @param id
	 * @param name
	 * @param ageRes
	 * @param screen
	 */
	public Movie(Long id, String name, int ageRes, List<Screen> screen) {
		this.id = id;
		this.name = name;
		this.ageRes = ageRes;
		this.screen = screen;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ageRes
	 */
	public int getAgeRes() {
		return ageRes;
	}

	/**
	 * @param ageRes the ageRes to set
	 */
	public void setAgeRes(int ageRes) {
		this.ageRes = ageRes;
	}

	/**
	 * @return the screen
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Screen")
	public List<Screen> getScreen() {
		return screen;
	}

	/**
	 * @param screen the screen to set
	 */
	public void setScreen(List<Screen> screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", ageRes=" + ageRes + "]";
	}
}
	
	
	