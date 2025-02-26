package com.efx.Science.dao;

import com.efx.Science.model.cduse;
import com.efx.Science.model.cduseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cduseMapper {
    long countByExample(cduseExample example);

    int deleteByExample(cduseExample example);

    int deleteByPrimaryKey(Integer use001);

    int insert(cduse record);

    int insertSelective(cduse record);

    List<cduse> selectByExample(cduseExample example);

    cduse selectByPrimaryKey(Integer use001);

    int updateByExampleSelective(@Param("record") cduse record, @Param("example") cduseExample example);

    int updateByExample(@Param("record") cduse record, @Param("example") cduseExample example);

    int updateByPrimaryKeySelective(cduse record);

    int updateByPrimaryKey(cduse record);

    List<cduse> selectByExampleAndPage(cduseExample example, RowBounds rowBounds);

    List<cduse> selectByExampleAndPage1(cduseExample example, RowBounds rowBounds);

    List<cduse> selectByExampleAndPage2(cduseExample example, RowBounds rowBounds);
}