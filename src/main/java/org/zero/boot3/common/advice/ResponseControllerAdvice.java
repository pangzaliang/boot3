package org.zero.boot3.common.advice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import org.zero.boot3.common.response.ResultVO;

import java.io.File;

/**
 * 控制层配置
 */
@ControllerAdvice
public class ResponseControllerAdvice implements ResponseBodyAdvice<Object> {

    // 日志
    private static final Logger logger = LoggerFactory.getLogger(ResponseControllerAdvice.class);
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        Class<?> type = returnType.getParameterType();
        // 判断结果值是否需要封装
        if (!type.equals(ResultVO.class) && !type.equals(File.class)) {
            logger.info("判断：需要结果值封装");
            return true;
        }
        return false;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        logger.info("执行：结果值封装");
        return new ResultVO<>().build("200","ok", body);
    }
}
