package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PolizaDao;

import com.example.demo.entities.polizas;

@Service
public class polizaservicioimple implements polizaservicio {
	@Autowired
	PolizaDao polizadao;

	@Override
	public List<polizas> encontarpolizas() {
		return (List<polizas>) polizadao.findAll();
	}

	@Override
	public polizas encontrarporid(Long Id) {

		return polizadao.findById(Id).orElse(null);
	}

	@Override
	public void eliminarporid(Long Id) {
		if(polizadao.existsById(Id)) {
			polizadao.deleteById(Id);
			}
		
	}

	@Override
	public void modificarpoliza(Long Id, polizas Poliza) {
		if(polizadao.existsById(Id)) {
			Poliza.setId(Id);
			polizadao.save(Poliza);
		}
	
		
	}
	
}

