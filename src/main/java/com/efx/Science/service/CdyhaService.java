package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyha;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyhaService extends IService<cdyha> {
    cdyha getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdyha yha);

    cdyha insert(cdyha yha);

    cdyha selectByName(String name);

    void delete(int id);
}
