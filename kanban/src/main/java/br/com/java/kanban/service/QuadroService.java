package br.com.java.kanban.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java.kanban.entity.QuadroEntity;
import br.com.java.kanban.mapper.QuadroMapper;
import br.com.java.kanban.model.QuadroDTO;
import br.com.java.kanban.repository.QuadroRepository;

@Service
public class QuadroService {
	
	@Autowired
	QuadroRepository quadroRepository;
	
	public QuadroDTO getQuadro(String number) {
		QuadroEntity quadroEntity = quadroRepository.findByNumber(number);
		return QuadroMapper.toQuadroDTO(quadroEntity);
	}
	
	public List<QuadroDTO> getQuadros() {
		// TODO: Implement Method
		return null;
	} 
	
	public QuadroDTO createQuadro(QuadroDTO quadroDTO) {
		// TODO: Implement Method
		return null;
	}
	
	public QuadroDTO updateQuadro(QuadroDTO quadroDTO) {
		// TODO: Implement Method
		return null;
	}
	
	public void deleteQuadro(QuadroDTO quadroDTO) {
		// TODO: Implement Method
	}	

}
