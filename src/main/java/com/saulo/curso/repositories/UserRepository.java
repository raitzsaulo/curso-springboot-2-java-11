package com.saulo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulo.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
