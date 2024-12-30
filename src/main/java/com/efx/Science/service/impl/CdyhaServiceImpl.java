
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyhaMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyha;
import com.efx.Science.model.cdyhaExample;
import com.efx.Science.model.cdyhaExample.Criteria;
import com.efx.Science.service.CdyhaService;
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
public class CdyhaServiceImpl implements CdyhaService {

    @Autowired
    private cdyhaMapper yhaMapper;


    @Override
    public cdyha getByid(Integer id) {
        return yhaMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyhaExample e1 = new cdyhaExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andYha002Like("%"+pb.getOthersql()+"%");
        e1.setOrderByClause("yha001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdyha yha) {
        return yhaMapper.updateByPrimaryKeySelective(yha)>0?true:false;
    }

    @Override
    public cdyha insert(cdyha yha) {
        yhaMapper.insertSelective(yha);
        return yha;
    }

    @Override
    public cdyha selectByName(String name) {
        cdyhaExample e1 = new cdyhaExample();
        Criteria c = e1.createCriteria();
        c.andYha002EqualTo(name);
        List<cdyha> list = yhaMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(int id) {
        yhaMapper.deleteByPrimaryKey(id);
    }


    public PageBean queryByPage(PageBean pageBean, cdyhaExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yhaMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyha> list = yhaMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdyha> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyha> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyha> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyha entity) {
        return false;
    }

    @Override
    public cdyha getOne(Wrapper<cdyha> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyha> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyha> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyha> getBaseMapper() {
        return null;
    }
}
