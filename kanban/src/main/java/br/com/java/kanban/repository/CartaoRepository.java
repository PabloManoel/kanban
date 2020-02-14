package br.com.java.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.kanban.entity.CartaoEntity;

public interface CartaoRepository extends JpaRepository<CartaoEntity, Long>{

}
