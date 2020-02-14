package br.com.java.kanban.mapper;

import br.com.java.kanban.entity.QuadroEntity;
import br.com.java.kanban.model.QuadroDTO;

public class QuadroMapper {
	
	public static QuadroDTO toQuadroDTO(QuadroEntity quadroEntity) {
	
		QuadroDTO quadroDTO = new QuadroDTO();
		
		quadroDTO.setId(quadroEntity.getId());
		quadroDTO.setNumber(quadroEntity.getNumber());
		quadroDTO.setName(quadroEntity.getName());
		
		// TODO: Evaluate sub-entity conversion (ListaEntity)
		return quadroDTO;
	}

}
