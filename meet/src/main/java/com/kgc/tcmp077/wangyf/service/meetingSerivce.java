package com.kgc.tcmp077.wangyf.service;

import com.kgc.tcmp077.wangyf.entity.MEETINGROOM;

import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-06 23:13
 */
public interface meetingSerivce {
    List<MEETINGROOM> getList();
    int addmeetingroom(MEETINGROOM meetingroom);
}
