package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.mbg.model.Homework;
import com.wang.lp.lcoachback.mbg.model.Sexam;
import com.wang.lp.lcoachback.mbg.model.Teacher;
import com.wang.lp.lcoachback.mbg.model.Texam;
import com.wang.lp.lcoachback.service.HomeWorkService;
import com.wang.lp.lcoachback.service.SExamService;
import com.wang.lp.lcoachback.service.TExamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeWorkController {
    @Autowired
    HomeWorkService homeWorkService;
    @Autowired
    TExamService tExamService;
    @Autowired
    SExamService sExamService;


    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "添加一个作业")
    @RequestMapping(value = "/api/homework", method = RequestMethod.POST)
    public CommonResult registerStudent(@RequestBody Homework homework) {
        homework.setState("0");
        //根据tid查询出所有添加的题目，然后放到学生的题库中
        List<Texam> allTexamByTid = tExamService.getAllTexamByTid(homework.getTid());
        homeWorkService.addHomeWork(homework);
        for(Texam texam:allTexamByTid){
            Sexam sexam = new Sexam();
            sexam.setQuestions(texam.getQuestions());
            sexam.setDifficulty(texam.getDifficulty());
            sexam.setCasualwork(texam.getCasualwork());
            sexam.setSanswer("");
            sexam.setTanswer(texam.getTanswer());
            sexam.setSid(homework.getSid());
            sexam.setTid(homework.getTid());
            sexam.setResolve(texam.getResolve());
            sexam.setHwid(homework.getId());
            sExamService.addSexam(sexam);
        }

        return CommonResult.success("添加作业成功");
    }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "根据学生id查询作业信息并且查询作业信息")
    @RequestMapping(value = "/api/homework", method = RequestMethod.GET)
    public CommonResult getTeacherByStudentId(Integer sid,String state) {
        List<Homework> homeWorkBySidandState = homeWorkService.getHomeWorkBySidandState(sid, state);

        return CommonResult.success(homeWorkBySidandState,"查询成功");

    }


    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "根据作业id改变作业的状态")
    @RequestMapping(value = "/api/homework/{id}", method = RequestMethod.PUT)
    public CommonResult updateHomeWorkByStudentId(@PathVariable("id") Integer id) {
        //satte=0 未提交
        //state=1 已提交
        //state=2 已批改
        Homework homeWork = homeWorkService.getHomeWork(id);
        homeWork.setState("1");
        homeWorkService.updateHomeWork(homeWork);
        return CommonResult.success("更新作业状态成功");

    }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "根据作业id改变作业的状态")
    @RequestMapping(value = "/api/homework", method = RequestMethod.PUT)
    public CommonResult updateHomeWorkByIdAndRate(Integer id,Integer seid) {
        //satte=0 未提交
        //state=1 已提交
        //state=2 已批改
        Homework homeWork = homeWorkService.getHomeWork(id);
        homeWork.setState("2");
        homeWork.setSeid(seid);
        homeWorkService.updateHomeWork(homeWork);
        return CommonResult.success("批改更新作业状态成功");

    }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "根据老师id查询作业信息并且查询作业信息")
    @RequestMapping(value = "/api/thomework", method = RequestMethod.GET)
    public CommonResult getHomeWorkByTId(Integer tid,String state) {
        List<Homework> homeWorkBySidandState = homeWorkService.getHomeWorkByTidandState(tid,state);
        return CommonResult.success(homeWorkBySidandState,"查询成功");

    }

}
