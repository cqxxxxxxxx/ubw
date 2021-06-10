package com.cqx;

/**
 * @author cqx
 */
public interface ExceptionHandler {

    /**
     * 持久化
     * @param e
     */
    void onException(Exception e);
}
