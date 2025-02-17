
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyhgMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhg;
import com.efx.Science.model.cdyhgExample;
import com.efx.Science.model.cdyhgExample.Criteria;
import com.efx.Science.service.CdyhgService;
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
public class CdyhgServiceImpl implements CdyhgService {

    @Autowired
    private cdyhgMapper yhgMapper;


    @Override
    public cdyhg getByid(String id) {
        return yhgMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyhgExample e1 = new cdyhgExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andYhg010Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql3()!=null)c.andYhg004EqualTo(pb.getOthersql3());
        if(pb.getOthersql1()!=null)c.andYhg009EqualTo(pb.getOthersql1());
        if(pb.getOthersql2()!=null)c.andYhg003IsNotNull();
        e1.setOrderByClause("yhg003 desc,yhg001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdyhg yhg) {
        return yhgMapper.updateByPrimaryKeySelective(yhg)>0?true:false;
    }

    @Override
    public cdyhg insert(cdyhg yhg) {
        yhgMapper.insertSelective(yhg);
        return yhg;
    }

    @Override
    public cdyhg selectByName(String name) {
        cdyhgExample e1 = new cdyhgExample();
        Criteria c = e1.createCriteria();
        c.andYhg010EqualTo(name);
        List<cdyhg> list = yhgMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(String id) {
        yhgMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<cdyhg> getAll() {
        return yhgMapper.selectByExample(null);
    }

    @Override
    public cdyhg getBylx(String type, String lx) {
        cdyhgExample e1 = new cdyhgExample();
        Criteria c = e1.createCriteria();
        if(type!=null)c.andYhg009EqualTo(type);
        if(lx!=null)c.andYhg003IsNotNull();
        List<cdyhg> list = yhgMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }


    public PageBean queryByPage(PageBean pageBean, cdyhgExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yhgMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhg> list = yhgMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }



    @Override
    public boolean saveBatch(Collection<cdyhg> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdyhg> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdyhg> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdyhg entity) {
        return false;
    }

    @Override
    public cdyhg getOne(Wrapper<cdyhg> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdyhg> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdyhg> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdyhg> getBaseMapper() {
        return null;
    }
}
