package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Sexam;

public interface SExamService {

    String upload();

    /**
     * 布置作业
     * @param sexam
     */
     void addSexam(Sexam sexam);
}
