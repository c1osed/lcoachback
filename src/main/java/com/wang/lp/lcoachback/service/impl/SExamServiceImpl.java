package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.SexamMapper;
import com.wang.lp.lcoachback.mbg.model.Sexam;
import com.wang.lp.lcoachback.service.SExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Service
public class SExamServiceImpl implements SExamService {
//    @Autowired
    @Resource
    SexamMapper sexamMapper;
    @Override
    public String upload() {
        return null;
    }

    @Override
    public void addSexam(Sexam sexam) {
        sexamMapper.insert(sexam);

    }
}
