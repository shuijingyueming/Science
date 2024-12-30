package com.efx.Science.dao;

import com.efx.Science.model.cdhbb;
import com.efx.Science.model.cdhbbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdhbbMapper {
    long countByExample(cdhbbExample example);

    int deleteByExample(cdhbbExample example);

    int deleteByPrimaryKey(Integer hbb001);

    int insert(cdhbb record);

    int insertSelective(cdhbb record);

    List<cdhbb> selectByExample(cdhbbExample example);

    cdhbb selectByPrimaryKey(Integer hbb001);

    int updateByExampleSelective(@Param("record") cdhbb record, @Param("example") cdhbbExample example);

    int updateByExample(@Param("record") cdhbb record, @Param("example") cdhbbExample example);

    int updateByPrimaryKeySelective(cdhbb record);

    int updateByPrimaryKey(cdhbb record);

    List<cdhbb> selectByExampleAndPage(cdhbbExample example, RowBounds rowBounds);
}