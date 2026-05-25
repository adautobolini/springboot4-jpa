package com.estudandojava.coursejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudandojava.coursejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
