package org.ait.project.onboardingtask.modules.user.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.ait.project.onboardingtask.modules.user.model.repository.OrderRepository;
import org.ait.project.onboardingtask.modules.user.service.delegate.OrderDelegate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderDelegateImpl implements OrderDelegate {

    private final OrderRepository repository;

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }
}
