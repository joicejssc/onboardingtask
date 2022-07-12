package org.ait.project.onboardingtask.modules.user.model.repository;

import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface OrderRepository extends JpaRepository<Order, BigDecimal> {

}
