package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Movie;

public interface IMovieDAO extends JpaRepository<Movie, Long>{

}
