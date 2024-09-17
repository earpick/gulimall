package com.study.gulimall.product.exception;

import com.study.common.exception.BizCodeEnum;
import com.study.common.utils.R;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * 统一异常处理
 *
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.study.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    // JSR303数据校验异常
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        Map<String, String> validMap = new HashMap<>();
        // 获取异常对象中错误的校验结果
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach((item) -> {
            // 获取发生校验错误时的message
            String message = item.getDefaultMessage();
            // 获取发生校验错误的字段名
            String field = item.getField();
            validMap.put(field, message);
        });
        log.error("数据校验出现问题{},异常类型:{}", e.getMessage(), e.getClass());
        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", validMap);
    }

    // 未知异常
    @ExceptionHandler(value = Throwable.class)
    public R handleUnknownException(Throwable throwable) {
        log.error("未知异常{},异常类型:{}",throwable.getMessage(),throwable.getClass());
        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(),BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());
    }


}
