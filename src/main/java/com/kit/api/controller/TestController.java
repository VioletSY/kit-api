package com.kit.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：songyan
 * @date: 2020/6/7
 **/
@RestController
public class TestController {

    @GetMapping(value = "test",produces = "text/json;charset=utf-8")
    public String test(){
        return "{\"success\":true}";
    }

    @GetMapping(value = "getTest",produces = "text/json;charset=utf-8")
    public String getTest(){
        return "{\"success\":false}";
    }

    @GetMapping("hh")
    public String getTest2(){
        return "{\"success\":false}";
    }
}
