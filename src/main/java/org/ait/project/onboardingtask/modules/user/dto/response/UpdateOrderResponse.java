package org.ait.project.onboardingtask.modules.user.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateOrderResponse {

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
