package org.ait.project.onboardingtask.shared.openfeign.order;

import org.ait.project.onboardingtask.modules.user.dto.response.OrderResponse;
import org.ait.project.onboardingtask.shared.openfeign.order.request.CreateOrderRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        value = "order-client",
        url = "${restclient.url.order-client}",
        fallback = OrderClientFallback.class
)
public interface OrderClient {

    @PostMapping("/addOrder")
    OrderResponse createOrder(@RequestBody CreateOrderRequest createOrderRequest);
}
