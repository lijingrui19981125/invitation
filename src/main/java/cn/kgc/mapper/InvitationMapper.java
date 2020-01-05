package cn.kgc.mapper;

import cn.kgc.domain.Invitation;

public interface InvitationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    Invitation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}