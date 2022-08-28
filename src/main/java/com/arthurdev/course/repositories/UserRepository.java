package com.arthurdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurdev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
