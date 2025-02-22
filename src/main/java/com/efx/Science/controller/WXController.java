package com.efx.Science.controller;


import com.alibaba.fastjson.JSON;
import com.efx.Science.model.*;
import com.efx.Science.pub.PubMessage;
import com.efx.Science.wx.WeiCatJK;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
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
                if(item.getUse009().equals("B")){
                    cdsmd smd = smdService.getByid(item.getUse011());
                    if(smd.getSmd014().equals("P")){
                        result.put("type", smd.getSmd014());
                    }else{
                        result.put("type", "Y");
                    }
                }else{
                    result.put("type", "Y");
                }
            }else{
                result.put("type", "O");
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
        cdhba item=hbaService.getByid1(Integer.valueOf(request.getParameter("kcid")));
        List<cdyhc> list=yhcService.getAll(request.getParameter("kcid"),null);
        result.put("item", item);
        result.put("list", list);
        return JSON.toJSONString(result);
    }

    /**
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxxgztyy", method = RequestMethod.POST)
    public String wxxgztyy(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        cdyhe item=yheService.getByid(Integer.valueOf(request.getParameter("id")));
        item.setYhe007(request.getParameter("zt"));
        item.setYhe030(request.getParameter("con"));
        if(yheService.update(item)){
            result.put("item", item);
            result.put("msg", "1");
        }else{
            result.put("msg", "0");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxaddyy", method = RequestMethod.POST)
    public String wxaddyy(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        cdhba hba = hbaService.getByid(Integer.valueOf(request.getParameter("kcid")));
        Integer xkid= Integer.valueOf(request.getParameter("xkid"));
        Integer id= request.getParameter("cjid").isEmpty()?0:Integer.valueOf(request.getParameter("cjid"));
        cdyhe item = new cdyhe();
        item.setYhe040(id);
        item.setYhe002(xkid);
        item.setYhe004(hba.getHba001());
        item.setYhe003(hba.getHba022());
        cdsmd smd = smdService.getByid(item.getYhe003());
        cdyhb yhb = yhbService.getByid(item.getYhe002());
        item.setYhe009(request.getParameter("t2"));
        if(!request.getParameter("t14").isEmpty())item.setYhe010(Integer.valueOf(request.getParameter("t14")));
        yhb.setYhb015(yhb.getYhb015()+1);
        smd.setSmd013(smd.getSmd013()+1);
        item.setYhe042(request.getParameter("t42"));
        item.setYhe043(request.getParameter("t43"));
        item.setYhe044(request.getParameter("t44"));
        item.setYhe045(request.getParameter("t45"));
        if(yhb.getYhb015()<=yhb.getYhb016()&&smd.getSmd013()<=smd.getSmd009()) {
            yhb.setYhb012(yhb.getYhb012() + 1);
            if(item.getYhe010()!=null)item.setYhe011(item.getYhe010() < 10 ? hba.getHba027() :
                    (item.getYhe010() < 20 ? hba.getHba027() + hba.getHba028() * (item.getYhe010() - 10) :
                            (item.getYhe010() < 30 ? hba.getHba027() + hba.getHba028() * 10 + hba.getHba029() * (item.getYhe010() - 20) :
                                    (item.getYhe010() < 45 ? hba.getHba027() + hba.getHba028() * 10 + hba.getHba029() * (item.getYhe010() - 30) :
                                            hba.getHba027() + hba.getHba028() * 10 + hba.getHba029() * 10 + hba.getHba030() * 15))));
            item.setYhe012(yhb.getYhb017()!=null?yhb.getYhb017():(yhb.getYha().getYha005()!=null?yhb.getYha().getYha005():null));
            item.setYhe013(hba.getHba012());
            item.setYhe015(hba.getHba013());
            if (item.getYhe015() != null) item.setYhe014(hba.getHba006() * item.getYhe015());
            item.setYhe008(DATE.parse(request.getParameter("date")));
            item.setYhe041(request.getParameter("time").equals("A")?"上午":(request.getParameter("time").equals("B")?"下午":request.getParameter("time").equals("C")?"晚上":""));
            if (request.getParameter("lx").equals("B")) {
                item.setYhe007("B");
            } else {
                item.setYhe007("A");
            }
            yhb.setYhb015(yhb.getYhb015() + 1);
            cdyhd yhd = yhdService.serachObject(request.getParameter("date"), item.getYhe004());
            if (yhd != null) {
                if (item.getYhe041().equals("上午")) {
                    yhd.setYhd010(yhd.getYhd010() + 1);
                } else if (item.getYhe041().equals("下午")) {
                    yhd.setYhd012(yhd.getYhd012() + 1);
                } else if (item.getYhe041().equals("晚上")) {
                    yhd.setYhd014(yhd.getYhd014() + 1);
                }
                yhdService.update(yhd);
            }
            item = yheService.insert(item);
            yhbService.update(yhb);
            smdService.update(smd);
            result.put("id", item.getYhe001());
            result.put("msg", "1");
        }else{
            result.put("msg", "0");
        }
        return JSON.toJSONString(result);
    }

    /**
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxaddpj", method = RequestMethod.POST)
    public String wxaddpj(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        String[] dzplist=request.getParameter("dzplist").split(",");
        String[] dizplist=request.getParameter("dizplist").split(",");
        String zt=request.getParameter("zt");
        cdyhe item = new cdyhe();
        item.setYhe001(Integer.valueOf(request.getParameter("yyid")));
        System.out.println(dzplist);
        //修改
        if(request.getParameter("lx").equals("C")){
            item.setYhe021(request.getParameter("p1"));
            item.setYhe022(request.getParameter("p2"));
            item.setYhe023(request.getParameter("p3"));
            item.setYhe024(request.getParameter("p4"));
            item.setYhe025(request.getParameter("p5"));
            item.setYhe026(request.getParameter("p6"));
            item.setYhe027(request.getParameter("p7"));
            item.setYhe028(request.getParameter("p8"));
            item.setYhe029(request.getParameter("p9"));
            if(!request.getParameter("p19").isEmpty())item.setYhe020(DATE.parse(request.getParameter("p19")));
            item.setYhe016(Integer.valueOf(request.getParameter("p17")));
            cdyhe item1 =yheService.getByid(Integer.valueOf(request.getParameter("yyid")));
            item.setYhe018(item.getYhe016()<10?item1.getHba().getHba027():
                            (item.getYhe016()<20?item1.getHba().getHba027()+item1.getHba().getHba028()*(item.getYhe016()-10):
                            (item.getYhe016()<30?item1.getHba().getHba027()+item1.getHba().getHba028()*10+item1.getHba().getHba029()*(item.getYhe016()-20):
                            (item.getYhe016()<45?item1.getHba().getHba027()+item1.getHba().getHba028()*10+item1.getHba().getHba029()*10+item1.getHba().getHba030()*(item.getYhe016()-30):
                             item1.getHba().getHba027()+item1.getHba().getHba028()*10+item1.getHba().getHba029()*10+item1.getHba().getHba030()*15))));
            if(zt.equals("R")){
                item.setYhe007("E");
            }else{
                item.setYhe007("Q");
            }
        }else{
            item.setYhe033(request.getParameter("p10"));
            item.setYhe034(request.getParameter("p11"));
            item.setYhe035(request.getParameter("p12"));
            item.setYhe036(request.getParameter("p13"));
            item.setYhe037(request.getParameter("p14"));
            item.setYhe038(request.getParameter("p15"));
            item.setYhe039(request.getParameter("p16"));
            item.setYhe017(Integer.valueOf(request.getParameter("p18")));
            if(zt.equals("Q")){
                item.setYhe007("E");
            }else{
                item.setYhe007("R");
            }
        }
        item.setYhe007("E");
        for(String i:dzplist){
            yhfService.delete(i);
        }
        for(String i:dizplist){
            File oldFile = new File(i);
            oldFile.delete();
        }
        yheService.update(item);
        result.put("msg", "1");
        return JSON.toJSONString(result);
    }

    /**
     * 图片
     * 王新苗
     */
    @ResponseBody
    @RequestMapping(value = "/wx_addpic",headers = "content-type=multipart/form-data")
    public String wx_addpic(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        // 图片
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        Date date = new Date();
        // 获得文件
       MultipartFile t1 = multipartRequest.getFile("imgs");
        System.out.println(request.getParameter("id"));
        if (t1 != null) {
            if (t1.getOriginalFilename() != null && !t1.getOriginalFilename().isEmpty()) {
                cdyhf yhf = new cdyhf();
                yhf.setYhf002(Integer.valueOf(request.getParameter("id")));
                yhf.setYhf003(request.getParameter("type"));
                String filename =yhf.getYhf003()+ sdf1.format(date) + request.getParameter("i") + t1.getOriginalFilename().substring(t1.getOriginalFilename().lastIndexOf("."));
                yhf.setYhf004(filename);
                yhf.setYhf005("x" + request.getParameter("xkid") + "/" + sdf2.format(date));
                yhf.setYhf006(request.getParameter("lx"));
                uploadpic(yhf.getYhf005() + "/" + yhf.getYhf004(), t1, request.getParameter("oname"));
                yhf.setYhf007(Integer.valueOf(request.getParameter("yhid")));
                yhf.setYhf008(new Date());
                if(request.getParameter("oid")!=null&&!request.getParameter("oid").isEmpty()){
                    yhf.setYhf001(request.getParameter("oid"));
                    yhfService.update(yhf);
                }else{
                    yhf.setYhf001(UUID.randomUUID().toString().replaceAll("-", ""));
                    yhfService.insert(yhf);
                }
            }
        }
        result.put("msg", "Y");
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
     * 详情
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxxk", method = RequestMethod.POST)
    public String wxxk(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        List<cdyhb> list=yhbService.getAll(null);
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
     * 详情
     * 王新苗
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping(value = "/wxyyxq", method = RequestMethod.POST)
    public String wxyxq(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        cdyhe item=yheService.getByid(Integer.valueOf(request.getParameter("id")));
        result.put("item", item);
        return JSON.toJSONString(result);
    }

    /**
     * 查询更多
     */
    @ResponseBody
    @RequestMapping(value = "wxnew1")
    public String wxnew1(HttpServletRequest request,HttpServletResponse response) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        cdyhg item=yhgService.getBylx(request.getParameter("type"),"A");
        result.put("item", item);
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
        pagebean.setOthersql2("B");
        pagebean=yhgService.selectPageBean(pagebean);
        result.put("pb", pagebean);
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
        item.setYhg005(item.getYhg005()+1);
        yhgService.update(item);
        result.put("item", item);
        return JSON.toJSONString(result);
    }
}
