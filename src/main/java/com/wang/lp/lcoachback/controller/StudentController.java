package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.dto.StudentDto;
import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "注册一个学生")
    @RequestMapping(value = "/studentregister",method = RequestMethod.POST)
    public CommonResult registerStudent(String username,String password){
        boolean register = studentService.register(username, password);
        if(!register){
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success("注册成功");
    }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "学生登陆")
    @RequestMapping(value = "/studentlogin",method = RequestMethod.POST)
    public CommonResult loginStudent(@RequestBody StudentDto studentDto,HttpSession session){
        Student login = studentService.login(studentDto.getUsername(), studentDto.getPassword());
       if(login==null){
           return CommonResult.failed("登录失败");
       }else {
           session.setAttribute("student",login);
           return CommonResult.success("登陆成功");
       }
    }



}
