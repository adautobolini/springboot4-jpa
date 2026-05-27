package com.estudandojava.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandojava.coursejava.entities.Category;
import com.estudandojava.coursejava.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository; 
	
/* Nao coloca anotation @Repository no CategoryRepository, pois tal interface implementa o
 *  JpaRepository que ja esta registrado como Componente para Injecao de Independencia */

	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findbyId(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
