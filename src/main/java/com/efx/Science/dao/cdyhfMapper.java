package com.efx.Science.dao;

import com.efx.Science.model.cdyhf;
import com.efx.Science.model.cdyhfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdyhfMapper {
    long countByExample(cdyhfExample example);

    int deleteByExample(cdyhfExample example);

    int deleteByPrimaryKey(String yhf001);

    int insert(cdyhf record);

    int insertSelective(cdyhf record);

    List<cdyhf> selectByExample(cdyhfExample example);

    cdyhf selectByPrimaryKey(String yhf001);

    int updateByExampleSelective(@Param("record") cdyhf record, @Param("example") cdyhfExample example);

    int updateByExample(@Param("record") cdyhf record, @Param("example") cdyhfExample example);

    int updateByPrimaryKeySelective(cdyhf record);

    int updateByPrimaryKey(cdyhf record);

    List<cdyhf> selectByExampleAndPage(cdyhfExample example, RowBounds rowBounds);

    cdyhf selectByflid(Integer id);
}