package com.rnsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rnsolucoes.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
