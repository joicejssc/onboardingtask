package org.ait.project.onboardingtask.modules.post.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.post.dto.request.OrderReq;
import org.ait.project.onboardingtask.modules.post.model.entity.Order;
import org.ait.project.onboardingtask.modules.post.service.delegate.OrderDelegate;
import org.ait.project.onboardingtask.modules.post.service.internal.OrderService;
import org.ait.project.onboardingtask.modules.post.transform.OrderTransform;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.openfeign.order.OrderClient;
import org.ait.project.onboardingtask.shared.openfeign.order.response.CreateOrderResponse;
import org.ait.project.onboardingtask.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final ResponseHelper responseHelper;

    private final OrderClient client;

    private final OrderDelegate orderDelegate;

    private final OrderTransform orderTransform;


    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<CreateOrderResponse>>> addOrder(OrderReq orderReq) {
        client.createOrder(orderTransform.createOrderRequest(orderReq));
        Order order = orderDelegate.save(orderTransform.createEntityOrder(orderReq));

        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                orderTransform.createOrderResponse(order));
    }
}
