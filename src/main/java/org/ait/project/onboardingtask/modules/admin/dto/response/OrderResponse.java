package org.ait.project.onboardingtask.modules.admin.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.ait.project.onboardingtask.shared.openfeign.order.response.CreateOrderResponse;

import javax.validation.constraints.NotBlank;

@Data
public class OrderResponse extends CreateOrderResponse {

    @NotBlank(message = "{orderId.required}")
    @JsonProperty("orderId")
    private String orderId;

    @NotBlank(message = "{productNo.required}")
    @JsonProperty("productNo")
    private String productNo;

    @NotBlank(message = "{productName.required}")
    @JsonProperty("productName")
    private String productName;

    @NotBlank(message = "{qty.required}")
    @JsonProperty("qty")
    private Integer qty;

    @NotBlank(message = "{statusOrder.required}")
    @JsonProperty("statusOrder")
    private String statusOrder;

    @NotBlank(message = "{createdBy.required}")
    @JsonProperty("createdBy")
    private String createdBy;
}
