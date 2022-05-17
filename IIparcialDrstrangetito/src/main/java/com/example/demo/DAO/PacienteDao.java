package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.pacientes;




public interface PacienteDao extends CrudRepository<pacientes,Long> {

}
