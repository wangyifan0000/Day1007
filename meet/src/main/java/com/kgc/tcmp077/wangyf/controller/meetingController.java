package com.kgc.tcmp077.wangyf.controller;

import com.kgc.tcmp077.wangyf.entity.MEETINGROOM;
import com.kgc.tcmp077.wangyf.service.impl.meetingServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-06 23:16
 */
@Controller
public class meetingController {
    @Resource
    meetingServiceImpl meetingService;
    @RequestMapping("/")
    public String toGetList(Model model){
        List<MEETINGROOM> list = meetingService.getList();
        model.addAttribute("list",list);
        return "main";
    }
    @RequestMapping("/toAddMeeting")
    public String toAddMeeting(){
        return "toAddMeeting";
    }
    @RequestMapping("/doAddMeeting")
    public String doAddMeeting(String meetingname, Date date,String advancename,Model model){
        MEETINGROOM meetingroom = new MEETINGROOM();
        meetingroom.setId(null);
        meetingroom.setAdvanceName(advancename);
        meetingroom.setMeetingOrder(date);
        meetingroom.setMeetingName(meetingname);
        int addmeetingroom = meetingService.addmeetingroom(meetingroom);
        if(addmeetingroom>0){
            model.addAttribute("success","预订成功");
        }else{
            model.addAttribute("fail","预定失败");
        }
        return "redirect:/";
    }
}
