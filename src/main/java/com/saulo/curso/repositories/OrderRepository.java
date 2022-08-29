package com.saulo.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saulo.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
