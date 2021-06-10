package com.cqx;

import java.util.List;

/**
 * 增强
 */
public class UbwEnhancer {

    private List<ExceptionHandler> exceptionHandlers;

    public UbwEnhancer(List<ExceptionHandler> exceptionHandlers) {
        this.exceptionHandlers = exceptionHandlers;
    }

    public Object enhance() {
        try {
            //invoke
            return null;
        } catch (Exception e) {
            //error listener
            for (ExceptionHandler handler : exceptionHandlers) {
                handler.onException(e);
            }
        }
        return null;
    }

}
