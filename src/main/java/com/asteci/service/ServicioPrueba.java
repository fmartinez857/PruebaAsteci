package com.asteci.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.asteci.model.Incidencia;
import com.asteci.model.PruebaResponse;

public class ServicioPrueba {
	
	
	
	public PruebaResponse llenarIncidencias(Incidencia inc ) {
		
		PruebaResponse resp =  new PruebaResponse();
		
		List<Incidencia> incidencias = new ArrayList<>();
		inc.getId();
		inc.getNombreIncidencia();
		inc.getFecha();
		incidencias.add(inc);
		resp.setListIncidencias(incidencias);
		return resp;
		
		
	}
	
	public List<Incidencia> consultarIncidencias() {
		
		List<Incidencia> incidencias;
		
		
		
	}

}
