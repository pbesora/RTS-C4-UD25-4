package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Movie;

public interface IMovieService {

	//Metodos del CRUD
		public List<Movie> listMovies(); //Listar All 
		
		public Movie saveMovie(Movie movie);	//Guarda un cliente CREATE
		
		public Movie movieByID(Long id); //Leer datos de un cliente READ
		
		public Movie updateMovie(Movie movie); //Actualiza datos del cliente UPDATE
		
		public void deleteMovie(Long id);// Elimina el cliente DELETE
}
