package org.ait.project.onboardingtask.modules.post.exception;

import lombok.extern.slf4j.Slf4j;
import org.ait.project.onboardingtask.config.exception.ModuleException;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;

@Slf4j
public class JPHNotFoundException extends ModuleException {

  public JPHNotFoundException() {
    super(ResponseEnum.JSON_PLACE_HOLDER_POST_NOT_FOUND);
    log.error("JsonPlaceHolder Post not found");
  }
}
