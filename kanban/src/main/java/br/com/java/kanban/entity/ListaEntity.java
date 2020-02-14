package br.com.java.kanban.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Lista")
public class ListaEntity extends BaseEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String number;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "quadroId")
	private QuadroEntity quadroEntity;
	
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
	public QuadroEntity getQuadroEntity() {
		return quadroEntity;
	}
	public void setQuadroEntity(QuadroEntity quadroEntity) {
		this.quadroEntity = quadroEntity;
	}
}
