
package com.efx.Science.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.efx.Science.dao.cdyheMapper;
import com.efx.Science.model.*;
import com.efx.Science.model.cdyheExample.Criteria;
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
    public cdyhe getByid(Integer id) {
        return yheMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageBean selectPageBean(PageBean pb) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
//        if(pb.getOthersql()!=null) c.andYhe003Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql5()!=null) c.andYhe003EqualTo(Integer.valueOf(pb.getOthersql5()));
        if(pb.getOthersql6()!=null)  c.andYhe002EqualTo(Integer.valueOf(pb.getOthersql6()));
        if(pb.getOthersql2()!=null){
            if(pb.getOthersql2().equals("A")){
                c.andSql("(yhe007='A' or yhe007='B')");
            }else if(pb.getOthersql2().equals("B")){
                c.andSql("(yhe007='C' or yhe007='D')");
            }else if(pb.getOthersql2().equals("J")){
                c.andSql("(yhe007='S' or yhe007='T')");
            }else if(pb.getOthersql2().equals("C")){
                c.andSql("(yhe007='G' or yhe007='H')");
            }else if(pb.getOthersql2().equals("D")){
                c.andSql("(yhe007='J' or yhe007='K')");
            }else if(pb.getOthersql2().equals("E")){
                c.andSql("(yhe007='M' or yhe007='N')");
            }else if(pb.getOthersql2().equals("F")){
                if(pb.getOthersql3().equals("A")){
                    c.andSql("(yhe007='F' or yhe007='R' or yhe007='Q')");
                }else  if(pb.getOthersql3().equals("B")){
                    c.andSql("(yhe007='F' or yhe007='Q')");
                }else if(pb.getOthersql3().equals("C")){
                    c.andSql("(yhe007='F' or yhe007='R')");
                }
            }else if(pb.getOthersql2().equals("G")){
                if(pb.getOthersql3().equals("A")){
                    c.andYhe007EqualTo("E");
                }else if(pb.getOthersql3().equals("B")){
                    c.andSql("(yhe007='E' or yhe007='Q')");
                }else if(pb.getOthersql3().equals("C")){
                    c.andSql("(yhe007='E' or yhe007='R')");
                }
            }else if(pb.getOthersql2().equals("H")){
                c.andSql("(yhe007='O' or yhe007='P')");
            }
        }
        cdyhbExample e2 = new cdyhbExample();
        cdyhbExample.Criteria c1 = e2.createCriteria();
        if(pb.getOthersql1()!=null)  c1.andYhb002EqualTo(Integer.valueOf(pb.getOthersql1()));
        e1.setOrderByClause("yhe008 desc");
        if(pb.getOthersql4()==null) {
            return queryByPage(pb,e1,e2);
        }else{
            pb.setResultList(yheMapper.selectByExample2(e1,e2));
            return pb;
        }

    }

    @Override
    public boolean update(cdyhe yhe) {
        return yheMapper.updateByPrimaryKeySelective(yhe)>0?true:false;
    }

    @Override
    public cdyhe insert(cdyhe yhe) {
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
        cdyhe yhe = new cdyhe();
        yhe.setYhe007("F");
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andSql("(Yhe007='G' or Yhe007='H')");
        c.andSql("(DATEDIFF(CURDATE(),yhe008)>=0)");
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
    public Integer countByfwrc(Integer jgid, Integer xkid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(xkid!=null)c.andYhe002EqualTo(xkid);
        if(jgid!=null)c.andYhe003EqualTo(jgid);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        return yheMapper.countByExamplefwrc(e1);
    }

    @Override
    public Float countByjtbt(Integer jgid, Integer xkid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(xkid!=null)c.andYhe002EqualTo(xkid);
        if(jgid!=null)c.andYhe003EqualTo(jgid);
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
    public Integer countByfwcc1(String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdsmdExample e2 = new cdsmdExample();
        cdsmdExample.Criteria c2 = e2.createCriteria();
        c2.andSmd002NotEqualTo("A");
        return yheMapper.countByExample1(e1,e2);
    }

    @Override
    public Integer countByfwrc1(String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdsmdExample e2 = new cdsmdExample();
        cdsmdExample.Criteria c2 = e2.createCriteria();
        c2.andSmd002NotEqualTo("A");
        return yheMapper.countByExamplefwrc1(e1,e2);
    }

    @Override
    public Float countByjtbt1(String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdsmdExample e2 = new cdsmdExample();
        cdsmdExample.Criteria c2 = e2.createCriteria();
        c2.andSmd002NotEqualTo("A");
        return yheMapper.countByExamplejtbt1(e1,e2);
    }

    @Override
    public Float countBykcje1( String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdsmdExample e2 = new cdsmdExample();
        cdsmdExample.Criteria c2 = e2.createCriteria();
        c2.andSmd002NotEqualTo("A");
        return yheMapper.countByExamplekcje1(e1,e2);
    }

    @Override
    public PageBean selectPageBean2(PageBean pb) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
//        if(pb.getOthersql()!=null) c.andYhe003Like("%"+pb.getOthersql()+"%");
        if(pb.getOthersql5()!=null) c.andYhe003EqualTo(Integer.valueOf(pb.getOthersql5()));
        if(pb.getOthersql6()!=null)  c.andYhe002EqualTo(Integer.valueOf(pb.getOthersql6()));
        if(pb.getOthersql1()!=null)  {
            if(pb.getOthersql1().equals("A")){
                c.andSql("(yhe007='A' or yhe007='B' or yhe007='G' or yhe007='K' or yhe007='M' or yhe007='N')");
            }else if(pb.getOthersql1().equals("E")){
                if(pb.getOthersql5()!=null) c.andSql("(yhe007='E' or yhe007='Q')");
                if(pb.getOthersql6()!=null) c.andSql("(yhe007='E' or yhe007='R')");
            }else{
                if(pb.getOthersql5()!=null) c.andSql("(yhe007='F' or yhe007='R' or yhe007='G' or yhe007='H')");
                if(pb.getOthersql6()!=null) c.andSql("(yhe007='F' or yhe007='Q' or yhe007='G' or yhe007='H')");
            }
        }
        e1.setOrderByClause("yhe008 desc,yhe001 desc");
        return queryByPage(pb,e1,null);
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
        e1.setOrderByClause("yhe008 desc");
        if(pb.getOthersql4()==null) {
            if(pb.getOthersql3()==null) {
                return queryByPage(pb,e1,null);
            }else{
                cdsmdExample e2 = new cdsmdExample();
                cdsmdExample.Criteria c2 = e2.createCriteria();
                c2.andSmd002NotEqualTo("A");
                return queryByPage1(pb,e1,e2);
            }
        }else{
            if(pb.getOthersql3()==null) {
                pb.setResultList(yheMapper.selectByExample(e1));
            }else{
                cdsmdExample e2 = new cdsmdExample();
                cdsmdExample.Criteria c2 = e2.createCriteria();
                c2.andSmd002NotEqualTo("A");
                pb.setResultList(yheMapper.selectByExample1(e1,e2));
            }
            return pb;
        }

    }

    private PageBean queryByPage1(PageBean pageBean, cdyheExample e1, cdsmdExample e2) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yheMapper.countByExample1(e1,e2);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhe> list = yheMapper.selectByExampleAndPage1(e1,e2, new RowBounds((page-1)*size, size));
        //save to PageBean
        pageBean.setCurrentPage(page);
        pageBean.setPageCount(count);
        pageBean.setRecordCount(sum);
        pageBean.setResultList(list);
        pageBean.setPageSize(size);
        return pageBean;
    }

    @Override
    public Integer countByfwcc2(Integer cjid,String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdyhbExample e2 = new cdyhbExample();
        cdyhbExample.Criteria c2 = e2.createCriteria();
        c2.andYhb002EqualTo(cjid);
        return yheMapper.countByExample2(e1,e2);
    }

    @Override
    public Integer countByfwrc2(Integer cjid,String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdyhbExample e2 = new cdyhbExample();
        cdyhbExample.Criteria c2 = e2.createCriteria();
        c2.andYhb002EqualTo(cjid);
        return yheMapper.countByExamplefwrc2(e1,e2);
    }

    @Override
    public Integer countByfwrcx2(Integer cjid,String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdyhbExample e2 = new cdyhbExample();
        cdyhbExample.Criteria c2 = e2.createCriteria();
        c2.andYhb002EqualTo(cjid);
        return yheMapper.countByExamplefwrcX1(e1,e2);
    }

    @Override
    public List<cdyhe> getAll(String type, Integer id) {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        if(type.equals("B")){
            c.andYhe003EqualTo(id);
            c.andYhe007EqualTo("A");
        }else if(type.equals("C")){
            c.andYhe002EqualTo(id);
            c.andYhe007EqualTo("B");
        }else{
            c.andSql("(yhe007='A' or yhe007='B')");
        }
        return yheMapper.selectByExample(e1);
    }

    @Override
    public Integer countByfwrwpj2(Integer cjid, String start, String end, String type) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe038EqualTo(type);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        cdyhbExample e2 = new cdyhbExample();
        cdyhbExample.Criteria c2 = e2.createCriteria();
        c2.andYhb002EqualTo(cjid);
        return yheMapper.countByExample2(e1,e2);
    }

    @Override
    public Integer countByfwrcx(Integer jgid, String start, String end) throws ParseException {
        cdyheExample e1 = new cdyheExample();
        Criteria c = e1.createCriteria();
        c.andYhe003EqualTo(jgid);
        if(start!=null)c.andYhe008GreaterThanOrEqualTo(sdf.parse(start+" 00:00:00"));
        if(end!=null)c.andYhe008LessThanOrEqualTo(sdf.parse(end+" 23:59:59"));
        c.andSql("(yhe007='E' or yhe007='F')");
        return yheMapper.countByExamplefwrcX(e1);
    }

    public PageBean queryByPage(PageBean pageBean, cdyheExample e1, cdyhbExample e2) {
        int page = (int) pageBean.getCurrentPage();
        int size = pageBean.getPageSize();
        //record sum
        int sum = (int) yheMapper.countByExample2(e1,e2);
        //page count
        int count = sum%size==0 ? sum/size : sum/size+1;
        //check page
        page = page<1 ? 1 : ((page>count)? count : page);
        //query
        List<cdyhe> list = yheMapper.selectByExampleAndPage2(e1,e2, new RowBounds((page-1)*size, size));
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
