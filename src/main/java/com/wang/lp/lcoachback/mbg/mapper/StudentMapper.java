package com.wang.lp.lcoachback.mbg.mapper;

import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.mbg.model.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> getStudentByteacherId(Integer teacherid);

    List<Student> getStudentByteacherIdandCourseTypeId(@Param("teacherid") Integer integerid,@Param("coursetype")String coursetype);
}