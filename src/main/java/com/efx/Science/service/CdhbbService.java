package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdhbb;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdhbbService extends IService<cdhbb> {
    cdhbb getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdhbb hbb);

    cdhbb insert(cdhbb hbb);

    cdhbb selectByName(String name);

    void delete(int id);

    List<cdhbb> getAll();
}
