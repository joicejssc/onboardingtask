package org.ait.project.onboardingtask.modules.user.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.request.UpdateOrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.exception.OrderNotFoundException;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.ait.project.onboardingtask.modules.user.model.repository.OrderRepository;
import org.ait.project.onboardingtask.modules.user.service.delegate.OrderDelegate;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderDelegateImpl implements OrderDelegate {

    private final OrderRepository repository;

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public Order getOrderById(BigDecimal id) {
        return repository.findById(id).orElseThrow(OrderNotFoundException::new);
    }

    @Override
    public Order updateStatusOrderByOrderNo(Order order) {
        return repository.save(order);
    }

}
