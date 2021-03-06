package com.senac.PI4_ecommerce.model.enums;

public enum EstadoProduto {
	ATIVO(1, "Ativo"),
	INATIVO(2, "Inativo");

	private Integer id;
	private String descricao;
	
	private EstadoProduto(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
	public static EstadoProduto toEnum(Integer id) {
		if(id == null) {
			return null;
		}
		
		for(EstadoProduto estado : EstadoProduto.values()) {
			if(id.equals(estado.getId())) {
				return estado;
			}
		}
		throw new IllegalArgumentException("Id invalido: "+ id);
	}
}
