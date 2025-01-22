
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

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    private SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Override
    public cdyheWithBLOBs getByid(Integer id) {
        return yheMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
//        if(pb.getOthersql()!=null) c.andYhe003Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql5()!=null) c.andYhe003EqualTo(Integer.valueOf(pb.getOthersql5()));
        if(pb.getOthersql6()!=null)  c.andYhe002EqualTo(Integer.valueOf(pb.getOthersql6()));
        e1.setOrderByClause("yhe001 desc");
        return queryByPage(pb,e1);
    }

    @Override
    public boolean update(cdyheWithBLOBs yhe) {
        return yheMapper.updateByPrimaryKeySelective(yhe)>0?true:false;
    }

    @Override
    public cdyheWithBLOBs insert(cdyheWithBLOBs yhe) {
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

    @Override
    public void updatebytime() {
        cdyheWithBLOBs yhe = new cdyheWithBLOBs();
        yhe.setYhe007("F");
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe007EqualTo("C");
        c.andSql("(DATE_FORMAT(yhe020,'%Y-%m-%d')=DATE_FORMAT(CURDATE(),'%Y-%m-%d'))");
        yheMapper.updateByExampleSelective(yhe,e1);
    }

    @Override
    public Integer countByfwcc(Integer jgid, Integer xkid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(xkid!=null)c.andYhe002EqualTo(xkid);
        if(jgid!=null)c.andYhe003EqualTo(jgid);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        return Math.toIntExact(yheMapper.countByExample(e1));
    }

    @Override
    public Integer countByfwrc(Integer jgid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe003EqualTo(jgid);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        return yheMapper.countByExamplefwrc(e1);
    }

    @Override
    public Float countByjtbt(Integer jgid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe003EqualTo(jgid);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        return yheMapper.countByExamplejtbt(e1);
    }

    @Override
    public Float countBykcje(Integer jgid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe003EqualTo(jgid);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        return yheMapper.countByExamplekcje(e1);
    }

    @Override
    public Integer countByfwrwpj(Integer jgid, Integer xkid, String start, String end, String type) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(xkid!=null){
            c.andYhe002EqualTo(xkid);
            c.andYhe038EqualTo(type);
        }
        if(jgid!=null){
            c.andYhe003EqualTo(jgid);
            c.andYhe028EqualTo(type);
        }
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));

        c.andSql("(yhe007='E' or yhe007='F')");
        return Math.toIntExact(yheMapper.countByExample(e1));
    }

    @Override
    public PageBean selectPageBean1(PageBean pb) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
//        if(pb.getOthersql()!=null) c.andYhe003Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql1()!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(pb.getOthersql1()+" 00:00:00"));
        if(pb.getOthersql2()!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(pb.getOthersql2()+" 23:59:59"));
        if(pb.getOthersql5()!=null) c.andYhe003EqualTo(Integer.valueOf(pb.getOthersql5()));
        if(pb.getOthersql6()!=null)  c.andYhe002EqualTo(Integer.valueOf(pb.getOthersql6()));
        if(pb.getOthersql()!=null)c.andSql("(yhe007='E' or yhe007='F')");
        e1.setOrderByClause("yhe001 desc");
        return queryByPage(pb,e1);
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
        List<cdyheWithBLOBs> list = yheMapper.selectByExampleAndPage(example, new RowBounds((page-1)*size, size));
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
