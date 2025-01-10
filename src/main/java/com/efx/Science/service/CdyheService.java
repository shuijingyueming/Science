package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhe;
import com.efx.Science.model.cdyheWithBLOBs;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyheService extends IService<cdyhe> {
    cdyheWithBLOBs getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdyheWithBLOBs yhe);

    cdyheWithBLOBs insert(cdyheWithBLOBs yhe);

    cdyhe selectByName(String name);

    void delete(int id);

    Integer countBylsid(int fid);
}
