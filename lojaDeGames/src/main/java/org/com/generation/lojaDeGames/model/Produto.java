package org.com.generation.lojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


	@Entity // informa que é uma tabela 
	@Table(name = "produto") // Dá nomeia a tabela
	public class Produto {
	
	@Id // informa que o atributo "id" é uma Chave Primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incrementa a Chave Estrangeira
	private long id;
	
	@NotBlank// Não permite somente espaços em branco
	@Size(min = 5, max = 1000, message = "O atributo deve conter no minimo 5 e no maximo 1000 caracteres")
	private String nome;
	
	@NotNull
	@Size(min = 5, max = 1000, message = "O atributo deve no minimo 5 e no maximo 1000 caracteres")
	private double valor;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	/*Getters and Setters*/
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	}
