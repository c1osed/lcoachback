package com.wang.lp.lcoachback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public String create() {
        return "你好";

    }


}
