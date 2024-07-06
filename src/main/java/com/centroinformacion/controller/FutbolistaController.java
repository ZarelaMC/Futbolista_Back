package com.centroinformacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.centroinformacion.entity.Futbolista;
import com.centroinformacion.service.FutbolistaService;
import com.centroinformacion.util.AppSettings;

@RestController
@RequestMapping("/url/futbolista")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class FutbolistaController {

	@Autowired
	private FutbolistaService futbolistaService;
	
	@GetMapping("/futbolista")
	@ResponseBody
	public List<Futbolista> listaFutbolistas(){
		return futbolistaService.listaFutbolista();
	}
	
	
	@GetMapping("/futbolista/{var}")
	@ResponseBody
	public ResponseEntity<?> listaFutbolistasSegunId(@PathVariable("var") int idFutbolista){
		List<Futbolista> lista = null;
		if(idFutbolista == -1) {
			lista = futbolistaService.listaFutbolista();
		} else {
			lista = futbolistaService.listaFutbolistaId(idFutbolista);
		}
		return ResponseEntity.ok(lista);
	}
	
}
