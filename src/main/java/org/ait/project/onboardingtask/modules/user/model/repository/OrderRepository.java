package org.ait.project.onboardingtask.modules.user.model.repository;

import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Repository
public interface OrderRepository extends JpaRepository<Order, BigDecimal> {

//    @Transactional
//    @Modifying
//    @Query(value = "update order a set status_order =: statusOrder where u.order_no =: orderNo", nativeQuery = true)
//    void updateStatusOrderByOrderNo(OrderRequest orderRequest);
}
