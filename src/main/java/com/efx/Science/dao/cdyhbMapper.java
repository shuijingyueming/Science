package com.efx.Science.dao;

import com.efx.Science.model.cdyhb;
import com.efx.Science.model.cdyhbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdyhbMapper {
    long countByExample(cdyhbExample example);

    int deleteByExample(cdyhbExample example);

    int deleteByPrimaryKey(Integer yhb001);

    int insert(cdyhb record);

    int insertSelective(cdyhb record);

    List<cdyhb> selectByExample(cdyhbExample example);

    cdyhb selectByPrimaryKey(Integer yhb001);

    int updateByExampleSelective(@Param("record") cdyhb record, @Param("example") cdyhbExample example);

    int updateByExample(@Param("record") cdyhb record, @Param("example") cdyhbExample example);

    int updateByPrimaryKeySelective(cdyhb record);

    int updateByPrimaryKey(cdyhb record);

    List<cdyhb> selectByExampleAndPage(cdyhbExample example, RowBounds rowBounds);
}