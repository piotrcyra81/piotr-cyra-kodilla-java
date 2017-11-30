package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrder {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrder.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" + "&& args(order, userId) && this(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
        LOGGER.info("Method was started in Class: " + object.getClass().getName() + ", In order nr: " + order + ", By userId: " + userId );
    }
}