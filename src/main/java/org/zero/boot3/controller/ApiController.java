package org.zero.boot3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zero.boot3.common.response.ApiResult;

/**
 * 已弃用
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);

    @GetMapping("/hi")
    public ApiResult<String> sayHi(String userName) {
        logger.info("userName: {}", userName);
        return new ApiResult<>("200", "ok", "hello " + userName);
    }

    @GetMapping("/hey")
    public ApiResult<String> sayHey(String userName) {
        logger.info("userName: {}", userName);
        return ApiResult.ok(userName);
    }
}
