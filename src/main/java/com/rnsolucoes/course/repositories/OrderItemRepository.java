package com.rnsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rnsolucoes.course.entities.OrderItem;
import com.rnsolucoes.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
