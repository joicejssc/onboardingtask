package org.ait.project.onboardingtask.modules.post.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.post.dto.request.OrderReq;
import org.ait.project.onboardingtask.modules.post.service.internal.OrderService;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.openfeign.order.response.CreateOrderResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderService {

    private  final OrderService orderService;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<CreateOrderResponse>>> addOrder(
            @Valid @RequestBody
            OrderReq orderReq) {
        return orderService.addOrder(orderReq);
    }
}
