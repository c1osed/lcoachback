package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.SexamMapper;
import com.wang.lp.lcoachback.mbg.model.Sexam;
import com.wang.lp.lcoachback.service.SExamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    @Override
    public Sexam getSexam(Integer id) {
        Sexam sexam = sexamMapper.selectByPrimaryKey(id);
        if(sexam!=null){
            return  sexam;
        }
        return null;
    }

    @Override
    public void updateSexam(Sexam sexam) {
        sexamMapper.updateByPrimaryKeySelective(sexam);

    }
}
