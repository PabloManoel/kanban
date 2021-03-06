package br.com.java.kanban.model;

import java.util.List;

public class ListaDTO {
	
	private Long id;
	private String number;
	private String name;
	private List<CartaoDTO> cartoes;
	
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
	public List<CartaoDTO> getCartoes() {
		return cartoes;
	}
	public void setCartoes(List<CartaoDTO> cartoes) {
		this.cartoes = cartoes;
	}
}
