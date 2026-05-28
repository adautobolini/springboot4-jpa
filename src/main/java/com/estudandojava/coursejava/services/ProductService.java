package com.estudandojava.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandojava.coursejava.entities.Product;
import com.estudandojava.coursejava.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository; 
	
/* Nao coloca anotation @Repository no ProductRepository, pois tal interface implementa o
 *  JpaRepository que ja esta registrado como Componente para Injecao de Independencia */

	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findbyId(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
