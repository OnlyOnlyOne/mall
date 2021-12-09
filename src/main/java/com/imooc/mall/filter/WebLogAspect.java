package com.imooc.mall.filter;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * The type Web log aspect.
 * 打印请求和响应信息
 */
@Aspect
@Component
public class WebLogAspect {
    @Pointcut("execution(public * com.imooc.mall.controller.*.*(..))")
    public void webLog() {

    }


}
