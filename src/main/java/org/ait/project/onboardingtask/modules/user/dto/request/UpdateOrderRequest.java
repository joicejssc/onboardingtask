package org.ait.project.onboardingtask.modules.user.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigInteger;

@Data
public class UpdateOrderRequest {

    @JsonProperty("id")
    private BigInteger id;

    @JsonProperty("orderNo")
    private String orderNo;

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

    @JsonProperty("createdDate")
    private String createdDate;
}
