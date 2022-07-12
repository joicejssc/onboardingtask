package org.ait.project.onboardingtask.modules.admin.service.internal;

import org.ait.project.onboardingtask.modules.admin.dto.request.OrderReq;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.openfeign.order.response.CreateOrderResponse;
import org.springframework.http.ResponseEntity;

public interface OrderService {

    ResponseEntity<ResponseTemplate<ResponseDetail<CreateOrderResponse>>> addOrder(OrderReq orderReq);
}
