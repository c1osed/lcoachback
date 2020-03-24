package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Sexam;

public interface SExamService {

    String upload();

    /**
     * 布置作业
     * @param sexam
     */
     void addSexam(Sexam sexam);

    /**
     * 根据id查询作业
     * @param id
     * @return
     */

     Sexam getSexam(Integer id);

    /**
     * 修改作业
     * @param sexam
     */
     void updateSexam(Sexam sexam);
}
