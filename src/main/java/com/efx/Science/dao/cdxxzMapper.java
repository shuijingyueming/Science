package com.efx.Science.dao;

import com.efx.Science.model.cdxxz;
import com.efx.Science.model.cdxxzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface cdxxzMapper {
    long countByExample(cdxxzExample example);

    int deleteByExample(cdxxzExample example);

    int deleteByPrimaryKey(Integer xxz001);

    int insert(cdxxz record);

    int insertSelective(cdxxz record);

    List<cdxxz> selectByExample(cdxxzExample example);

    cdxxz selectByPrimaryKey(Integer xxz001);

    int updateByExampleSelective(@Param("record") cdxxz record, @Param("example") cdxxzExample example);

    int updateByExample(@Param("record") cdxxz record, @Param("example") cdxxzExample example);

    int updateByPrimaryKeySelective(cdxxz record);

    int updateByPrimaryKey(cdxxz record);
}