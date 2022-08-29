package com.arthurdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurdev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
