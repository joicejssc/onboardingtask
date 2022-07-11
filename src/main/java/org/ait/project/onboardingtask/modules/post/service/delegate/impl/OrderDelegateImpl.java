package org.ait.project.onboardingtask.modules.post.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.post.model.entity.Order;
import org.ait.project.onboardingtask.modules.post.model.repository.OrderRepository;
import org.ait.project.onboardingtask.modules.post.service.delegate.OrderDelegate;
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
