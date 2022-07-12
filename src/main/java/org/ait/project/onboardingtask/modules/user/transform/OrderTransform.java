package org.ait.project.onboardingtask.modules.user.transform;

import org.ait.project.onboardingtask.modules.user.dto.request.OrderReq;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface OrderTransform {

    OrderReq createOrderRequest(OrderReq orderReq);
    Order createEntityOrder(OrderReq orderReq);
    @Named("createOrderResponse")
    OrderResponse createOrderResponse(Order order);
}
