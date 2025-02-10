package com.efx.Science.controller;


import com.alibaba.fastjson.JSON;
import com.efx.Science.model.cdyhd;
import com.efx.Science.model.cdyhg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WXSCintroller extends BaseController{


    /**
     * 获取当月课程排课记录
     * 孙伟丰
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxkcformouth", method = RequestMethod.POST)
    public String wxkcformouth(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        String year = request.getParameter("year");
        String mouth = (Integer.parseInt(request.getParameter("mouth"))>9?request.getParameter("mouth"):"0"+request.getParameter("mouth"));
        int kcid = Integer.parseInt(request.getParameter("kcid"));
        List<cdyhd> list = yhdService.getrllist(year+"-"+mouth,kcid);
        result.put("list",list);
        return JSON.toJSONString(result);
    }



}
