package com.estudandojava.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.coursejava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
