package com.efx.Science.dao;

import com.efx.Science.model.cdyha;
import com.efx.Science.model.cdyhaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdyhaMapper {
    long countByExample(cdyhaExample example);

    int deleteByExample(cdyhaExample example);

    int deleteByPrimaryKey(Integer yha001);

    int insert(cdyha record);

    int insertSelective(cdyha record);

    List<cdyha> selectByExample(cdyhaExample example);

    cdyha selectByPrimaryKey(Integer yha001);

    int updateByExampleSelective(@Param("record") cdyha record, @Param("example") cdyhaExample example);

    int updateByExample(@Param("record") cdyha record, @Param("example") cdyhaExample example);

    int updateByPrimaryKeySelective(cdyha record);

    int updateByPrimaryKey(cdyha record);

    List<cdyha> selectByExampleAndPage(cdyhaExample example, RowBounds rowBounds);
}