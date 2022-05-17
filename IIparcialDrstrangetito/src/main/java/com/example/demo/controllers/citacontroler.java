package com.example.demo.controllers;

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

import com.example.demo.entities.citas;
import com.example.demo.servicios.citaservicio;

@RestController
@RequestMapping("/cita")
public class citacontroler {
	@Autowired
	citaservicio citaser;
	@GetMapping
	public List<citas> listdates(){
		return citaser.obtenertodo();
	
		
	}
	@GetMapping(value = "/{Id}")

	public citas obtener(@PathVariable Long Id) {
		return citaser.encontraridcita(Id);
	}
	
	@DeleteMapping (value = "/{Id}")
	public void eliminarc(@PathVariable Long Id) {
		
	
		citaser.eliminaridcita(Id);
	}
	
	@PutMapping(value = "/{Id}")
	public void modificarc(@PathVariable Long Id, @RequestBody citas cita) {
	
		citaser.modificarcita(Id, cita);
	
	}
	
	@PostMapping
	public void crearcita(@RequestBody citas cita) {
	
		citaser.crearcita(cita);
		
	}
	

}
