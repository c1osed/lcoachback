package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.CourseMapper;
import com.wang.lp.lcoachback.mbg.model.Course;
import com.wang.lp.lcoachback.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CourseServiceImpl implements CourseService {
   // @Autowired
    @Resource
    CourseMapper courseMapper;
    @Override
    public void addcourse(Course course) {
     courseMapper.insert(course);
    }
}
