package br.com.java.kanban.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Quadro")
public class QuadroEntity extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String name;
	
	@OneToMany(mappedBy = "quadroEntity", fetch = FetchType.EAGER)
	List<ListaEntity> listaEntities;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ListaEntity> getListaEntities() {
		return listaEntities;
	}
	public void setListaEntities(List<ListaEntity> listaEntities) {
		this.listaEntities = listaEntities;
	}

}
