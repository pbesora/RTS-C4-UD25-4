package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Movie;
import com.example.demo.service.MovieServiceImpl;


@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	MovieServiceImpl movieServiceImpl;
	
	@GetMapping("/movies")
	public List<Movie> listMovies(){
		return movieServiceImpl.listMovies();
	}
	
	@PostMapping("/movies")
	public Movie saveMovie(@RequestBody Movie movie) {
		
		return movieServiceImpl.saveMovie(movie);
	}
	
	@GetMapping("/movies/{id}")
	public Movie movieByID(@PathVariable(name="id") Long id) {
		
		Movie movie_byid= new Movie();
		
		movie_byid = movieServiceImpl.movieByID(id);
		
		System.out.println("Movie by ID: " + movie_byid);
		
		return movie_byid;
	}
	
	@PutMapping("/movies/{id}")
	public Movie updateMovie(@PathVariable(name="id")Long id,@RequestBody Movie movie) {
		
		Movie movie_selected= new Movie();
		Movie movie_updated= new Movie();
		
		movie_selected= movieServiceImpl.movieByID(id);
		
		movie_selected.setName(movie.getName());
		movie_selected.setAgeRes(movie.getAgeRes());
		
		movie_updated = movieServiceImpl.updateMovie(movie_selected);
		
		System.out.println("El movie updated es: "+ movie_updated);
		
		return movie_updated;
	}
	
	@DeleteMapping("/movies/{id}")
	public void deleteMovie(@PathVariable(name="id")Long id) {
		movieServiceImpl.deleteMovie(id);
	}
	
	
}