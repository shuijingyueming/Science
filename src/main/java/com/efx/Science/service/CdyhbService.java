package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhb;
import org.apache.poi.ss.formula.functions.Index;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyhbService extends IService<cdyhb> {
    cdyhb getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdyhb yhb);

    cdyhb insert(cdyhb yhb);

    cdyhb selectByName(String name, Integer id);

    void delete(int id);

    List<cdyhb> getAll(String cjid);

    Integer countByExample();

    int countBycjid(Integer fid);
}
