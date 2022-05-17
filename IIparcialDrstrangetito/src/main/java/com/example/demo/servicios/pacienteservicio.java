package com.example.demo.servicios;

import java.util.List;

import com.example.demo.entities.pacientes;


public interface pacienteservicio {
	public List<pacientes> encontrartodo();
	public pacientes encontraridpaciente(Long Id);
	public void eliminaridpaciente(Long Id);
	public void modificarpaciente(Long Id, pacientes Paciente);
	

}
