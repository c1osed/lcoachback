package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.StudentMapper;
import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.mbg.model.StudentExample;
import com.wang.lp.lcoachback.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
//  @Autowired
    @Resource
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
    public Student login(String username, String password) {
        StudentExample studentExample = new StudentExample();
        studentExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        List<Student> students = studentMapper.selectByExample(studentExample);
        if(students!=null&&students.size()>0){
            return students.get(0);
        }
        return null;
    }
    @Override
    public List<Student> getStudentsList() {

        return studentMapper.selectByExample(null);
    }

    @Override
    public Student getStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateByPrimaryKeySelective(student);

    }

    @Override
    public void deleteStudentById(Integer id) {
        studentMapper.deleteByPrimaryKey(id);

    }
}
