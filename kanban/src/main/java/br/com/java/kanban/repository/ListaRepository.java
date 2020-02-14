package br.com.java.kanban.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.java.kanban.entity.ListaEntity;

public interface ListaRepository extends JpaRepository<ListaEntity, Long>{

}
