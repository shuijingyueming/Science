package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhf;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyhfService extends IService<cdyhf> {
    cdyhf getByid(String id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdyhf yhf);

    cdyhf insert(cdyhf yhf);

    cdyhf selectByName(String name);

    void delete(String id);

    List<cdyhf> getAll(String fid, String type);
}
