package com.mall.admin;

import com.mall.admin.pojo.SmsHomeAdvertise;
import com.mall.admin.service.Impl.SmsHomeAdvertiseServiceImpl;
import com.mall.admin.util.DateUtil;
import com.mall.common.api.CommonResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MainAdminTest{
    @Autowired
    SmsHomeAdvertiseServiceImpl smsHomeAdvertiseService;

    @Test
    public void test1()
    {
        System.out.println(System.currentTimeMillis());
        List<SmsHomeAdvertise> smsHomeAdvertiseList = smsHomeAdvertiseService.selectByTime(new Date(System.currentTimeMillis()));
        CommonResult<List<SmsHomeAdvertise>> commonResult = new CommonResult<>();
        System.out.println(CommonResult.success(smsHomeAdvertiseList).getCode());
    }
}
