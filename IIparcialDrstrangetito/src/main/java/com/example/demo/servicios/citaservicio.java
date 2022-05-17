package com.example.demo.servicios;

import java.util.List;

import com.example.demo.entities.citas;



public interface citaservicio {
	public List<citas> obtenertodo();
	public citas encontraridcita(Long Id);
	public void eliminaridcita(Long Id);
	public void modificarcita(Long Id,citas Cita);
	public void crearcita(citas Cita);

}
