package com.efx.Science.controller;


import com.alibaba.fastjson.JSON;
import com.efx.Science.model.*;
import com.efx.Science.pub.PubMessage;
import com.efx.Science.until.ExcelExport;
import com.efx.Science.wx.WeiCatJK;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;


@Controller
public class WXController extends BaseController {

    /**
     * 获取用户openid
     * 王新苗
     * @param code
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/MingPianfirstIN", method = RequestMethod.POST)
    public String MingPianfirstIN(String code,String type,String zt) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        //System.out.println(code);
        JSONObject json = WeiCatJK.queryOpenid(code, PubMessage.appid,PubMessage.secret);
        // 查找原客户
        if (json != null && !json.get("openid").equals("")) {
            System.out.println(TIMEMIAO.format(new Date())+"-----"+json.getString("openid"));
            cduse item=useService.selectByOpenid((String) json.get("openid"));
            result.put("item", item);
            result.put("openid", json.get("openid"));
            result.put("pk", json.get("session_key"));
        }
        return JSON.toJSONString(result);
    }

    /**
     * 用户手机号授权并保存用户信息
     * 王新苗
     * @param
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/deciphering")
    public String deciphering(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        String openid = request.getParameter("openid");
        String avatarUrl = request.getParameter("avatarUrl");
        String nickName = request.getParameter("nickName");
        String code = request.getParameter("pk");
        String iv = request.getParameter("ivdata");
        String encryptedData =  request.getParameter("encrypdata");
        String phone=null;
        if(encryptedData!=null&&code!=null&&phone==null) phone =  WeiCatJK.decrypt_new(encryptedData,code,iv);
        System.out.println(TIMEMIAO.format(new Date())+"phone----"+phone);
        if(phone!=null){
            cduse item=useService.selectByphone(phone);
            if(item!=null){
                item.setUse006(openid);
                if(nickName!="")item.setUse007(nickName);
                item.setUse008(avatarUrl);
                useService.update(item);
                result.put("item", item);
                result.put("type", "Y");
            }else{
                result.put("type", "P");
            }
        }else{
            result.put("type", "M");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 类型
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxlx", method = RequestMethod.POST)
    public String wxlx(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        List<cdhbb> list=hbbService.getAll();
        result.put("list", list);
        return JSON.toJSONString(result);
    }

    /**
     * 查询更多菜品
     */
    @ResponseBody
    @RequestMapping(value = "wxkc")
    public String wxfl(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        PageBean pagebean = new PageBean();
        if(request.getParameter("pages")!=null&&!request.getParameter("pages").isEmpty()) pagebean.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else pagebean.setCurrentPage(1);
        if(request.getParameter("size")!=null&&!request.getParameter("size").isEmpty()) pagebean.setPageSize(Integer.valueOf(request.getParameter("size")));
        if(request.getParameter("name")!=null&&!request.getParameter("name").isEmpty())pagebean.setOthersql(request.getParameter("name"));
        if(request.getParameter("skid")!=null&&!request.getParameter("skid").isEmpty())pagebean.setOthersql1(request.getParameter("skid"));
        if(request.getParameter("flid")!=null&&!request.getParameter("flid").isEmpty())pagebean.setOthersql2(request.getParameter("flid"));
        pagebean.setOthersql3("B");
        PageBean pb=hbaService.selectPageBean1(pagebean);
        result.put("pb", pb);
        return JSON.toJSONString(result);
    }

    /**
     * 详情
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxxq", method = RequestMethod.POST)
    public String wxxq(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        cdhba item=hbaService.getByid(Integer.valueOf(request.getParameter("kcid")));
        List<cdyhc> list=yhcService.getAll(request.getParameter("kcid"),null);
        result.put("item", item);
        result.put("list", list);
        return JSON.toJSONString(result);
    }

    /**
     * 详情
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxsk", method = RequestMethod.POST)
    public String wxsk(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        List<cdsmd> list=smdService.getAll();
        for (cdsmd smd:list) {
            smd.setFwrc(yheService.countByfwrc(smd.getSmd001(), null, null,null));
            smd.setHbaList(hbaService.getAll(null,smd.getSmd001().toString(),"B"));
        }
        result.put("list", list);
        return JSON.toJSONString(result);
    }

    /**
     * 查询更多
     */
    @ResponseBody
    @RequestMapping(value = "wxjl")
    public String wxjl(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        PageBean pagebean = new PageBean();
        if(request.getParameter("pages")!=null&&!request.getParameter("pages").isEmpty()) pagebean.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else pagebean.setCurrentPage(1);
        if(request.getParameter("size")!=null&&!request.getParameter("size").isEmpty()) pagebean.setPageSize(Integer.valueOf(request.getParameter("size")));
        if(request.getParameter("name")!=null&&!request.getParameter("name").isEmpty())pagebean.setOthersql(request.getParameter("name"));
        if(request.getParameter("skid")!=null&&!request.getParameter("skid").isEmpty())pagebean.setOthersql5(request.getParameter("skid"));
        if(request.getParameter("xkid")!=null&&!request.getParameter("xkid").isEmpty())pagebean.setOthersql6(request.getParameter("xkid"));
        if(request.getParameter("type")!=null&&!request.getParameter("type").isEmpty())pagebean.setOthersql1(request.getParameter("type"));
        PageBean pb=yheService.selectPageBean2(pagebean);
        result.put("pb", pb);
        return JSON.toJSONString(result);
    }

    /**
     * 查询更多
     */
    @ResponseBody
    @RequestMapping(value = "wxnew")
    public String wxnew(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        PageBean pagebean = new PageBean();
        if(request.getParameter("pages")!=null&&!request.getParameter("pages").isEmpty()) pagebean.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else pagebean.setCurrentPage(1);
        if(request.getParameter("size")!=null&&!request.getParameter("size").isEmpty()) pagebean.setPageSize(Integer.valueOf(request.getParameter("size")));
        if(request.getParameter("type")!=null&&!request.getParameter("type").isEmpty())pagebean.setOthersql1(request.getParameter("type"));
        pagebean.setOthersql2("A");
        PageBean pb=yhgService.selectPageBean(pagebean);
        result.put("pb", pb);
        return JSON.toJSONString(result);
    }

    /**
     * 详情
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxnewxq", method = RequestMethod.POST)
    public String wxnewxq(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        cdyhg item=yhgService.getByid(request.getParameter("id"));
        result.put("item", item);
        return JSON.toJSONString(result);
    }
}
