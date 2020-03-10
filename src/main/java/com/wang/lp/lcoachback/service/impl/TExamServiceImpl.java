package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.TexamMapper;
import com.wang.lp.lcoachback.mbg.model.Texam;
import com.wang.lp.lcoachback.service.TExamService;
import com.wang.lp.lcoachback.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TExamServiceImpl implements TExamService {
    @Resource
    TexamMapper texamMapper;
    @Override
    public void addTexam(Texam texam) {
        texamMapper.insert(texam);

    }

    @Override
    public void update(Texam texam) {
        texamMapper.updateByPrimaryKeySelective(texam);
    }

    @Override
    public List<Texam> getAllTexam() {
        List<Texam> texams = texamMapper.selectByExample(null);
        if(texams!=null&&texams.size()>0){
            return  texams;
        }
        return null;
    }

    @Override
    public Texam selectTexamById(Integer id) {
        Texam texam = texamMapper.selectByPrimaryKey(id);
        if(texam!=null){
            return  texam;
        }
        return null;
    }
}
