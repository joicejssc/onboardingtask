package org.ait.project.onboardingtask.modules.user.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.OrderReq;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.service.internal.OrderService;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderService {

    private final OrderService orderService;

    @Override
    @PostMapping("/addOrder")
    public ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> addOrder(
            @Valid @RequestBody
            OrderReq orderReq) {
        return orderService.addOrder(orderReq);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> getOrderById(@PathVariable BigDecimal id) {
        return orderService.getOrderById(id);
    }
}
