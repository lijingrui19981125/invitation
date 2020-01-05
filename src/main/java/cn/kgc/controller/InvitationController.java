package cn.kgc.controller;

import cn.kgc.domain.Condition;
import cn.kgc.service.DemoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/invitation")
public class InvitationController {

    @Autowired
    DemoService demoService;

    @RequestMapping("/list")
    public ModelAndView list(Condition condition,
                             @RequestParam(defaultValue = "1") Integer pageNum,
                             ModelAndView mv,
                             HttpSession session){
        PageInfo pageInfo = demoService.findByTitleName(condition, pageNum, 4);

        mv.addObject("pageInfo",pageInfo);
        mv.addObject("condition",condition);

        mv.setViewName("main");
        return mv;
    }

}
