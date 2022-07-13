package org.ait.project.onboardingtask.modules.user.transform;

import org.ait.project.onboardingtask.modules.user.dto.request.PaymentRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.PaymentResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface PaymentTransform {

    @Named("mappingPaymentRespToPayment")
    Payment mappingPaymentRespToPayment(PaymentResponse paymentResponse);

    @Named("mappingPaymentToPaymentResp")
    PaymentResponse mappingPaymentToPaymentResp(Payment payment);

    @Named("mappingPaymentReqToPaymentResp")
    PaymentResponse mappingPaymentReqToPaymentResp(PaymentRequest paymentRequest);

}
