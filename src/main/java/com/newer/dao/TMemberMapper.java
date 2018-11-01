package com.newer.dao;


import com.newer.pojo.TMember;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TMemberMapper {
    @ResultMap("com.newer.dao.TMemberMapper.Ar2")
    @Select("select * from t_member")
    List<TMember> findAll();

    @ResultMap("com.newer.dao.TMemberMapper.Ar2")
    @Select("select * from t_member where m_name=#{mName} and m_card_no=#{mCardNo}")
    TMember findByNameNO(@Param("mName") String mName ,@Param("mCardNo") int mCardNo);
}
