package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IScreenDAO;
import com.example.demo.dto.Screen;

@Service
public class ScreenServiceImpl implements IScreenService{

	@Autowired
	IScreenDAO iScreenDAO;
	
	@Override
	public List<Screen> listScreens() {
		return iScreenDAO.findAll();
	}

	@Override
	public Screen saveScreen(Screen screen) {
		return iScreenDAO.save(screen);
	}

	@Override
	public Screen screenByID(Long id) {
		return iScreenDAO.findById(id).get();
	}

	@Override
	public Screen updateScreen(Screen screen) {
		return iScreenDAO.save(screen);
	}

	@Override
	public void deleteScreen(Long id) {
		iScreenDAO.deleteById(id);
		
	}

}
