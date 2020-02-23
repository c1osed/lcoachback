package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.dto.CourseDto;
import com.wang.lp.lcoachback.mbg.model.Course;
import com.wang.lp.lcoachback.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class CourseController {
    @Autowired
    CourseService courseService;

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "添加一个课程")
    @RequestMapping(value = "/api/course", method = RequestMethod.POST)
    public CommonResult addCourse(@RequestBody CourseDto courseDto) {
        Course course = new Course();
        course.setTid(courseDto.getId());
        course.setColor(courseDto.getColor());
        course.setStarttime(courseDto.getStarttime());
        course.setGradle(courseDto.getGradle());
        course.setEndtime(courseDto.getEndtime());
            courseService.addcourse(course);
            return CommonResult.success("添加成功");}

}
