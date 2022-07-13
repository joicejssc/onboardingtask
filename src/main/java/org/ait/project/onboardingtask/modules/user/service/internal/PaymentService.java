package org.ait.project.onboardingtask.modules.user.service.internal;

import org.ait.project.onboardingtask.modules.user.dto.request.PaymentRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.PaymentResponse;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface PaymentService {
    ResponseEntity<ResponseTemplate<ResponseDetail<PaymentResponse>>> addPayment(PaymentRequest paymentRequest);
}
