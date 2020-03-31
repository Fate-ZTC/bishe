package com.xxl.api.admin.controller;

import com.xxl.api.admin.controller.annotation.PermessionLimit;
import com.xxl.api.admin.core.model.ReturnT;
import com.xxl.api.admin.core.model.TestDemo;
import com.xxl.api.admin.core.model.XxlApiUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;




/**
 * @ClassName TestController
 * @Description TODO
 * @Author ZTC
 * @Date 2020/3/29 9:22
 * @Version 1.0
 **/
@Controller
@Api(value="测试controller",tags={"测试接口controller"})
public class TestController {
    @Autowired
    TestDemo testDemo;

    @GetMapping("getUserByName")
    @ApiParam(name = "用户名", value = "用户名")
    @ResponseBody
    @PermessionLimit(limit = false)
    public ReturnT getTestUser(String name) {
        ReturnT returnT = new ReturnT();
        testDemo.setName(name);
        if (!testDemo.getName().equals("张天成")){
            returnT.setCode(500);
            returnT.setMsg("接口错误");
        }else{
            returnT.setCode(200);
            returnT.setMsg("获取成功");
            returnT.setContent(testDemo);
        }
        return returnT;
    }
}
