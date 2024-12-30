package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cduse;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cduse;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CduseService extends IService<cduse> {

    cduse getLogin(String name, String pwd);

    cduse getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cduse use);

    cduse insert(cduse use);

    cduse selectByName(String name);

}
