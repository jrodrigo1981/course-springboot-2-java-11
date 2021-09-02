package com.rodrigogameiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigogameiro.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
