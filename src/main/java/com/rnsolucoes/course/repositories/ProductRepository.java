package com.rnsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rnsolucoes.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
