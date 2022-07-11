package org.ait.project.onboardingtask.shared.openfeign.order;

import org.ait.project.onboardingtask.modules.post.dto.response.OrderResponse;
import org.ait.project.onboardingtask.shared.openfeign.order.request.CreateOrderRequest;
import org.springframework.stereotype.Component;

@Component
public class OrderClientFallback implements OrderClient{


    @Override
    public OrderResponse createOrder(CreateOrderRequest createOrderRequest) {
        return null;
    }
}
