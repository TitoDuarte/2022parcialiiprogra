package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "pacientes")
@Entity
public class pacientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "firstname")
	private String primernombre;
	@Column(name = "secondname")
	private String segundonombre;
	@Column(name = "firstsurname")
	private String primerapellido;
	@Column(name = "secondsurname")
	private String segundoapellido;
	@Column(name = "age")
	private Long edad;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getPrimernombre() {
		return primernombre;
	}
	public void setPrimernombre(String primernombre) {
		this.primernombre = primernombre;
	}
	public String getSegundonombre() {
		return segundonombre;
	}
	public void setSegundonombre(String segundonombre) {
		this.segundonombre = segundonombre;
	}
	public String getPrimerapellido() {
		return primerapellido;
	}
	public void setPrimerapellido(String primerapellido) {
		this.primerapellido = primerapellido;
	}
	public String getSegundoapellido() {
		return segundoapellido;
	}
	public void setSegundoapellido(String segundoapellido) {
		this.segundoapellido = segundoapellido;
	}
	public Long getEdad() {
		return edad;
	}
	public void setEdad(Long edad) {
		this.edad = edad;
	}
	
}
