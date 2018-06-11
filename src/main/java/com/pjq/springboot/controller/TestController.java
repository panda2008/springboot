package com.pjq.springboot.controller;

import com.pjq.springboot.model.User;
import com.pjq.springboot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "测试api")
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @ApiImplicitParams({@ApiImplicitParam(name = "name", value = "用户名")})
    @GetMapping(value = "getUserByName")
    public User getUserByName(@RequestParam(value = "name") String name){
        return userService.getUserByName(name);
    }
}
