package com.arthurdev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arthurdev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
