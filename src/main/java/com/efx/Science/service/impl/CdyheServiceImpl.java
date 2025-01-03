
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyheMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhe;
import com.efx.Science.model.cdyheExample;
import com.efx.Science.model.cdyheExample.Criteria;
import com.efx.Science.model.cdyheWithBLOBs;
import com.efx.Science.service.CdyheService;
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
public class CdyheServiceImpl implements CdyheService {

    @Autowired
    private cdyheMapper yheMapper;


    @Override
    public cdyhe getByid(Integer id) {
        return yheMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
//        if(pb.getOthersql()!=null) c.andYhe003Like("%"+pb.getOthersql()+"%");
        e1.setOrderByClause("yhe001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdyheWithBLOBs yhe) {
        return yheMapper.updateByPrimaryKeySelective(yhe)>0?true:false;
    }

    @Override
    public cdyhe insert(cdyheWithBLOBs yhe) {
        yheMapper.insertSelective(yhe);
        return yhe;
    }

    @Override
    public cdyhe selectByName(String name) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
//        c.andYhe002EqualTo(name);
        List<cdyhe> list = yheMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(int id) {
        yheMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer countBylsid(int id) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe005EqualTo(id);
        return Math.toIntExact(yheMapper.countByExample(e1));
    }


    public PageBean queryByPage(PageBean pageBean, cdyheExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yheMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhe> list = yheMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdyhe> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyhe> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyhe> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyhe entity) {
        return false;
    }

    @Override
    public cdyhe getOne(Wrapper<cdyhe> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyhe> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyhe> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyhe> getBaseMapper() {
        return null;
    }
}
