package org.ait.project.onboardingtask.modules.user.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class PaymentRequest {

    @JsonProperty("id")
    private String id;

    @JsonProperty("paymentNo")
    private String paymentNo;

    @JsonProperty("orderNo")
    private String orderNo;

    @JsonProperty("bankName")
    private String bankName;

    @JsonProperty("bankAccount")
    private String bankAccount;

    @JsonProperty("paymentMethod")
    private String paymentMethod;

    @JsonProperty("paymentStatus")
    private String paymentStatus;

    @JsonProperty("createdDate")
    private ZonedDateTime createdDate;

    @JsonProperty("createdBy")
    private String createdBy;

    @JsonProperty("updateDate")
    private ZonedDateTime updateDate;

    @JsonProperty("updateBy")
    private String updateBy;
}
