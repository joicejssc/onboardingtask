package org.ait.project.onboardingtask.modules.user.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.model.entity.Payment;
import org.ait.project.onboardingtask.modules.user.model.repository.PaymentRepository;
import org.ait.project.onboardingtask.modules.user.service.delegate.PaymentDelegate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentDelegateImpl implements PaymentDelegate {

    private final PaymentRepository repository;

    @Override
    public Payment save(Payment payment) {

        return repository.save(payment);
    }
}
