package com.efx.Science.dao;

import com.efx.Science.model.cdyhg;
import com.efx.Science.model.cdyhgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdyhgMapper {
    long countByExample(cdyhgExample example);

    int deleteByExample(cdyhgExample example);

    int deleteByPrimaryKey(String yhg001);

    int insert(cdyhg record);

    int insertSelective(cdyhg record);

    List<cdyhg> selectByExampleWithBLOBs(cdyhgExample example);

    List<cdyhg> selectByExample(cdyhgExample example);

    cdyhg selectByPrimaryKey(String yhg001);

    int updateByExampleSelective(@Param("record") cdyhg record, @Param("example") cdyhgExample example);

    int updateByExampleWithBLOBs(@Param("record") cdyhg record, @Param("example") cdyhgExample example);

    int updateByExample(@Param("record") cdyhg record, @Param("example") cdyhgExample example);

    int updateByPrimaryKeySelective(cdyhg record);

    int updateByPrimaryKeyWithBLOBs(cdyhg record);

    int updateByPrimaryKey(cdyhg record);

    List<cdyhg> selectByExampleAndPage(cdyhgExample example, RowBounds rowBounds);
}