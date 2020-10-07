package com.kgc.tcmp077.wangyf.service.impl;

import com.kgc.tcmp077.wangyf.entity.MEETINGROOM;
import com.kgc.tcmp077.wangyf.mapper.MEETINGROOMMapper;
import com.kgc.tcmp077.wangyf.service.meetingSerivce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-06 23:14
 */
@Service("meetingserivce")
public class meetingServiceImpl implements meetingSerivce {
    @Resource
    MEETINGROOMMapper meetingroomMapper;

    @Override
    public List<MEETINGROOM> getList() {
        List<MEETINGROOM> meetingrooms = meetingroomMapper.selectByExample(null);
        return meetingrooms;
    }

    @Override
    public int addmeetingroom(MEETINGROOM meetingroom) {
        int i = meetingroomMapper.insertSelective(meetingroom);
        return i;
    }
}
