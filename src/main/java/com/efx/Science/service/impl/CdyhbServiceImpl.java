
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyhbMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhb;
import com.efx.Science.model.cdyhbExample;
import com.efx.Science.model.cdyhbExample.Criteria;
import com.efx.Science.service.CdyhbService;
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
public class CdyhbServiceImpl implements CdyhbService {

    @Autowired
    private cdyhbMapper yhbMapper;


    @Override
    public cdyhb getByid(Integer id) {
        return yhbMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyhbExample e1 = new cdyhbExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andYhb004Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql1()!=null)c.andYhb002EqualTo(Integer.valueOf(pb.getOthersql1()));
        e1.setOrderByClause("yhb001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdyhb yhb) {
        return yhbMapper.updateByPrimaryKeySelective(yhb)>0?true:false;
    }

    @Override
    public cdyhb insert(cdyhb yhb) {
        yhbMapper.insertSelective(yhb);
        return yhb;
    }

    @Override
    public cdyhb selectByName(String name, Integer id) {
        cdyhbExample e1 = new cdyhbExample();
        Criteria c = e1.createCriteria();
        c.andYhb004EqualTo(name);
        if(id!=null) c.andYhb002EqualTo(id);
        List<cdyhb> list = yhbMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(int id) {
        yhbMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<cdyhb> getAll() {
        return yhbMapper.selectByExample(null);
    }

    @Override
    public Integer countByExample() {
        return Math.toIntExact(yhbMapper.countByExample(null));
    }


    public PageBean queryByPage(PageBean pageBean, cdyhbExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yhbMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhb> list = yhbMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdyhb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyhb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyhb> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyhb entity) {
        return false;
    }

    @Override
    public cdyhb getOne(Wrapper<cdyhb> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyhb> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyhb> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyhb> getBaseMapper() {
        return null;
    }
}
