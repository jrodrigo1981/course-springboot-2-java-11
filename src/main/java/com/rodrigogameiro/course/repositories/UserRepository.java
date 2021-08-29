package com.rodrigogameiro.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigogameiro.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
