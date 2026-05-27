package com.estudandojava.coursejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudandojava.coursejava.entities.Order;
import com.estudandojava.coursejava.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository; 
	
/* Nao coloca anotation @Repository no OrderRepository, pois tal interface implementa o
 *  JpaRepository que ja esta registrado como Componente para Injecao de Independencia */

	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findbyId(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
