package org.ait.project.onboardingtask.modules.user.service.delegate;

import org.ait.project.onboardingtask.modules.user.model.entity.Order;

import java.math.BigDecimal;

public interface OrderDelegate {

    Order save(Order order);

    Order getOrderById(BigDecimal id);
}
