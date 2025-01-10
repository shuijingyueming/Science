package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cduseMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cduse;
import com.efx.Science.model.cduseExample;
import com.efx.Science.model.cduseExample.Criteria;
import com.efx.Science.service.CduseService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
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
public class CduseServiceImpl implements CduseService {

    @Autowired
    private cduseMapper useMapper;

    @Override
    public cduse getLogin(String name, String pwd) {
        cduseExample cx = new cduseExample();
        Criteria c = cx.createCriteria();
        c.andUse002EqualTo(name);
        c.andUse003EqualTo(pwd);
        c.andUse013NotEqualTo("N");
        List<cduse> uselist = useMapper.selectByExample(cx);
        return uselist.size() > 0 ? uselist.get(0) : null;
    }

    @Override
    public cduse getByid(Integer id) {
        return useMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cduseExample e1 = new cduseExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andUse002Like("%"+pb.getOthersql()+"%");
//        if(pb.getOthersql6()!=null) c.andUse007Like("%"+pb.getOthersql6()+"%");
        if (pb.getOthersql1() != null) c.andUse009EqualTo(pb.getOthersql1());
        return queryByPage(pb, e1);
    }

    @Override
    public boolean update(cduse use) {
        return useMapper.updateByPrimaryKeySelective(use) > 0 ? true : false;
    }

    @Override
    public cduse insert(cduse use) {
        useMapper.insertSelective(use);
        return use;
    }



    @Override
    public cduse selectByName(String name, Integer id) {
        cduseExample e1 = new cduseExample();
        Criteria c = e1.createCriteria();
        c.andUse002EqualTo(name);
        if (id != null) c.andUse011EqualTo(id);
        List<cduse> list = useMapper.selectByExample(e1);
        return list.size() > 0 ? list.get(0) : null;
    }

    public PageBean queryByPage(PageBean pageBean, cduseExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) useMapper.countByExample(example);
        //page count
        int count = sum % size == 0 ? sum / size : sum / size + 1;
        //check page
        page = page < 1 ? 1 : ((page > count) ? count : page);
        //query
        List<cduse> list = pageBean.getOthersql1().equals("A")?useMapper.selectByExampleAndPage(example, new RowBounds((page - 1) * size, size)):
                (pageBean.getOthersql1().equals("B")?useMapper.selectByExampleAndPage1(example, new RowBounds((page - 1) * size, size)):useMapper.selectByExampleAndPage2(example, new RowBounds((page - 1) * size, size)));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }


    @Override
    public boolean saveBatch(Collection<cduse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cduse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cduse> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cduse entity) {
        return false;
    }

    @Override
    public cduse getOne(Wrapper<cduse> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cduse> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cduse> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cduse> getBaseMapper() {
        return null;
    }
}
