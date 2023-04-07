package com.mall.admin.controller;


import com.mall.admin.pojo.SmsHomeAdvertise;
import com.mall.admin.service.Impl.SmsHomeAdvertiseServiceImpl;
import com.mall.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "SmsHomeAdvertiseController")
@Tag(name = "SmsHomeAdvertiseController", description = "首页轮播广告管理")
@RequestMapping("/home/advertise")
public class SmsHomeAdvertiseController {
    @Autowired
    private SmsHomeAdvertiseServiceImpl smsHomeAdvertiseService;

    @ApiOperation("根据时间筛选出正确的轮播图信息")
    @RequestMapping(value = "/date/{date}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<SmsHomeAdvertise>> selectByTime(
            @PathVariable String date) {
        List<SmsHomeAdvertise> smsHomeAdvertiseList = smsHomeAdvertiseService.selectByTime(new Date(Long.parseLong(date)));
        return CommonResult.success(smsHomeAdvertiseList);
    }
}
