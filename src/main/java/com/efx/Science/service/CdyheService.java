package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.PageBean;
import com.efx.Science.model.cdyhe;

import java.text.ParseException;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author dps
 * @since 2023-03-15
 */
public interface CdyheService extends IService<cdyhe> {
    cdyhe getByid(Integer id);

    PageBean selectPageBean(PageBean pb);

    boolean update(cdyhe yhe);

    cdyhe insert(cdyhe yhe);

    cdyhe selectByName(String name);

    void delete(int id);

    Integer countBylsid(int fid);

    void updatebytime();
    void updatebytime1();

    Integer countByfwcc(Integer jgid, Integer xkid, String start, String end) throws ParseException;

    Integer countByfwrc(Integer jgid, Integer xkid, String start, String end) throws ParseException;

    Float countByjtbt(Integer jgid, Integer xkid, String start, String end) throws ParseException;

    Float countBykcje(Integer jgid, String start, String end) throws ParseException;

    PageBean selectPageBean1(PageBean pb) throws ParseException;

    Integer countByfwrwpj(Integer jgid, Integer xkid, String start, String end, String type) throws ParseException;

    Integer countByfwcc1(String start, String end) throws ParseException;

    Integer countByfwrc1(String start, String end) throws ParseException;

    Float countByjtbt1(String start, String end) throws ParseException;

    Float countBykcje1(String start, String end) throws ParseException;

    Integer countByfwcc2(Integer cjid, String othersql5, String othersql6) throws ParseException;

    Integer countByfwrc2(Integer cjid, String othersql5, String othersql6) throws ParseException;

    Integer countByfwrwpj2(Integer cjid, String othersql5, String othersql6, String a) throws ParseException;

    Integer countByfwrcx(Integer xkid, String start, String end) throws ParseException;
    Integer countByfwrcx2(Integer cjid, String othersql5, String othersql6) throws ParseException;

    List<cdyhe> getAll(String type, Integer id);

    PageBean selectPageBean2(PageBean pagebean);
}
