package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.TeacherMapper;
import com.wang.lp.lcoachback.mbg.model.Student;
import com.wang.lp.lcoachback.mbg.model.Teacher;
import com.wang.lp.lcoachback.mbg.model.TeacherExample;
import com.wang.lp.lcoachback.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    //@Autowired
    @Resource
    TeacherMapper teacherMapper;
    @Override
    public boolean register(String username, String password) {
        return false;
    }

    @Override
    public Teacher login(String username, String password) {

        TeacherExample teacherExample = new TeacherExample();
        teacherExample.createCriteria().andNameEqualTo(username).andPasswordEqualTo(password);
        List<Teacher> teachers = teacherMapper.selectByExample(teacherExample);
        if(teachers.size()>0&&teachers!=null){
            return teachers.get(0);
        }
        return  null;
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        teacherMapper.updateByPrimaryKeySelective(teacher);

    }

    @Override
    public List<Teacher> getAllTeachers() {
        List<Teacher> teachers = teacherMapper.selectByExample(null);
        return teachers;
    }

    @Override
    public Teacher getteachersById(Integer id) {
        Teacher teacher = teacherMapper.selectByPrimaryKey(id);
        return teacher;
    }

    @Override
    public void deleteTeacherById(Integer id) {
        teacherMapper.deleteByPrimaryKey(id);

    }

    @Override
    public List<Teacher> getAllTeacherByStudentId(Integer id) {
        List<Teacher> teachersByStudentId = teacherMapper.getTeachersByStudentId(id);
        if(teachersByStudentId!=null&&teachersByStudentId.size()>0){
            return teachersByStudentId;
        }

        return null;
    }
}
