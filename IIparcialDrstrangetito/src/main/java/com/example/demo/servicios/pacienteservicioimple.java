package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.PacienteDao;
 
import com.example.demo.entities.pacientes;
@Service
public class pacienteservicioimple implements pacienteservicio{
	@Autowired
	PacienteDao pacientedao; 
	@Override
	public List<pacientes> encontrartodo() {
 
		return (List<pacientes>) pacientedao.findAll();
	}

	@Override
	public pacientes encontraridpaciente(Long Id) {
		 
		return pacientedao.findById(Id).orElse(null);
	}

	@Override
	public void eliminaridpaciente(Long Id) {
		if(pacientedao.existsById(Id)) {
		pacientedao.deleteById(Id);
	
		}
		
	}

	@Override
	public void modificarpaciente(Long Id, pacientes Paciente) {
		if(pacientedao.existsById(Id)) {
			Paciente.setId(Id);
			pacientedao.save(Paciente);
		}
		
	}

}
