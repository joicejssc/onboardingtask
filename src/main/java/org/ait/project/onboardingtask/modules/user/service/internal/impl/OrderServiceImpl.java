package org.ait.project.onboardingtask.modules.user.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.request.UpdateOrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.dto.response.UpdateOrderResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.ait.project.onboardingtask.modules.user.service.delegate.OrderDelegate;
import org.ait.project.onboardingtask.modules.user.service.internal.OrderService;
import org.ait.project.onboardingtask.modules.user.transform.OrderTransform;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;
import org.ait.project.onboardingtask.shared.dto.template.ResponseDetail;
import org.ait.project.onboardingtask.shared.dto.template.ResponseTemplate;
import org.ait.project.onboardingtask.shared.utils.ResponseHelper;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());
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

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<UpdateOrderResponse>>> updateStatusOrderByOrderNo(UpdateOrderRequest updateOrderRequest) {
        logger.info("step 1 terima request : " + updateOrderRequest.getId() + " || " + updateOrderRequest);
        UpdateOrderResponse updateOrderResponse = orderTransform.mappingUpdateOrderReqToUpdateOrderResp(updateOrderRequest);
        Order order = orderDelegate.updateStatusOrderByOrderNo(orderTransform.mappingUpdateOrderRespToOrder(updateOrderResponse));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
                orderTransform.mappingOrderToUpdateOrderResp(order));
    }


}
