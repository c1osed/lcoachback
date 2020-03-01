package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.dto.CourseDto;
import com.wang.lp.lcoachback.dto.FullCalendarDto;
import com.wang.lp.lcoachback.mbg.model.Course;
import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
           course.setCourseTitle(courseDto.getCoursetitle());
        course.setGradle(courseDto.getGradle());
        course.setEndtime(courseDto.getEndtime());
        courseService.addcourse(course);
        return CommonResult.success("添加成功");}


    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "通过老师的id查询课程")
    @RequestMapping(value = "/api/course/{id}", method = RequestMethod.GET)
    public CommonResult SelectCourseByTeacherId(@PathVariable("id") Integer id) {
        List<Course> getcoursebyteacherid = courseService.getcoursebyteacherid(id);
        List fullCalendarDtolist = new ArrayList();
        for( Course  course : getcoursebyteacherid){
            FullCalendarDto fullCalendarDto = new FullCalendarDto();
            fullCalendarDto.setId(course.getId());
            fullCalendarDto.setSid(course.getSid());
            fullCalendarDto.setTid(course.getTid());
            fullCalendarDto.setTitle(course.getCourseTitle());
            fullCalendarDto.setStart(course.getStarttime());
            fullCalendarDto.setEnd(course.getEndtime());
            fullCalendarDto.setColor(course.getColor());
            fullCalendarDtolist.add(fullCalendarDto);

        }
        return CommonResult.success(fullCalendarDtolist);

       }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "通过老师的id查询被选择的课程")
    @RequestMapping(value = "/api/coursebyteacherid/{id}", method = RequestMethod.GET)
    public CommonResult SelectChooseCourseByTeacherId(@PathVariable("id") Integer id) {
        List<Course> getcoursebyteacherid = courseService.getcoursebyteacherid(id);
        List fullCalendarDtolist = new ArrayList();
        for( Course  course : getcoursebyteacherid){
            FullCalendarDto fullCalendarDto = new FullCalendarDto();
            fullCalendarDto.setId(course.getId());
            fullCalendarDto.setSid(course.getSid());
            fullCalendarDto.setTid(course.getTid());
            fullCalendarDto.setTitle(course.getCourseTitle());
            fullCalendarDto.setStart(course.getStarttime());
            fullCalendarDto.setEnd(course.getEndtime());
            fullCalendarDto.setColor(course.getColor());
            fullCalendarDtolist.add(fullCalendarDto);

        }
        return CommonResult.success(fullCalendarDtolist);

    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id修改课程的信息")
    @RequestMapping(value = "/api/course", method = RequestMethod.PUT)
    public CommonResult updateCourse(Integer id,Integer sid){
        Course courseById = courseService.getCourseById(id);
        courseById.setSid(sid);
        courseById.setColor("green");
        courseById.setIsChoose("1");
        courseService.updatacourse(courseById);
        return CommonResult.success("修改课程信息成功");

    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id查询学生的所有课程")
    @RequestMapping(value = "/api/courses/{sid}", method = RequestMethod.GET)
    public CommonResult selectCourseByStudentId(@PathVariable("sid") Integer id) {
        List<Course> courseByStudentId = courseService.getCourseByStudentId(id);

        List fullCalendarDtolist = new ArrayList();
        for( Course  course : courseByStudentId){
            FullCalendarDto fullCalendarDto = new FullCalendarDto();
            fullCalendarDto.setId(course.getId());
            fullCalendarDto.setSid(course.getSid());
            fullCalendarDto.setTid(course.getTid());
            fullCalendarDto.setTitle(course.getCourseTitle());
            fullCalendarDto.setStart(course.getStarttime());
            fullCalendarDto.setEnd(course.getEndtime());
            fullCalendarDto.setColor(course.getColor());
            fullCalendarDtolist.add(fullCalendarDto);
        }

        return CommonResult.success(fullCalendarDtolist,"查询信息成功");

    }


}
