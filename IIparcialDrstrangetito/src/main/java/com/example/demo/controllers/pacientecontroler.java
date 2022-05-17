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

import com.example.demo.entities.pacientes;
import com.example.demo.servicios.pacienteservicio;

@RestController
@RequestMapping("/paciente")
public class pacientecontroler {
	@Autowired
	pacienteservicio pacienteser;
	@GetMapping
	public List<pacientes> listapac(){
		return pacienteser.encontrartodo();
		
	}
	@GetMapping(value = "/{Id}")

	public pacientes obtenerpac(@PathVariable Long Id) {
		return pacienteser.encontraridpaciente(Id);
	}
	@DeleteMapping (value = "/{Id}")
	public void eliminarpac(@PathVariable Long Id) {
		 
		pacienteser.eliminaridpaciente(Id);
		 
	}
	
	@PutMapping(value = "/{Id}")
	public void modificarpa(@PathVariable Long Id, @RequestBody pacientes Paciente) {
		 
		
		pacienteser.modificarpaciente(Id, Paciente);
	 
	}

}
