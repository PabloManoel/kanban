package br.com.java.kanban.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.java.kanban.model.QuadroDTO;
import br.com.java.kanban.service.QuadroService;

@RestController
@RequestMapping("/quadro")
public class QuadroController {
	
	@Autowired
	QuadroService quadroService;
	
	/*
	 * TODO:
	 * Implements Handling exceptions;
	 * 
	 */
	@GetMapping("/{number}")
	public ResponseEntity<QuadroDTO> getQuadro(@PathVariable("number") String number){
		
		QuadroDTO quadroDTOResponse = quadroService.getQuadro(number);
		return new ResponseEntity<QuadroDTO>(quadroDTOResponse, HttpStatus.OK);		
	}

}
