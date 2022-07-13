package org.ait.project.onboardingtask.modules.user.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.PaymentRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.PaymentResponse;
import org.ait.project.onboardingtask.modules.user.service.internal.PaymentService;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/rest")
public class PaymentController implements PaymentService {

    private final PaymentService paymentService;


    @Override
    @PostMapping("/addPayment")
    public ResponseEntity<ResponseTemplate<ResponseDetail<PaymentResponse>>> addPayment(
            @Valid @RequestBody
            PaymentRequest paymentRequest) {
        return paymentService.addPayment(paymentRequest);
    }
}
