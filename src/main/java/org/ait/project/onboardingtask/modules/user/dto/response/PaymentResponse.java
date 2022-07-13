package org.ait.project.onboardingtask.modules.user.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResponse {

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
