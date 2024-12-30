package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhc;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyhcService extends IService<cdyhc> {
    cdyhc getByid(Integer id);

    List<cdyhc> getAll(String id,String name);

    boolean update(cdyhc yhc);

    cdyhc insert(cdyhc yhc);

    cdyhc selectByName(String name);

    void delete(int id);
}
