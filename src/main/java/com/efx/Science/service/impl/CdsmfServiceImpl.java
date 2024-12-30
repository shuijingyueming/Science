
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdsmdMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdsmd;
import com.efx.Science.model.cdsmdExample;
import com.efx.Science.model.cdsmdExample.Criteria;
import com.efx.Science.service.CdsmdService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
@Service
public class CdsmfServiceImpl implements CdsmdService {

    @Autowired
    private cdsmdMapper smdMapper;


    @Override
    public cdsmd getByid(Integer id) {
        return smdMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdsmdExample e1 = new cdsmdExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andSmd003Like("%"+pb.getOthersql()+"%");
        e1.setOrderByClause("smd001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdsmd smd) {
        return smdMapper.updateByPrimaryKeySelective(smd)>0?true:false;
    }

    @Override
    public cdsmd insert(cdsmd smd) {
        smdMapper.insertSelective(smd);
        return smd;
    }

    @Override
    public cdsmd selectByName(String name) {
        cdsmdExample e1 = new cdsmdExample();
        Criteria c = e1.createCriteria();
        c.andSmd003EqualTo(name);
        List<cdsmd> list = smdMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(int id) {
        smdMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<cdsmd> getAll() {
        return smdMapper.selectByExample(null);
    }


    public PageBean queryByPage(PageBean pageBean, cdsmdExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) smdMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdsmd> list = smdMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdsmd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdsmd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdsmd> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdsmd entity) {
        return false;
    }

    @Override
    public cdsmd getOne(Wrapper<cdsmd> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdsmd> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdsmd> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdsmd> getBaseMapper() {
        return null;
    }
}
