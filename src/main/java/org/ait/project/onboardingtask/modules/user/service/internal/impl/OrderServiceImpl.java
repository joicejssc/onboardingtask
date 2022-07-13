package org.ait.project.onboardingtask.modules.user.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.ait.project.onboardingtask.modules.user.service.delegate.OrderDelegate;
import org.ait.project.onboardingtask.modules.user.service.internal.OrderService;
import org.ait.project.onboardingtask.modules.user.transform.OrderTransform;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ResponseHelper responseHelper;

    private final OrderDelegate orderDelegate;

    private final OrderTransform orderTransform;


    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> addOrder(OrderRequest orderRequest) {
        OrderResponse orderResponse = orderTransform.mappingOrderReqToOrderResp(orderRequest);

        Order order = orderDelegate.save(orderTransform.mappingOrderRespToOrder(orderResponse));

        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                orderTransform.mappingOrderToOrderResp(order));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<OrderResponse>>> getOrderById(BigDecimal id) {
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                orderTransform.mappingOrderToOrderResp(orderDelegate.getOrderById(id)));
    }
}
