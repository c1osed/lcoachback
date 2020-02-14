package com.wang.lp.lcoachback.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "注册一个学生")
    @RequestMapping(value = "/api/studentregister", method = RequestMethod.POST)
    public CommonResult registerStudent(String username, String password) {
        boolean register = studentService.register(username, password);
        if (!register) {
            return CommonResult.failed("注册失败");
        }
        return CommonResult.success("注册成功");
    }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "学生登陆")
    @RequestMapping(value = "/api/studentlogin", method = RequestMethod.POST)
    public CommonResult loginStudent(@RequestBody StudentDto studentDto, HttpSession session) {
        Student login = studentService.login(studentDto.getUsername(), studentDto.getPassword());
        if (login == null) {
            return CommonResult.failed("登录失败");
        } else {
            session.setAttribute("student", login);
            return CommonResult.success("登陆成功");
        }
    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "分页得到所有学生")
    @RequestMapping(value = "/api/students", method = RequestMethod.GET)
    public CommonResult getAllStudent(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam(value = "pagesize", defaultValue = "5") Integer pagesize) {
        PageHelper.startPage(pn, pagesize);
        List<Student> studentsList = studentService.getStudentsList();
        PageInfo pageInfo = new PageInfo(studentsList, pagesize);
        return CommonResult.success(pageInfo);
    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "修改学生的信息")
    @RequestMapping(value = "/api/students", method = RequestMethod.PUT)
    public CommonResult updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return CommonResult.success("修改信息成功");

    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id查询学生的信息")
    @RequestMapping(value = "/api/students/{id}", method = RequestMethod.GET)
    public CommonResult selectStudentById(@PathVariable("id") Integer id) {
        Student studentById = studentService.getStudentById(id);

        return CommonResult.success(studentById,"查询信息成功");

    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id删除学生的信息")
    @RequestMapping(value = "/api/students/{id}", method = RequestMethod.DELETE)
    public CommonResult deleteStudentById(@PathVariable("id") Integer id) {
         studentService.deleteStudentById(id);
        return CommonResult.success("删除信息成功");

    }


}
