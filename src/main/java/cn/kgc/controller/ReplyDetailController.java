package cn.kgc.controller;

import cn.kgc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/replyDetail")
public class ReplyDetailController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/toReply")
    public ModelAndView toReply(Integer invid, ModelAndView mv){
        List<ReplyDetail> replyDetailList = demoService.findReplyDetail(invid);
        mv.addObject("replyDetailList",replyDetailList);
        mv.setViewName("reply");
        return mv;
    }
}
