package org.ait.project.onboardingtask.modules.admin.transform;

import org.ait.project.onboardingtask.modules.admin.dto.request.OrderReq;
import org.ait.project.onboardingtask.modules.admin.model.entity.Order;
import org.ait.project.onboardingtask.shared.openfeign.order.request.CreateOrderRequest;
import org.ait.project.onboardingtask.shared.openfeign.order.response.CreateOrderResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface OrderTransform {

    CreateOrderRequest createOrderRequest(OrderReq orderReq);
    Order createEntityOrder(OrderReq orderReq);
    @Named("createOrderResponse")
    CreateOrderResponse createOrderResponse(Order order);
}
