
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdhbbMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdhbb;
import com.efx.Science.model.cdhbbExample;
import com.efx.Science.model.cdhbbExample.Criteria;
import com.efx.Science.service.CdhbbService;
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
public class CdhbbServiceImpl implements CdhbbService {

    @Autowired
    private cdhbbMapper hbbMapper;


    @Override
    public cdhbb getByid(Integer id) {
        return hbbMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdhbbExample e1 = new cdhbbExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andHbb002Like("%"+pb.getOthersql()+"%");
        e1.setOrderByClause("hbb001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdhbb hbb) {
        return hbbMapper.updateByPrimaryKeySelective(hbb)>0?true:false;
    }

    @Override
    public cdhbb insert(cdhbb hbb) {
        hbbMapper.insertSelective(hbb);
        return hbb;
    }

    @Override
    public cdhbb selectByName(String name) {
        cdhbbExample e1 = new cdhbbExample();
        Criteria c = e1.createCriteria();
        c.andHbb002EqualTo(name);
        List<cdhbb> list = hbbMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(int id) {
        hbbMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<cdhbb> getAll() {
        return hbbMapper.selectByExample(null);
    }


    public PageBean queryByPage(PageBean pageBean, cdhbbExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) hbbMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdhbb> list = hbbMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdhbb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdhbb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdhbb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdhbb entity) {
        return false;
    }

    @Override
    public cdhbb getOne(Wrapper<cdhbb> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdhbb> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdhbb> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdhbb> getBaseMapper() {
        return null;
    }
}
