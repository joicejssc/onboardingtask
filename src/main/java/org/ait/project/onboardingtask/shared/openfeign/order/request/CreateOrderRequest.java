package org.ait.project.onboardingtask.shared.openfeign.order.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateOrderRequest {

    @JsonProperty("orderId")
    private String orderId;

    @JsonProperty("productNo")
    private String productNo;

    @JsonProperty("productName")
    private String productName;

    @JsonProperty("qty")
    private Integer qty;

    @JsonProperty("statusOrder")
    private String statusOrder;

    @JsonProperty("createdBy")
    private String createdBy;
}
