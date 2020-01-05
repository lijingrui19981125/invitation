package cn.kgc.service;

import cn.kgc.domain.Condition;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DemoService {
    PageInfo findByTitleName(Condition condition, Integer pageNum, Integer pageSize);

    List<ReplyDetail> findReplyDetail(Integer invid);
}
