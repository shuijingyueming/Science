package com.efx.Science.dao;

import com.efx.Science.model.cdhba;
import com.efx.Science.model.cdhbaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdhbaMapper {
    long countByExample(cdhbaExample example);

    int deleteByExample(cdhbaExample example);

    int deleteByPrimaryKey(Integer hba001);

    int insert(cdhba record);

    int insertSelective(cdhba record);

    List<cdhba> selectByExampleWithBLOBs(cdhbaExample example);

    List<cdhba> selectByExample(cdhbaExample example);

    cdhba selectByPrimaryKey(Integer hba001);

    int updateByExampleSelective(@Param("record") cdhba record, @Param("example") cdhbaExample example);

    int updateByExampleWithBLOBs(@Param("record") cdhba record, @Param("example") cdhbaExample example);

    int updateByExample(@Param("record") cdhba record, @Param("example") cdhbaExample example);

    int updateByPrimaryKeySelective(cdhba record);

    int updateByPrimaryKeyWithBLOBs(cdhba record);

    int updateByPrimaryKey(cdhba record);

    List<cdhba> selectByExampleAndPage(cdhbaExample example, RowBounds rowBounds);
}