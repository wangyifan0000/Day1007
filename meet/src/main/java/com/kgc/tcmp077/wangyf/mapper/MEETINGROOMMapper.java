package com.kgc.tcmp077.wangyf.mapper;

import com.kgc.tcmp077.wangyf.entity.MEETINGROOM;
import com.kgc.tcmp077.wangyf.entity.MEETINGROOMExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MEETINGROOMMapper {
    int countByExample(MEETINGROOMExample example);

    int deleteByExample(MEETINGROOMExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MEETINGROOM record);

    int insertSelective(MEETINGROOM record);

    List<MEETINGROOM> selectByExample(MEETINGROOMExample example);

    MEETINGROOM selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MEETINGROOM record, @Param("example") MEETINGROOMExample example);

    int updateByExample(@Param("record") MEETINGROOM record, @Param("example") MEETINGROOMExample example);

    int updateByPrimaryKeySelective(MEETINGROOM record);

    int updateByPrimaryKey(MEETINGROOM record);
}