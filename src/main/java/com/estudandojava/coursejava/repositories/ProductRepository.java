package com.estudandojava.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.coursejava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
