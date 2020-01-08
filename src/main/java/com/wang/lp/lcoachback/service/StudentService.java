package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Student;
import org.springframework.stereotype.Service;

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
     * 完善学生信息
     * @param student
     * @return
     */
    boolean updateStudent(Student student);



}
