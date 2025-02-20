
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdhbaMapper;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdhba;
import com.efx.Science.model.cdhbaExample;
import com.efx.Science.model.cdhbaExample.Criteria;
import com.efx.Science.model.cdsmdExample;
import com.efx.Science.service.CdhbaService;
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
public class CdhbaServiceImpl implements CdhbaService {

    @Autowired
    private cdhbaMapper hbaMapper;


    @Override
    public cdhba getByid(Integer id) {
        return hbaMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdhbaExample e1 = new cdhbaExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andHba002Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql1()!=null) c.andHba022EqualTo(Integer.valueOf(pb.getOthersql1()));
        if(pb.getOthersql2()!=null) c.andHba021EqualTo(Integer.valueOf(pb.getOthersql2()));
        if(pb.getOthersql3()!=null) c.andHba026EqualTo(pb.getOthersql3());
        e1.setOrderByClause("hba001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdhba hba) {
        return hbaMapper.updateByPrimaryKeySelective(hba)>0?true:false;
    }

    @Override
    public cdhba insert(cdhba hba) {
        hbaMapper.insertSelective(hba);
        return hba;
    }

    @Override
    public cdhba selectByName(String name, String code) {
        cdhbaExample e1 = new cdhbaExample();
        Criteria c = e1.createCriteria();
        if(name!=null)c.andHba002EqualTo(name);
        if(code!=null)c.andHba035EqualTo(code);
        List<cdhba> list = hbaMapper.selectByExample(e1);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public void delete(int id) {
        hbaMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer countByflid(int id) {
        cdhbaExample e1 = new cdhbaExample();
        Criteria c = e1.createCriteria();
        c.andHba021EqualTo(id);
        return Math.toIntExact(hbaMapper.countByExample(e1));
    }

    @Override
    public List<cdhba> getAll(String flid, String jgid, String type) {
        cdhbaExample e1 = new cdhbaExample();
        Criteria c = e1.createCriteria();
        if(flid!=null&&!flid.isEmpty())c.andHba021EqualTo(Integer.valueOf(flid));
        if(jgid!=null&&!jgid.isEmpty())c.andHba022EqualTo(Integer.valueOf(jgid));
        if(type!=null&&!type.isEmpty())c.andHba026EqualTo(type);
        return hbaMapper.selectByExample(e1);
    }


    public PageBean queryByPage(PageBean pageBean, cdhbaExample example) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) hbaMapper.countByExample(example);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdhba> list = hbaMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }

    @Override
    public PageBean selectPageBean1(PageBean pb) {
        cdhbaExample e1 = new cdhbaExample();
        Criteria c = e1.createCriteria();
        if(pb.getOthersql()!=null) c.andHba002Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql1()!=null) c.andHba022EqualTo(Integer.valueOf(pb.getOthersql1()));
        if(pb.getOthersql2()!=null) c.andHba021EqualTo(Integer.valueOf(pb.getOthersql2()));
        if(pb.getOthersql3()!=null) c.andHba026EqualTo(pb.getOthersql3());
        cdsmdExample e2 = new cdsmdExample();
        cdsmdExample.Criteria c1 = e2.createCriteria();
        c1.andSmd014EqualTo("M");
        e1.setOrderByClause("hba001 desc");
        return queryByPage1(pb,e1,e2);
    }

    @Override
    public cdhba getByid1(Integer kcid) {
        return hbaMapper.selectByPrimaryKey1(kcid);
    }

    @Override
    public void updateByid(Integer skid) {
        cdhba hba=new cdhba();
        hba.setHba026("C");
        cdhbaExample e1 = new cdhbaExample();
        Criteria c = e1.createCriteria();
        c.andHba026EqualTo("cdhba");
        c.andHba022EqualTo(skid);
        hbaMapper.updateByExampleSelective(hba,e1);

    }

    public PageBean queryByPage1(PageBean pageBean, cdhbaExample e1, cdsmdExample e2) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) hbaMapper.countByExample1(e1,e2);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdhba> list = hbaMapper.selectByExampleAndPage1(e1,e2, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }

    @Override
    public boolean saveBatch(Collection<cdhba> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<cdhba> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<cdhba> entityList, int batchSize) {
        return false;
    }

    @Override
    public boolean saveOrUpdate(cdhba entity) {
        return false;
    }

    @Override
    public cdhba getOne(Wrapper<cdhba> queryWrapper, boolean throwEx) {
        return null;
    }

    @Override
    public Map<String, Object> getMap(Wrapper<cdhba> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<cdhba> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public BaseMapper<cdhba> getBaseMapper() {
        return null;
    }
}
