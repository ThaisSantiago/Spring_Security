package org.com.generation.lojaDeGames.repository;

import java.util.List;

import org.com.generation.lojaDeGames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

	@Repository
	public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase (String categoria);
	//Busca  todos os atributos "nomes", independente do formato 
}
