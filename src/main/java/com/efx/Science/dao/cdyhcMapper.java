package com.efx.Science.dao;

import com.efx.Science.model.cdyhc;
import com.efx.Science.model.cdyhcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cdyhcMapper {
    long countByExample(cdyhcExample example);

    int deleteByExample(cdyhcExample example);

    int deleteByPrimaryKey(Integer yhc001);

    int insert(cdyhc record);

    int insertSelective(cdyhc record);

    List<cdyhc> selectByExampleWithBLOBs(cdyhcExample example);

    List<cdyhc> selectByExample(cdyhcExample example);

    cdyhc selectByPrimaryKey(Integer yhc001);

    int updateByExampleSelective(@Param("record") cdyhc record, @Param("example") cdyhcExample example);

    int updateByExampleWithBLOBs(@Param("record") cdyhc record, @Param("example") cdyhcExample example);

    int updateByExample(@Param("record") cdyhc record, @Param("example") cdyhcExample example);

    int updateByPrimaryKeySelective(cdyhc record);

    int updateByPrimaryKeyWithBLOBs(cdyhc record);

    int updateByPrimaryKey(cdyhc record);
}