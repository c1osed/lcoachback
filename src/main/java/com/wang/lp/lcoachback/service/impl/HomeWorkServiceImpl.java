package com.wang.lp.lcoachback.service.impl;

import com.wang.lp.lcoachback.mbg.mapper.HomeworkMapper;
import com.wang.lp.lcoachback.mbg.model.Homework;
import com.wang.lp.lcoachback.service.HomeWorkService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HomeWorkServiceImpl implements HomeWorkService {
    @Resource
    HomeworkMapper homeworkMapper;
    @Override
    public void addHomeWork(Homework homework) {

        homeworkMapper.insert(homework);

    }

    @Override
    public List<Homework> getHomeWorkBySidandState(Integer sid, String state) {
        List<Homework> homeWorkBySidAndState = homeworkMapper.getHomeWorkBySidAndState(sid, state);
        if(homeWorkBySidAndState!=null&&homeWorkBySidAndState.size()>0){
            return homeWorkBySidAndState;
        }
        return null;
    }

    @Override
    public List<Homework> getHomeWorkByTidandState(Integer tid, String state) {
        List<Homework> homeWorkBySidAndState = homeworkMapper.getHomeWorkByTidAndState(tid, state);
        if(homeWorkBySidAndState!=null&&homeWorkBySidAndState.size()>0){
            return homeWorkBySidAndState;
        }
        return null;
    }

    @Override
    public Homework getHomeWork(Integer id) {
        Homework homework = homeworkMapper.selectByPrimaryKey(id);
        if(homework!=null){
            return homework;
        }
        return null;
    }

    @Override
    public void updateHomeWork(Homework homework) {
        homeworkMapper.updateByPrimaryKeySelective(homework);

    }
}
