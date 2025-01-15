package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.cdxxz;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdxxzService extends IService<cdxxz> {
    cdxxz selGetAll();

    cdxxz insert();

    void update(cdxxz xxz);

    cdxxz selectByid(Integer id);

    cdxxz insert1();
}
