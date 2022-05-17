package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "citas")
@Entity
public class citas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date Fecha;
	@Column(name = "hora")
	@Temporal(TemporalType.TIME)
	private Date Hora;
	@Column(name = "idpoliza")
	private Long IdPoliza;
	@Column(name = "estado")
	private String EstadoP;
	@Column(name = "observaciones")
	
	private String Observacion;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Date getFecha() {
		return Fecha;
	}
	public void setFecha(Date fecha) {
		Fecha = fecha;
	}
	public Date getHora() {
		return Hora;
	}
	public void setHora(Date hora) {
		Hora = hora;
	}
	public Long getIdPoliza() {
		return IdPoliza;
	}
	public void setIdPoliza(Long idPoliza) {
		IdPoliza = idPoliza;
	}
	public String getEstadoP() {
		return EstadoP;
	}
	public void setEstadoP(String estadoP) {
		EstadoP = estadoP;
	}
	public String getObservacion() {
		return Observacion;
	}
	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

}
