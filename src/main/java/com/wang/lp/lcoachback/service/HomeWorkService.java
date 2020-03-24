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

    /**
     * 根据老师id和状态查询出所有的作业
     * @param tid
     * @param state
     * @return
     */

    List<Homework>  getHomeWorkByTidandState(Integer tid,String state);

    /**
     * 根据id查找作业
     * @param id
     * @return
     */
    Homework getHomeWork(Integer id);

    /**
     * 根据id更新作业
     * @param homework
     */
    void updateHomeWork(Homework homework);
}
