
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyhcMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhc;
import com.efx.Science.model.cdyhcExample;
import com.efx.Science.model.cdyhcExample.Criteria;
import com.efx.Science.service.CdyhcService;
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
public class CdyhcServiceImpl implements CdyhcService {

    @Autowired
    private cdyhcMapper yhcMapper;


    @Override
    public cdyhc getByid(Integer id) {
        return yhcMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean update(cdyhc yhc) {
        return yhcMapper.updateByPrimaryKeySelective(yhc)>0?true:false;
    }

    @Override
    public cdyhc insert(cdyhc yhc) {
        yhcMapper.insertSelective(yhc);
        return yhc;
    }

    @Override
    public cdyhc selectByName(String name) {
        cdyhcExample e1 = new cdyhcExample();
        Criteria c = e1.createCriteria();
        c.andYhc003EqualTo(name);
        List<cdyhc> list = yhcMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public List<cdyhc> getAll(String id,String name) {
        cdyhcExample e1 = new cdyhcExample();
        Criteria c = e1.createCriteria();
        if(id!=null&&!id.isEmpty())c.andYhc002EqualTo(Integer.valueOf(id));
        if(name!=null&&!name.isEmpty())c.andYhc003Like("%"+name+"%");
        return yhcMapper.selectByExample(e1);
    }

    @Override
    public void delete(int id) {
        yhcMapper.deleteByPrimaryKey(id);
    }


    @Override
    public boolean saveBatch(Collection<cdyhc> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyhc> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyhc> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyhc entity) {
        return false;
    }

    @Override
    public cdyhc getOne(Wrapper<cdyhc> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyhc> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyhc> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyhc> getBaseMapper() {
        return null;
    }
}
