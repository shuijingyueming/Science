package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdhba;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdhbaService extends IService<cdhba> {
    cdhba getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdhba hba);

    cdhba insert(cdhba hba);

    cdhba selectByName(String name);

    void delete(int id);

    Integer countByflid(int fid);
}
