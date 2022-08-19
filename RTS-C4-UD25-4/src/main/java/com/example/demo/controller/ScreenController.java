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

import com.example.demo.dto.Screen;
import com.example.demo.service.ScreenServiceImpl;



@RestController
@RequestMapping("/api")
public class ScreenController {

	@Autowired
	ScreenServiceImpl screenServideImpl;
	
	@GetMapping("/screens")
	public List<Screen> listScreens(){
		return screenServideImpl.listScreens();
	}
	
	@PostMapping("/screens")
	public Screen saveScreens(@RequestBody Screen screen) {
		
		return screenServideImpl.saveScreen(screen);
	}
	
	@GetMapping("/screens/{id}")
	public Screen screenByID(@PathVariable(name="id") Long id) {
		
		Screen screen_xid= new Screen();
		
		screen_xid=screenServideImpl.screenByID(id);
		
		System.out.println("Screen XID: "+screen_xid);
		
		return screen_xid;
	}
	
	@PutMapping("/screens/{id}")
	public Screen updateScreen(@PathVariable(name="id")Long id,@RequestBody Screen screen) {
		
		Screen screen_selected = new Screen();
		Screen screen_updated = new Screen();
		
		screen_selected= screenServideImpl.screenByID(id);
		
		screen_selected.setName(screen.getName());
		screen_selected.setMovie(screen.getMovie());
		
		screen_updated = screenServideImpl.updateScreen(screen_selected);
		
		System.out.println("El screen actualizado es: " + screen_updated);
		
		return screen_updated;
	}
	
	@DeleteMapping("/screens/{id}")
	public void deleteScreen(@PathVariable(name="id")Long id) {
		screenServideImpl.deleteScreen(id);
	}
	
}