package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.polizas;
import com.example.demo.servicios.polizaservicio;

@RestController
@RequestMapping("/poliza")
public class polizacontroler {
	@Autowired
	polizaservicio polizaser;
	@GetMapping
	public List<polizas> listap(){
		return polizaser.encontarpolizas();
		
	}
	@GetMapping(value = "/{Id}")

	public polizas obtenerp(@PathVariable Long Id) {
		return polizaser.encontrarporid(Id);
	}
	@DeleteMapping (value = "/{Id}")
	public void eliminarp(@PathVariable Long Id) {
	
		polizaser.eliminarporid(Id);
		
	}
	
	@PutMapping(value = "/{Id}")
	public void modificarp(@PathVariable Long Id, @RequestBody polizas poliza) {
		polizaser.modificarpoliza(Id, poliza);
		
		
	}

	
	

}
