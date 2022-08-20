package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMovieDAO;
import com.example.demo.dto.Movie;

@Service
public class MovieServiceImpl implements IMovieService{

	@Autowired
	IMovieDAO iMovieDAO;

	@Override
	public List<Movie> listMovies() {
		return iMovieDAO.findAll();
	}

	@Override
	public Movie saveMovie(Movie movie) {
		return iMovieDAO.save(movie);
	}

	@Override
	public Movie movieByID(Long id) {
		return iMovieDAO.findById(id).get();
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return iMovieDAO.save(movie);
	}

	@Override
	public void deleteMovie(Long id) {
		iMovieDAO.deleteById(id);
		
	}

}
