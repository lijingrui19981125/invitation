package cn.kgc.service.impl;

import cn.kgc.domain.Condition;
import cn.kgc.service.DemoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    @Autowired
    private InvitationMapper invitationMapper;
    @Autowired
    private ReplyDetailMapper replyDetailMapper;

    @Override
    public PageInfo findByTitleName(Condition condition, Integer pageNum, Integer pageSize) {
        //分页查询
        //1.开启分页
        PageHelper.startPage(pageNum,pageSize);
        //2.查询数据
        List<Invitation> invitationList = invitationMapper.queryByTitleName(condition);
        //3.封装pageInfo
        PageInfo pageInfo = new PageInfo(invitationList);
        return pageInfo;
    }

    @Override
    public List<ReplyDetail> findReplyDetail(Integer invid) {
        return replyDetailMapper.queryByInvid(invid);
    }
}
