package org.ait.project.onboardingtask.modules.user.transform;

import org.ait.project.onboardingtask.modules.user.dto.request.OrderRequest;
import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.modules.user.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface OrderTransform {

    @Named("mappingOrderReqToOrderResp")
    OrderResponse mappingOrderReqToOrderResp(OrderRequest orderRequest);
    @Named("mappingOrderRespToOrder")
    Order mappingOrderRespToOrder(OrderResponse orderResponse);
    @Named("mappingOrderToOrderResp")
    OrderResponse mappingOrderToOrderResp(Order order);
}
