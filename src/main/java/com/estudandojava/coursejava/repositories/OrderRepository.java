package com.estudandojava.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.coursejava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
