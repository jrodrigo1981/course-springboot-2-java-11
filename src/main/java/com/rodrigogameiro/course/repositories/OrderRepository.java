package com.rodrigogameiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigogameiro.course.entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
