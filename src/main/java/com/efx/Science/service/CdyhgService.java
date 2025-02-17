package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhg;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyhgService extends IService<cdyhg> {
    cdyhg getByid(String id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdyhg yhg);

    cdyhg insert(cdyhg yhg);

    cdyhg selectByName(String name);

    void delete(String id);

    List<cdyhg> getAll();

    cdyhg getBylx(String type, String lx);
}
