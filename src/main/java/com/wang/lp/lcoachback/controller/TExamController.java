package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.mbg.model.Texam;
import com.wang.lp.lcoachback.service.TExamService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TExamController {
    @Autowired
    TExamService tExamService;

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "老师上传一个题目")
    @RequestMapping(value = "/api/texam", method = RequestMethod.POST)
    public CommonResult registerStudent(@RequestBody Texam texam) {
        texam.setIschoose("0");
        tExamService.addTexam(texam);
        return CommonResult.success("老师添加题目成功");
    }


    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "查找老师上传的题目")
    @RequestMapping(value = "/api/texam", method = RequestMethod.GET)
    public CommonResult getAllTexam() {
        List<Texam> allTexam = tExamService.getAllTexam();
        return CommonResult.success(allTexam,"查找老师的题目成功");
    }

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id去设置题目是否被选择")
    @RequestMapping(value = "/api/addtexam/{id}", method = RequestMethod.PUT)
    public CommonResult updateAddTexam(@PathVariable("id") Integer id) {
//        tExamService.
        Texam texam = tExamService.selectTexamById(id);
        texam.setIschoose("1");
        tExamService.update(texam);
        return CommonResult.success("题目添加成功");
    }


    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据id去设置题目移除选择")
    @RequestMapping(value = "/api/removetexam/{id}", method = RequestMethod.PUT)
    public CommonResult updateRemoveTexam(@PathVariable("id") Integer id) {
//        tExamService.
        Texam texam = tExamService.selectTexamById(id);
        texam.setIschoose("0");
        tExamService.update(texam);
        return CommonResult.success("题目移除成功");
    }


    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "根据老师id去查询被选择的题目")
    @RequestMapping(value = "/api/texams/{id}", method = RequestMethod.GET)
    public CommonResult getAllTexamByTid(@PathVariable("id") Integer id) {
    //未被使用
        return CommonResult.success("题目移除成功");
    }
}
