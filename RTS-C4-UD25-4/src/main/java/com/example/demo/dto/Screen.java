package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="screens")//en caso que la tabla sea diferente

public class Screen {
	
	//Attributes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "name")//no hace falta si se llama igual
		private String name;
		
		@ManyToOne
	    @JoinColumn(name="movie")
	    private Movie movie;

		//Constructors
		/**
		 * 
		 */
		public Screen() {
			
		}

		/**
		 * @param id
		 * @param name
		 * @param movie
		 */
		public Screen(Long id, String name, Movie movie) {
			this.id = id;
			this.name = name;
			this.movie = movie;
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
		 * @return the movie
		 */
		public Movie getMovie() {
			return movie;
		}

		/**
		 * @param movie the movie to set
		 */
		public void setMovie(Movie movie) {
			this.movie = movie;
		}

		@Override
		public String toString() {
			return "Screen [id=" + id + ", name=" + name + ", movie=" + movie + "]";
		}

		
}