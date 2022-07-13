package org.ait.project.onboardingtask.modules.user.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
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
@RequestMapping(value = "/rest")
public class OrderController  {

    private final OrderService orderService;

//    @Override
    @PostMapping("/addOrder")
    public ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> addOrder(
            @Valid @RequestBody
            OrderRequest orderRequest) {
        return orderService.addOrder(orderRequest);
    }

//    @Override
    @GetMapping("/getOrderById/{id}")
    public ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> getOrderById(@PathVariable BigDecimal id) {
        return orderService.getOrderById(id);
    }
}
