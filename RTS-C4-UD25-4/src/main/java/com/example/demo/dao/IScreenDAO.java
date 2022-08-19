package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Screen;


public interface IScreenDAO extends JpaRepository<Screen, Long>{

}
