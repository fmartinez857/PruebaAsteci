package com.asteci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.asteci.model.Incidencia;
import com.asteci.model.PruebaResponse;
import com.asteci.service.ServicioPrueba;



@RestController
@RequestMapping("/api")
public class ControllerAsteci {
	
	@Autowired
	ServicioPrueba servicio;
	
	
	@PostMapping("/agregarIncidencia")
	public PruebaResponse  crearIncidencia(@RequestBody Incidencia request) {
		
		return servicio.llenarIncidencias(request);
		
	}
	

}
