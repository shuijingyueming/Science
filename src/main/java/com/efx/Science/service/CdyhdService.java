package com.efx.Science.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.efx.Science.model.cdyhd;
import java.util.List;

public interface CdyhdService extends IService<cdyhd> {

    cdyhd getByid(String id);

    void update(cdyhd yhd);

    cdyhd insert(cdyhd yhd);

    cdyhd serachObject(String date,int kcid);

    void delete(String id);

    List<cdyhd> getrllist(String date,int kcid);

    void deletebykcid(int kcid,int year);
}
