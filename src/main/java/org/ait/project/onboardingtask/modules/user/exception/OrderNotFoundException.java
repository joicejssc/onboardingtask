package org.ait.project.onboardingtask.modules.user.exception;

import lombok.extern.slf4j.Slf4j;
import org.ait.project.onboardingtask.config.exception.ModuleException;
import org.ait.project.onboardingtask.shared.constant.enums.ResponseEnum;

@Slf4j
public class OrderNotFoundException extends ModuleException {

    public OrderNotFoundException() {
        super(ResponseEnum.ORDER_NOT_FOUND);
        log.error("Order not found");
    }
}
