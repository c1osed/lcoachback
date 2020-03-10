package com.wang.lp.lcoachback.service;

import com.wang.lp.lcoachback.mbg.model.Sexam;
import com.wang.lp.lcoachback.mbg.model.Texam;

import javax.validation.constraints.Max;
import java.util.List;

public interface TExamService {

    /**
     * 添加我的题目
     * @param sexam
     */
    void addTexam(Texam texam);

    /**
     * 查找老师所有的题目
     * @return
     */
    void update(Texam texam);

    List<Texam> getAllTexam();

    Texam selectTexamById(Integer id);


}
