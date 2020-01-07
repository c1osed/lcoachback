package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @ResponseBody
    @ApiOperation(value = "注册一个学生")
    @RequestMapping(value = "/studebt",method = RequestMethod.POST)
    public CommonResult registerStudent(String username,String password){
        boolean register = studentService.register(username, password);
        if(!register){
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success("注册成功");
    }



}
