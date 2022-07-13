package org.ait.project.onboardingtask.modules.user.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.PaymentRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.PaymentResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Payment;
import org.ait.project.onboardingtask.modules.user.service.delegate.PaymentDelegate;
import org.ait.project.onboardingtask.modules.user.service.internal.PaymentService;
import org.ait.project.onboardingtask.modules.user.transform.PaymentTransform;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final ResponseHelper responseHelper;
    private final PaymentDelegate paymentDelegate;
    private final PaymentTransform paymentTransform;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<PaymentResponse>>> addPayment(PaymentRequest paymentRequest) {
        PaymentResponse paymentResponse = paymentTransform.mappingPaymentReqToPaymentResp(paymentRequest);
        Payment payment = paymentDelegate.save(paymentTransform.mappingPaymentRespToPayment(paymentResponse));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                paymentTransform.mappingPaymentToPaymentResp(payment));
    }
}
