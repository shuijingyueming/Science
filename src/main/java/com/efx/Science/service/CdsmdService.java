package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdsmd;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdsmdService extends IService<cdsmd> {
    cdsmd getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdsmd smd);

    cdsmd insert(cdsmd smd);

    cdsmd selectByName(String name);

    void delete(int id);

    List<cdsmd> getAll();

    Integer countByExample();
}
