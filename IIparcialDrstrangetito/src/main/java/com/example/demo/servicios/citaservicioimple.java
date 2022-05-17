package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.CitaDao;
 
import com.example.demo.entities.citas;
@Service
public class citaservicioimple implements citaservicio {
	@Autowired
	CitaDao citadao;

	@Override
	public List<citas> obtenertodo() {
		 
		return (List<citas>) citadao.findAll();
	}

	@Override
	public citas encontraridcita(Long Id) {
 
		return citadao.findById(Id).orElse(null);
	}

	@Override
	public void eliminaridcita(Long Id) {
		if(citadao.existsById(Id)) {
			citadao.deleteById(Id);
			}
		
	}

	@Override
	public void modificarcita(Long Id, citas Cita) {
		if(citadao.existsById(Id)) {
			Cita.setId(Id);
			citadao.save(Cita);}
		
	}

	@Override
	public void crearcita(citas Cita) {
		citadao.save(Cita);
		
	}

}
