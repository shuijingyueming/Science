package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyhdMapper;
import com.efx.Science.model.*;
import com.efx.Science.service.CdyhdService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


@Service
public class CdyhdServiceImpl implements CdyhdService {

    @Autowired
    private cdyhdMapper yhdMapper;

    private DateFormat df = DateFormat.getDateInstance();

    @Override
    public cdyhd getByid(String id) {
        return yhdMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(cdyhd yhd) {
        yhdMapper.updateByPrimaryKeySelective(yhd);
    }

    @Override
    public cdyhd insert(cdyhd yhd) {
        yhdMapper.insertSelective(yhd);
        return yhd;
    }

    @Override
    public cdyhd serachObject(String date, int kcid) {
        cdyhdExample e1 = new cdyhdExample();
        cdyhdExample.Criteria c = e1.createCriteria();
        c.andYhd002EqualTo(kcid);
        try {
            c.andYhd003EqualTo(df.parse(date));
        }catch (ParseException e) {
            throw new RuntimeException(e);
        }
        List<cdyhd> list= yhdMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(String id) {
        yhdMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<cdyhd> getrllist(String date, int kcid) {
        cdyhdExample e1 = new cdyhdExample();
        cdyhdExample.Criteria c = e1.createCriteria();
        c.andYhd002EqualTo(kcid);
        try {
            c.andYhd003Between(df.parse(date + "-01 0:00:00"), df.parse(date + "-31 23:59:59"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return yhdMapper.selectByExample(e1);
    }

    @Override
    public void deletebykcid(int kcid,int year) {
        cdyhdExample e1 = new cdyhdExample();
        cdyhdExample.Criteria c = e1.createCriteria();
        c.andYhd002EqualTo(kcid);
        try {
            c.andYhd003Between(df.parse(year+"-01-01 00:00:00"),df.parse(year+"-12-31 23:59:59"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        yhdMapper.deleteByExample(e1);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyhdExample e1 = new cdyhdExample();
        cdyhdExample.Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andYhd002EqualTo(Integer.valueOf(pb.getOthersql()));
        e1.setOrderByClause("yhd001 desc");
        return queryByPage(pb,e1);
    }

    public PageBean queryByPage(PageBean pageBean, cdyhdExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yhdMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhd> list = yhdMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }

    @Override
    public boolean saveBatch(Collection<cdyhd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyhd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyhd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyhd entity) {
        return false;
    }

    @Override
    public cdyhd getOne(Wrapper<cdyhd> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyhd> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyhd> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyhd> getBaseMapper() {
        return null;
    }
}
