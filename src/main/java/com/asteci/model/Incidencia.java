package com.asteci.model;

import java.util.Date;

public class Incidencia {
	
	private int id;
	private String nombreIncidencia;
	private String fecha;
	
	public Incidencia()
	{
		
	}
	public Incidencia(int id, String nombreIncidencia, String fecha) {
		super();
		this.id = id;
		this.nombreIncidencia = nombreIncidencia;
		this.fecha = fecha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreIncidencia() {
		return nombreIncidencia;
	}
	public void setNombreIncidencia(String nombreIncidencia) {
		this.nombreIncidencia = nombreIncidencia;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
