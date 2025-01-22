
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyhfMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhf;
import com.efx.Science.model.cdyhfExample;
import com.efx.Science.model.cdyhfExample.Criteria;
import com.efx.Science.service.CdyhfService;
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
public class CdyhfServiceImpl implements CdyhfService {

    @Autowired
    private cdyhfMapper yhfMapper;


    @Override
    public cdyhf getByid(String id) {
        return yhfMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyhfExample e1 = new cdyhfExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andYhf004Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql2()!=null)c.andYhf002EqualTo(Integer.valueOf(pb.getOthersql2()));
        if(pb.getOthersql3()!=null)c.andYhf007EqualTo(Integer.valueOf(pb.getOthersql3()));
        e1.setOrderByClause("yhf001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdyhf yhf) {
        return yhfMapper.updateByPrimaryKeySelective(yhf)>0?true:false;
    }

    @Override
    public cdyhf insert(cdyhf yhf) {
        yhfMapper.insertSelective(yhf);
        return yhf;
    }

    @Override
    public cdyhf selectByName(String name) {
        cdyhfExample e1 = new cdyhfExample();
        Criteria c = e1.createCriteria();
        c.andYhf004EqualTo(name);
        List<cdyhf> list = yhfMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(String id) {
        yhfMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<cdyhf> getAll(String fid, String type) {
        cdyhfExample e1 = new cdyhfExample();
        Criteria c = e1.createCriteria();
        if(fid!=null&&!fid.isEmpty())c.andYhf002EqualTo(Integer.valueOf(fid));
        if(type!=null&&!type.isEmpty())c.andYhf003EqualTo(type);
        return yhfMapper.selectByExample(e1);
    }


    public PageBean queryByPage(PageBean pageBean, cdyhfExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yhfMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhf> list = yhfMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdyhf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyhf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyhf> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyhf entity) {
        return false;
    }

    @Override
    public cdyhf getOne(Wrapper<cdyhf> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyhf> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyhf> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyhf> getBaseMapper() {
        return null;
    }
}
