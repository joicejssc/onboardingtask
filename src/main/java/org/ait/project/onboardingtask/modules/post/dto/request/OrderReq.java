package org.ait.project.onboardingtask.modules.post.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderReq {

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