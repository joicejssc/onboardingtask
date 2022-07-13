package org.ait.project.onboardingtask.shared.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ResponseEnum {
  SUCCESS("OBT-200", "success", HttpStatus.OK),
  JSON_PLACE_HOLDER_POST_NOT_FOUND("PMRK-0001", "jph.post.not.found", HttpStatus.NOT_FOUND),

  ORDER_NOT_FOUND("OBT-404", "order.not.found", HttpStatus.NOT_FOUND),
  INVALID_PARAM("OBT-0009", "invalid.param", HttpStatus.BAD_REQUEST),
  INTERNAL_SERVER_ERROR("OBT-9999", "internal.server.error", HttpStatus.INTERNAL_SERVER_ERROR),

  ;

  private String responseCode;
  private String responseMessage;
  private HttpStatus httpStatus;

}
