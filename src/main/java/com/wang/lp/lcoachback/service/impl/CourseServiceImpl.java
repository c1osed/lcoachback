package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.CourseMapper;
import com.wang.lp.lcoachback.mbg.model.Course;
import com.wang.lp.lcoachback.mbg.model.CourseExample;
import com.wang.lp.lcoachback.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
   // @Autowired
    @Resource
    CourseMapper courseMapper;
    @Override
    public void addcourse(Course course) {
     courseMapper.insert(course);
    }

 @Override
 public List<Course> getcoursebyteacherid(Integer id) {
  CourseExample courseExample = new CourseExample();
  courseExample.createCriteria().andTidEqualTo(id);
  List<Course> courses = courseMapper.selectByExample(courseExample);
  if(courses!=null&&courses.size()>0){
   return  courses;
  }
  return null;
 }

 @Override
 public void updatacourse(Course course) {
   courseMapper.updateByPrimaryKeySelective(course);

 }

 @Override
 public Course getCourseById(Integer id) {
  Course course = courseMapper.selectByPrimaryKey(id);
  if(course!=null){
   return course;
  }
  return null;
 }
}
