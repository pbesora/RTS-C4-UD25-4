package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Screen;


public interface IScreenService {
	//Metodos del CRUD
			public List<Screen> listScreens(); //Listar All 
			
			public Screen saveScreen(Screen screen);	//Guarda un video CREATE
			
			public Screen screenByID(Long id); //Leer datos de un video READ
			
			public Screen updateScreen(Screen screen); //Actualiza datos del video UPDATE
			
			public void deleteScreen(Long id);// Elimina el video DELETE

			
}
