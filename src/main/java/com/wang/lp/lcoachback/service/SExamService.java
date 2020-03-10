package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Sexam;

public interface SExamService {

    String upload();

    /**
     * 添加我的题目
     * @param sexam
     */
     void addSexam(Sexam sexam);
}
