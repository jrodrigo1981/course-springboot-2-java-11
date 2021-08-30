package com.rodrigogameiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigogameiro.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
