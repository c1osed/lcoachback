package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Homework;

import java.util.List;

public interface HomeWorkService {
    /**
     * 添加作业
     * @param homework
     */
    void addHomeWork(Homework homework);

    /**
     * 根据学生id查询老师信息和作业信息
     * @param sid
     * @param state
     * @return
     */

    List<Homework> getHomeWorkBySidandState(Integer sid, String state);
}
