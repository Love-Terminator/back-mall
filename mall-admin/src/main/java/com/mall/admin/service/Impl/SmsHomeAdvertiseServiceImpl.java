package com.mall.admin.service.Impl;

import com.mall.admin.dao.SmsHomeAdvertiseMapper;
import com.mall.admin.pojo.SmsHomeAdvertise;
import com.mall.admin.service.SmsHomeAdvertiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SmsHomeAdvertiseServiceImpl implements SmsHomeAdvertiseService {
    @Autowired
    SmsHomeAdvertiseMapper smsHomeAdvertiseMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return smsHomeAdvertiseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insert(record);
    }

    @Override
    public int insertSelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.insertSelective(record);
    }

    @Override
    public SmsHomeAdvertise selectByPrimaryKey(Long id) {
        return smsHomeAdvertiseMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SmsHomeAdvertise record) {
        return smsHomeAdvertiseMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SmsHomeAdvertise> selectByTime(Date time) {
        return smsHomeAdvertiseMapper.selectByTime(time);
    }


}
