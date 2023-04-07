package com.mall.admin.service;

import com.mall.admin.pojo.SmsHomeAdvertise;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface SmsHomeAdvertiseService {
    //根据id删除轮播图信息
    int deleteByPrimaryKey(@Param("id") Long id);

    //插入轮播图信息，输入信息必须是完整的
    int insert(SmsHomeAdvertise record);

    //插入轮播图信息，输入信息数不必完整
    int insertSelective(SmsHomeAdvertise record);

    //根据id获取轮播图信息
    SmsHomeAdvertise selectByPrimaryKey(@Param("id") Long id);

    //更新轮播图信息，输入信息不必完整
    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    //更新轮播图信息，输入信息必须完整
    int updateByPrimaryKey(SmsHomeAdvertise record);

    //获取需要轮播的轮播图信息
    List<SmsHomeAdvertise> selectByTime(@Param("time") Date time);
}
