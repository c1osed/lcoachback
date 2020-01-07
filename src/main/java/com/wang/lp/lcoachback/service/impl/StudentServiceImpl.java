package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.StudentMapper;
import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.mbg.model.StudentExample;
import com.wang.lp.lcoachback.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Override
    public boolean register(String username, String password) {
         //查询是否有相同的用户
        StudentExample example = new StudentExample();
        example.createCriteria().andNameEqualTo(username);
        List<Student> students = studentMapper.selectByExample(example);
        if(students.size()>0){
            return false;
        }
        Student student = new Student();
        student.setName(username);
        student.setPassword(password);
        studentMapper.insert(student);
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students!=null&&students.size()>0){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        int i = studentMapper.updateByPrimaryKey(student);
        if(i>0){
            return true;
        }
        return false;
    }
}
