package com.centroinformacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.centroinformacion.entity.Posicion;
import com.centroinformacion.service.PosicionService;
import com.centroinformacion.util.AppSettings;

@RestController
@RequestMapping("/url/util")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class UtilController {

	
	@Autowired
	private PosicionService posicionService;
	
	@GetMapping("/listaPosicion")
	@ResponseBody
	public List<Posicion> listaPosiciones(){
		return posicionService.listarPosicion();
	}
}
