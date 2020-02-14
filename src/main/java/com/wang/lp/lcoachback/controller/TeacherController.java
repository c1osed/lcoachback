package com.wang.lp.lcoachback.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.mbg.mapper.TeacherMapper;
import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.mbg.model.Teacher;
import com.wang.lp.lcoachback.service.TeacherService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "分页得到所有老师")
    @RequestMapping(value = "/api/teachers", method = RequestMethod.GET)
    public CommonResult getAllTeacher(@RequestParam(value = "pn", defaultValue = "1") Integer pn, @RequestParam(value = "pagesize", defaultValue = "5") Integer pagesize) {
        PageHelper.startPage(pn, pagesize);
        List<Teacher> allTeachers = teacherService.getAllTeachers();
        PageInfo pageInfo = new PageInfo(allTeachers, pagesize);
        return CommonResult.success(pageInfo);
    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "修改老师的信息")
    @RequestMapping(value = "/api/teachers", method = RequestMethod.PUT)
    public CommonResult updateteachers(@RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
        return CommonResult.success("修改信息成功");

    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id查询老师的信息")
    @RequestMapping(value = "/api/teachers/{id}", method = RequestMethod.GET)
    public CommonResult selectStudentById(@PathVariable("id") Integer id) {
        Teacher teacher = teacherService.getteachersById(id);
        return CommonResult.success(teacher,"查询信息成功");

    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id删除老师的信息")
    @RequestMapping(value = "/api/teachers/{id}", method = RequestMethod.DELETE)
    public CommonResult deleteStudentById(@PathVariable("id") Integer id) {
        teacherService.deleteTeacherById(id);
        return CommonResult.success("删除信息成功");

    }
}
