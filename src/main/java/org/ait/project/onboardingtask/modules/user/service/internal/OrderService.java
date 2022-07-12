package org.ait.project.onboardingtask.modules.user.service.internal;

import org.ait.project.onboardingtask.modules.user.dto.request.OrderReq;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

public interface OrderService {

    ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> addOrder(OrderReq orderReq);

    ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> getOrderById(BigDecimal id);
}
