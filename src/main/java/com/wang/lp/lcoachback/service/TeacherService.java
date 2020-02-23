package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.mbg.model.Teacher;

import java.util.List;

public interface TeacherService {
    /**
     * 老师注册
     * @param username
     * @param password
     * @return
     */
    boolean register(String username, String password);

    /**
     * 老师登陆
     * @param username
     * @param password
     * @return
     */
    Teacher login(String username, String password);

    /**
     * 完善老师信息
     * @param teacher
     * @return
     */
    void updateTeacher(Teacher teacher);

    /**
     * 得到全部的老师
     * @return
     */
    List<Teacher> getAllTeachers();

    /**
     * 通过id得到老师的信息
     * @param id
     * @return
     */
    Teacher getteachersById(Integer id);
    /**
     * @param id
     *通过id删除老师
     * */
    void deleteTeacherById(Integer id);

    /**
     *  根据学生id查询出所有的老师
     * @param id
     * @return
     */
    List<Teacher> getAllTeacherByStudentId(Integer id);
}
