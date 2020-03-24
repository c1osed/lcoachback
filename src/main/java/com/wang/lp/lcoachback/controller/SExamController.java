package com.wang.lp.lcoachback.controller;

import com.wang.lp.lcoachback.common.api.CommonResult;
import com.wang.lp.lcoachback.mbg.model.Sexam;
import com.wang.lp.lcoachback.service.SExamService;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class SExamController {
    @Autowired
    SExamService sExamService;
    private static final Logger LOGGER = LoggerFactory.getLogger(SExamController.class) ;

    @CrossOrigin
    @ResponseBody
    @ApiOperation(value = "上传文件")
    @RequestMapping(value = "/api/uploadurl",method = RequestMethod.POST)
    public CommonResult selectStudentByTeacherId( MultipartFile file) throws  Exception {
        //获取上传文件名,包含后缀
        String originalFilename = file.getOriginalFilename();
        //获取后缀
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
        //保存的文件名
        String dFileName = UUID.randomUUID()+substring;
        //保存路径
        //springboot 默认情况下只能加载 resource文件夹下静态资源文件
//        String path = "D:/workspace/demo2/src/main/resources/static/image/";
//        D:\ideaspace\lcoachback\src\main\resources\static\image
        String path = "D:/ideaspace/lcoachback/src/main/resources/static/images/";
//        String path="D:/桌面/image";
//        if(path)
        //生成保存文件
        File uploadFile = new File(path+dFileName);
//        System.out.println(uploadFile);
//        if(!uploadFile.exists()&&uploadFile.isDirectory())
        //将上传文件保存到路径
        try {
            file.transferTo(uploadFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String url = "http://127.0.0.1:8081/images/";
//        return "上传"+dFileName+"成功";
//        return dFileName;
        return CommonResult.success(dFileName,"上传成功");
    }


//    @ResponseBody
//    @CrossOrigin
//    @ApiOperation(value = "上传一个题目")
//    @RequestMapping(value = "/api/sexam", method = RequestMethod.POST)
//    public CommonResult registerStudent(Sexam sexam) {
//        sExamService.addSexam(sexam);
//        return CommonResult.success("添加题目成功");
//    }

    @ResponseBody
    @CrossOrigin
    @ApiOperation(value = "学生保存题目的答案")
    @RequestMapping(value = "/api/sexam", method = RequestMethod.PUT)
    public CommonResult registerStudent(Integer id,String sanswer) {
        Sexam sexam = sExamService.getSexam(id);
        sexam.setSanswer(sanswer);
        sExamService.updateSexam(sexam);
        return CommonResult.success("保存题目答案成功");
    }


}
