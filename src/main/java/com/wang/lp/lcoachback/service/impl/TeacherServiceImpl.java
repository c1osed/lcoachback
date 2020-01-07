package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Override
    public boolean register(String username, String password) {
        return false;
    }

    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public boolean updateTeacher(Student student) {
        return false;
    }
}
