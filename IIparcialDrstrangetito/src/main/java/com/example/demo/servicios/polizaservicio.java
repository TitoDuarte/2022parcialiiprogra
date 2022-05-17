package com.example.demo.servicios;

import java.util.List;

import com.example.demo.entities.polizas;



public interface polizaservicio {
	public List<polizas> encontarpolizas();
	public polizas encontrarporid(Long Id);
	public void eliminarporid(Long Id);
	public void modificarpoliza(Long Id, polizas Poliza);

}
