package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhe;
import com.efx.Science.model.cdyheWithBLOBs;

import java.text.ParseException;

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

    void updatebytime();

    Integer countByfwcc(Integer jgid, Integer xkid, String start, String end) throws ParseException;

    Integer countByfwrc(Integer jgid, String start, String end) throws ParseException;

    Float countByjtbt(Integer jgid, String start, String end) throws ParseException;

    Float countBykcje(Integer jgid, String start, String end) throws ParseException;

    PageBean selectPageBean1(PageBean pb) throws ParseException;

    Integer countByfwrwpj(Integer jgid, Integer xkid, String start, String end, String type) throws ParseException;
}
