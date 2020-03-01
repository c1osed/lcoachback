package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
     /**
      * 添加一个课程
      * @param course
      */
     void addcourse(Course course);

     /**
      * 根据老师id得到课程信息
     * @param id
      * @return
      */
     List<Course> getcoursebyteacherid(Integer id);
     /**
      * 根据老师id得到被选择的课程信息
      * @param id
      * @return
      */
     List<Course> getchoosecoursebyteacherid(Integer id);

     /**
      * 根据id更新course
      * @param course
      * @return
      */
     void updatacourse(Course course);

     /**course
      * 根据id查询
      * @param id
      * @return
      */

     Course getCourseById(Integer id);

     /**
      * 根据学生的id查询所选的课程
      * @param id
      * @return
      */

     List<Course> getCourseByStudentId(Integer id);

}
