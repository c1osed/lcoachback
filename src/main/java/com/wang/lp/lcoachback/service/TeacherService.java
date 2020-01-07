package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Student;

public interface TeacherService {
    /**
     * 老师注册
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
    boolean login(String username, String password);

    /**
     * 完善学生信息
     * @param student
     * @return
     */
    boolean updateTeacher(Student student);
}
