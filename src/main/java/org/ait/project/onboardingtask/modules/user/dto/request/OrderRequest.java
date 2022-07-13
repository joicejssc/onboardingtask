package org.ait.project.onboardingtask.modules.user.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderRequest {

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
