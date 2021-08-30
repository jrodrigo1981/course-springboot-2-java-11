package com.rodrigogameiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigogameiro.course.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Long>{

}
