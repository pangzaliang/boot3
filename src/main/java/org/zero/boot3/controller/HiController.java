package org.zero.boot3.controller;


import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zero.boot3.service.UserService;

@RestController
public class HiController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/test")
    public String test(Integer id){
        return userService.getUserById(id);
    }
}
