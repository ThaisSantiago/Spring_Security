package org.com.generation.lojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

	@Entity // Informa que é uma tabela 
	@Table(name = "categoria") // Dá nome a tabela
	public class Categoria {
	
	
	@Id // Informa que atributo "id" é uma Chave Primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa a Chave Estrangeira
	 private long id;
	
	@NotBlank // Para não aceitar somente espaços
	@Size(max = 100, message = "O campo deve conter no maximo 100 caracteres")
	private String descricao;

	@NotBlank// Para não aceitar somente espaços
	@Size(max = 100, message = "O campo deve conter no maximo 100 caracteres")
	private String setor;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private  List<Produto> produto;
	
	/*Getters and Setters*/
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	
	
}
