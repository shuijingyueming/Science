package com.efx.Science.dao;

import com.efx.Science.model.cdsmd;
import com.efx.Science.model.cdsmdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cdsmdMapper {
    long countByExample(cdsmdExample example);

    int deleteByExample(cdsmdExample example);

    int deleteByPrimaryKey(Integer smd001);

    int insert(cdsmd record);

    int insertSelective(cdsmd record);

    List<cdsmd> selectByExample(cdsmdExample example);

    cdsmd selectByPrimaryKey(Integer smd001);

    int updateByExampleSelective(@Param("record") cdsmd record, @Param("example") cdsmdExample example);

    int updateByExample(@Param("record") cdsmd record, @Param("example") cdsmdExample example);

    int updateByPrimaryKeySelective(cdsmd record);

    int updateByPrimaryKey(cdsmd record);
}