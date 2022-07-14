package org.ait.project.onboardingtask.modules.user.service.internal;

import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.request.UpdateOrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.dto.response.UpdateOrderResponse;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

public interface OrderService {

    ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> addOrder(OrderRequest orderRequest);
    ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> getOrderById(BigDecimal id);
    ResponseEntity<ResponseTemplate<ResponseDetail<UpdateOrderResponse>>> updateStatusOrder(UpdateOrderRequest updateOrderRequest);
}
