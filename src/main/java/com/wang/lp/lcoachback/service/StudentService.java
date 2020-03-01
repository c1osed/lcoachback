package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    /**
     * 学生注册
     * @param username
     * @param password
     * @return
     */
    boolean register(String username, String password);

    /**
     * 学生登陆
     * @param username
     * @param password
     * @return
     */
    Student login(String username, String password);
    /**
     *得到所有的学生
     * @return
     */
    List<Student> getStudentsList();

    /**
     * 根据id查询学生
     * @param
     * @return
     */
    Student getStudentById(Integer id);

    /**
     * 更新学生信息
     * @param student
     */
    void updateStudent(Student student);

    /**
     * @param id
     *通过id删除学生
     * */
    void deleteStudentById(Integer id);

    /**
     * 根据老师id查询所有的学生
     * @param teacherid
     * @return
     */
    List<Student> getStudentByteacherId(Integer teacherid);

    /**
     * 根据老师id和课程类型查询不同类型所有的学生
     * @param teacherid
     * @return
     */
    List<Student> getStudentByteacherIdandCourseTypeId(Integer teacherid,String course_type);






}
