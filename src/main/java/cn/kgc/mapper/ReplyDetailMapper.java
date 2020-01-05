package cn.kgc.mapper;

import cn.kgc.domain.ReplyDetail;

public interface ReplyDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReplyDetail record);

    int insertSelective(ReplyDetail record);

    ReplyDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReplyDetail record);

    int updateByPrimaryKey(ReplyDetail record);
}