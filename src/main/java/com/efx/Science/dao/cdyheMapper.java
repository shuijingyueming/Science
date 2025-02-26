package com.efx.Science.dao;

import com.efx.Science.model.*;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface cdyheMapper {
    long countByExample(cdyheExample example);

    int deleteByExample(cdyheExample example);

    int deleteByPrimaryKey(Integer yhe001);

    int insert(cdyhe record);

    int insertSelective(cdyhe record);

    List<cdyhe> selectByExampleWithBLOBs(cdyheExample example);

    List<cdyhe> selectByExample(cdyheExample example);

    cdyhe selectByPrimaryKey(Integer yhe001);

    int updateByExampleSelective(@Param("record") cdyhe record, @Param("example") cdyheExample example);

    int updateByExampleWithBLOBs(@Param("record") cdyhe record, @Param("example") cdyheExample example);

    int updateByExample(@Param("record") cdyhe record, @Param("example") cdyheExample example);

    int updateByPrimaryKeySelective(cdyhe record);

    int updateByPrimaryKeyWithBLOBs(cdyhe record);

    int updateByPrimaryKey(cdyhe record);
    List<cdyhe> selectByExampleAndPage(cdyheExample example, RowBounds rowBounds);

    Integer countByExamplefwrc(cdyheExample e1);

    Float countByExamplejtbt(cdyheExample e1);

    Float countByExamplekcje(cdyheExample e1);

    Integer countByExample1(@Param("cdyheExample")cdyheExample e1, @Param("cdsmdExample") cdsmdExample e2);

    Integer countByExamplefwrcX1(@Param("cdyheExample")cdyheExample e1, @Param("cdyhbExample") cdyhbExample e2);

    Integer countByExamplefwrc1(@Param("cdyheExample")cdyheExample e1, @Param("cdsmdExample")cdsmdExample e2);

    Float countByExamplejtbt1(@Param("cdyheExample")cdyheExample e1, @Param("cdsmdExample")cdsmdExample e2);

    Float countByExamplekcje1(@Param("cdyheExample")cdyheExample e1, @Param("cdsmdExample")cdsmdExample e2);

    List<cdyhe> selectByExampleAndPage1(@Param("cdyheExample")cdyheExample e1, @Param("cdsmdExample")cdsmdExample e2, RowBounds rowBounds);

    Integer countByExample2(@Param("cdyheExample")cdyheExample e1, @Param("cdyhbExample")cdyhbExample e2);

    List<cdyhe> selectByExample2(@Param("cdyheExample")cdyheExample e1, @Param("cdyhbExample")cdyhbExample e2);

    List<cdyhe> selectByExampleAndPage2(@Param("cdyheExample")cdyheExample e1, @Param("cdyhbExample")cdyhbExample e2, RowBounds rowBounds);

    Integer countByExamplefwrcX(cdyheExample e1);

    Integer countByExamplefwrc2(@Param("cdyheExample")cdyheExample e1, @Param("cdyhbExample")cdyhbExample e2);

    List selectByExample1(@Param("cdyheExample")cdyheExample e1, @Param("cdsmdExample")cdsmdExample e2);
}