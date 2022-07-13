package org.ait.project.onboardingtask.modules.user.transform;

import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface OrderTransform {

    @Named("createEntityOrder")
    OrderResponse createOrderResp(OrderRequest orderRequest);
    @Named("createEntityResponse")
    Order createEntityResponse(OrderResponse orderResponse);
    @Named("createOrderResponse")
    OrderResponse createOrderResponse(Order order);
}
