package com.cqx;

import java.lang.annotation.*;


/**
 * 注解
 *
 * @author cqx
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Ubw {

    /**
     * 重试最大次数
     *
     * @return
     */
    int maxRetry() default 3;


}
