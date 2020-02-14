package br.com.java.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.kanban.entity.QuadroEntity;

public interface QuadroRepository extends JpaRepository<QuadroEntity, Long>{

	public QuadroEntity findByNumber(String number);

}
