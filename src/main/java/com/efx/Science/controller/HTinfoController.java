package com.efx.Science.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.efx.Science.model.*;
import com.efx.Science.until.EncrpytUtil;
import com.efx.Science.until.ExcelExport;
import com.efx.Science.until.RSACoder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.InputStream;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;


@Controller
@RequestMapping("/toHt")
public class HTinfoController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;

    private DateFormat df = DateFormat.getDateInstance();

    //框架页面加载
    @RequestMapping("/toHTindex")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("HTindex");
        return mav;
    }

    //框架页面加载
    @RequestMapping("/toHThome")
    public ModelAndView toHTmain(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("HTmain");
        return mav;
    }

    /**
     * 进入管理员管理页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping("/staff")
    public ModelAndView staff(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        mav.addObject("msg", request.getParameter("msg"));
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && !request.getParameter("pages").isEmpty())
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && !request.getParameter("name").isEmpty()) {
            pb.setOthersql(request.getParameter("name"));
        }
        if (request.getParameter("phone") != null && !request.getParameter("phone").isEmpty()) {
            pb.setOthersql6(request.getParameter("phone"));
        }
        if (request.getParameter("lx") != null && !request.getParameter("lx").isEmpty()) {
            pb.setOthersql1(request.getParameter("lx"));
        }
        if(user.getUse009().equals("B")||user.getUse009().equals("C")){
            pb.setOthersql5(String.valueOf(user.getUse011()));
        }else if(request.getParameter("skid") != null && !request.getParameter("skid").toString().isEmpty()){
            pb.setOthersql5(request.getParameter("skid"));
        }
        pb.setOthersql3(String.valueOf(user.getUse001()));
        mav.addObject("pageobj", useService.selectPageBean(pb));
        if(pb.getOthersql1().equals("B")){
            mav.addObject("smdlist", smdService.getAll());
        }else if(pb.getOthersql1().equals("C")){
            mav.addObject("yhblist", yhbService.getAll());
        }
        mav.setViewName("staff");
        return mav;
    }

    /**
     * 修改后台用户信息
     * 王新苗
     */
    @ResponseBody
    @RequestMapping("/updateUseXx")
    public ModelAndView updateUseXx(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        String log = "修改管理员信息:";
        if (user == null) {
            mav.addObject("msg", "登录失效");
        }
        if (request.getParameter("truename") != null && StringUtils.isNotEmpty(request.getParameter("truename"))) {
            log += "真实姓名：【" + user.getUse005() + "】修改为【" + request.getParameter("truename") + "】";
            user.setUse005(request.getParameter("truename"));
        }
        if (request.getParameter("phone") != null && StringUtils.isNotEmpty(request.getParameter("phone"))) {
            log += "电话：【" + user.getUse007() + "】修改为【" + request.getParameter("phone") + "】";
            user.setUse007(request.getParameter("phone"));
        }
        boolean rows = useService.update(user);
        if (rows) {
            addLog(user.getUse002(), log);
            mav.addObject("msg", "0");
        } else{
            mav.addObject("msg", "1");
        }
        mav.setViewName("redirect:/HTprofile");
        return mav;
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/resstaff",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String resyh(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        cduse use = useService.getByid(Integer.valueOf(request.getParameter("fid")));
        use.setUse003(EncrpytUtil.getSHA256("123456"));
        useService.update(use);
        addLog(getUse(request).getUse002(),"重置了名字为：【" + use.getUse002()+ "】的密码");
        result.put("msg","M");
        return JSON.toJSONString(result);
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgztstaff",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String xgztstaff(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"修改了活动名称为：【" + request.getParameter("uname") + "】的状态");
        cduse use = useService.getByid(Integer.valueOf(request.getParameter("fid")));
        if(use.getUse013().equals("P")&&request.getParameter("type").equals("M")){
            if(use.getUse009().equals("B")){
                cdsmd smd=new cdsmd();
                smd.setSmd001(use.getUse011());
                smd.setSmd008(new Date());
                smdService.update(smd);
            }else  if(use.getUse009().equals("C")){
                    cdyhb yhb=new cdyhb();
                    yhb.setYhb001(use.getUse011());
                    yhb.setYhb011(new Date());
                    yhbService.update(yhb);
            }
        }
        use.setUse013(request.getParameter("type"));
        if(request.getParameter("t1")!=null){
            use.setUse014(request.getParameter("t1"));
        }else{
            use.setUse014("");
        }

        useService.update(use);
        result.put("msg","0");
        return JSON.toJSONString(result);
    }
    /**
     * 修改账户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgstaff")
    public String xgstaff(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        cduse item = new cduse();
        //修改
        item.setUse002(request.getParameter("t2"));
        item.setUse004(request.getParameter("t4"));
        item.setUse005(request.getParameter("t5"));
        if(request.getParameter("t11")!=null&&!request.getParameter("t11").isEmpty())item.setUse011(Integer.valueOf(request.getParameter("t11")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t2") + "】的用户信息";
            item.setUse001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            useService.update(item);
            if(Decrypt(session.getAttribute("user").toString())==Integer.valueOf((request.getParameter("fid")))){
                //用户信息
                user user = new user();
                user.setUname(item.getUse002());
                user.setJstype(item.getUse006());
                session.setAttribute("umsg", user);
            }
            result.put("msg", "U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t2")+ "】的用户信息";
            item.setUse003(EncrpytUtil.getSHA256("123456"));
            item.setUse009(request.getParameter("t9"));
            item.setUse013("M");
            addLog(getUse(request).getUse002(),log);
            item = useService.insert(item);
            result.put("msg", "I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    /**
     * 修改账户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgselect1")
    public String xgselect1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        cdsmd item = new cdsmd();
        //修改
        item.setSmd002(request.getParameter("t2"));
        item.setSmd003(request.getParameter("t3"));
        item.setSmd004(request.getParameter("t4"));
        item.setSmd005(request.getParameter("t5"));
        item.setSmd006(request.getParameter("t6"));
        item.setSmd007(request.getParameter("t7"));
        item.setSmd009(Integer.valueOf(request.getParameter("t9")));
        item.setSmd010(Integer.valueOf(request.getParameter("t10")));
        item.setSmd011(0);
        item.setSmd012(0);
        item.setSmd013(0);
        item = smdService.insert(item);
        result.put("msg", "I");
        cduse use = new cduse();
        //修改
        use.setUse002(request.getParameter("z2"));
        use.setUse003(EncrpytUtil.getSHA256("123456"));
        use.setUse004(request.getParameter("z4"));
        use.setUse005(request.getParameter("z5"));
        use.setUse013("P");
        use.setUse009("B");
        use.setUse011(item.getSmd001());
        use = useService.insert(use);
        byte[] encodedData = RSACoder.encryptByPublicKey(use.getUse001()+"", EncrpytUtil.publicKey);
        session.setAttribute("user", RSACoder.encryptBASE64(encodedData));
        //用户信息
        user user = new user();
        user.setUname(use.getUse002());
        user.setJstype(use.getUse009());
        if (use.getUse002().equals("A")) user.setJs("平台管理员");
        else if (use.getUse002().equals("B")) user.setJs("授课方管理员");
        else if (use.getUse002().equals("C")) user.setJs("选课方管理员");
        session.setAttribute("umsg", user);
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    /**
     * 修改账户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgchose1")
    public String xgchose1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        cdyhb item = new cdyhb();
        //修改
        item.setYhb002(Integer.valueOf(request.getParameter("t2")));
        item.setYhb004(request.getParameter("t4"));
        item.setYhb005(request.getParameter("t5"));
        item.setYhb006(request.getParameter("t6"));
        item.setYhb007(request.getParameter("t7"));
        item.setYhb016(Integer.valueOf(request.getParameter("t16")));
        item.setYhb017(Float.valueOf(request.getParameter("t16")));
        item.setYhb012(0);
        item.setYhb013(0);
        item.setYhb014(0);
        item.setYhb015(0);
        item = yhbService.insert(item);
        cduse use = new cduse();
        //修改
        use.setUse002(request.getParameter("z2"));
        use.setUse003(EncrpytUtil.getSHA256("123456"));
        use.setUse004(request.getParameter("z4"));
        use.setUse005(request.getParameter("z5"));
        use.setUse013("P");
        use.setUse009("C");
        use.setUse011(item.getYhb001());
        use = useService.insert(use);
        byte[] encodedData = RSACoder.encryptByPublicKey(use.getUse001()+"", EncrpytUtil.publicKey);
        session.setAttribute("user", RSACoder.encryptBASE64(encodedData));
        //用户信息
        user user = new user();
        user.setUname(use.getUse002());
        user.setJstype(use.getUse009());
        if (use.getUse002().equals("A")) user.setJs("平台管理员");
        else if (use.getUse002().equals("B")) user.setJs("授课方管理员");
        else if (use.getUse002().equals("C")) user.setJs("选课方管理员");
        session.setAttribute("umsg", user);
        return JSON.toJSONString(result);
    }

    //后台分类加载
    @RequestMapping("/tolevel")
    public ModelAndView tolevel(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        //导出模板
        if (request.getParameter("type") != null && request.getParameter("type").equals("E")) {
            String fpath = LoginController.class.getClass().getResource("/").getPath();
            downloadLocal(fpath.substring(1,fpath.length())+"static/upload/level.xls", "层级导入模板.xls",response, request);
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        mav.addObject("msg",request.getParameter("msg") );
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && !request.getParameter("pages").toString().isEmpty())
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && !request.getParameter("name").toString().isEmpty()) {
            pb.setOthersql(request.getParameter("name"));
        }
        mav.addObject("pageobj", yhaService.selectPageBean(pb));
        mav.setViewName("HTlevel");
        return mav;
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/dellevel",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String dellevel(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"删除了层级名称为：【" + request.getParameter("uname") + "】的状态");
        yhaService.delete(Integer.parseInt(request.getParameter("fid")));
        result.put("msg","D");
        return JSON.toJSONString(result);
    }

    /**
     * 导入excel
     * 王新苗
     */
    @ResponseBody
    @RequestMapping(value = "/drlevel")
    public String drlevel(HttpServletRequest request, HttpServletResponse response)throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        try {
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            MultipartFile file = multipartRequest.getFile("file");
            InputStream in = file.getInputStream();
            ExcelExport.getByExcellevel(in, file.getOriginalFilename(),yhaService);
            addLog(getUse(request).getUse002(),"导入了层级信息");
        } catch (Exception e) {
            e.printStackTrace();
            return "B";
        }
        return "A";
    }

    /**
     * ajax保存内容
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/xglevel",headers = "content-type=multipart/form-data")
    public String xglevel(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        cdyha item = new cdyha();
        //修改
        item.setYha002(request.getParameter("t2"));
        item.setYha004(Integer.valueOf(request.getParameter("t4")));
        item.setYha005(Float.valueOf(request.getParameter("t5")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t3") + "】的层级信息";
            item.setYha001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            yhaService.update(item);
            result.put("msg","U");
        }else{
            item.setYha006(0);
            String log = "新增了名字为：【" + request.getParameter("t3")+ "】的层级信息";
            addLog(getUse(request).getUse002(),log);
            item = yhaService.insert(item);
            result.put("msg","I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    /**
     * 导入excel
     * 王新苗
     */
    @ResponseBody
    @RequestMapping(value = "/drchose")
    public String drchose(HttpServletRequest request, HttpServletResponse response)throws Exception {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        try {
            Integer id = Integer.valueOf(request.getParameter("cid"));
            MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
            MultipartFile file = multipartRequest.getFile("file");
            InputStream in = file.getInputStream();
            ExcelExport.getByExcelchose(in, file.getOriginalFilename(),useService,yhbService,id);
            addLog(getUse(request).getUse002(),"导入了选课方信息");
        } catch (Exception e) {
            e.printStackTrace();
            return "B";
        }
        return "A";
    }


    /**
     * 进入管理员管理页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping("/tochose")
    public ModelAndView tochose(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        if(user.getUse009().equals("A")){
            //导出模板
            if (request.getParameter("type") != null && request.getParameter("type").equals("E")) {
                String fpath = LoginController.class.getClass().getResource("/").getPath();
                downloadLocal(fpath.substring(1,fpath.length())+"static/upload/chose.xls", "选课方导入模板.xls",response, request);
                return null;
            }
            mav.addObject("msg", request.getParameter("msg"));
            PageBean pb = new PageBean();
            if (request.getParameter("pages") != null && !request.getParameter("pages").isEmpty())
                pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
            else
                pb.setCurrentPage(1);
            if (request.getParameter("name") != null && !request.getParameter("name").isEmpty()) {
                pb.setOthersql(request.getParameter("name"));
            }
            if (request.getParameter("phone") != null && !request.getParameter("phone").isEmpty()) {
                pb.setOthersql6(request.getParameter("phone"));
            }
            if (request.getParameter("lx") != null && !request.getParameter("lx").isEmpty()) {
                pb.setOthersql1(request.getParameter("lx"));
            }
            mav.addObject("pageobj", yhbService.selectPageBean(pb));
            mav.addObject("yhalist", yhaService.getAll());
            mav.setViewName("HTchose");
        }else{
            mav.addObject("item", yhbService.getByid(user.getUse011()));
            mav.addObject("zt", user.getUse013());
            mav.addObject("bz", user.getUse014());
            mav.setViewName("HTchosexq");
        }
        return mav;
    }


    /**
     * 修改账户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgchose")
    public String xgchose(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        cdyhb item = new cdyhb();
        //修改
        item.setYhb002(Integer.valueOf(request.getParameter("t2")));
        item.setYhb004(request.getParameter("t4"));
        item.setYhb005(request.getParameter("t5"));
        item.setYhb006(request.getParameter("t6"));
        item.setYhb007(request.getParameter("t7"));
        item.setYhb016(Integer.valueOf(request.getParameter("t16")));
        item.setYhb017(Float.valueOf(request.getParameter("t16")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t1") + "】的用户信息";
            item.setYhb001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            yhbService.update(item);
            result.put("msg", "U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t1")+ "】的用户信息";
            item.setYhb011(new Date());
            item.setYhb012(0);
            item.setYhb013(0);
            item.setYhb014(0);
            item.setYhb015(0);
            addLog(getUse(request).getUse002(),log);
            item = yhbService.insert(item);
            result.put("msg", "I");
        }
        if(request.getParameter("zt")!=null){
            cduse use=new cduse();
            use.setUse001(Decrypt(session.getAttribute("user").toString()));
            use.setUse013("P");
            use.setUse014("");
            useService.update(use);
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    //后台分类加载
    @RequestMapping("/tocourselx")
    public ModelAndView tocourselx(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        mav.addObject("msg",request.getParameter("msg") );
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && !request.getParameter("pages").toString().isEmpty())
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && !request.getParameter("name").toString().isEmpty()) {
            pb.setOthersql(request.getParameter("name"));
        }
        mav.addObject("pageobj", hbbService.selectPageBean(pb));

        mav.setViewName("HTcourselx");
        return mav;
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/delcourselx",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String delcourselx(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"删除了课程分类名称为：【" + request.getParameter("uname") + "】的状态");
        if(hbaService.countByflid(Integer.parseInt(request.getParameter("fid")))==0){
            hbbService.delete(Integer.parseInt(request.getParameter("fid")));
            result.put("msg","0");
        }else{
            result.put("msg","1");
        }
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存内容
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/xgcourselx",headers = "content-type=multipart/form-data")
    public String xgcourselx(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        cdhbb item = new cdhbb();
        //修改
        item.setHbb002(request.getParameter("t2"));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t3") + "】的课程分类信息";
            item.setHbb001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            hbbService.update(item);
            result.put("msg","U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t3")+ "】的课程分类信息";
            addLog(getUse(request).getUse002(),log);
            item = hbbService.insert(item);
            result.put("msg","I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    //后台分类加载
    @RequestMapping("/tocourse")
    public ModelAndView tocourse(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        mav.addObject("msg",request.getParameter("msg") );
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && !request.getParameter("pages").toString().isEmpty())
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && !request.getParameter("name").toString().isEmpty()) {
            pb.setOthersql(request.getParameter("name"));
        }
        if (request.getParameter("flid") != null && !request.getParameter("flid").toString().isEmpty()) {
            pb.setOthersql2(request.getParameter("flid"));
        }
        if(user.getUse009().equals("B")){
            pb.setOthersql1(String.valueOf(user.getUse011()));
        }else  if (request.getParameter("skid") != null && !request.getParameter("skid").toString().isEmpty()) {
            pb.setOthersql1(request.getParameter("skid"));
        }
        mav.addObject("pageobj", hbaService.selectPageBean(pb));
        mav.addObject("smdlist", smdService.getAll());
        mav.addObject("hbblist", hbbService.getAll());
        mav.setViewName("HTcourse");
        return mav;
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgztcourse",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String xgztcourse(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"修改了活动名称为：【" + request.getParameter("uname") + "】的状态");
        cdhba hba=hbaService.getByid(Integer.valueOf(request.getParameter("fid")));
        hba.setHba026(request.getParameter("type"));
        if(request.getParameter("t1")!=null)hba.setHba025(request.getParameter("t1"));
        hbaService.update(hba);
        result.put("msg","0");
        return JSON.toJSONString(result);
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/delcourse",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String delcourse(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"删除了课程分类名称为：【" + request.getParameter("uname") + "】的状态");
        if(hbaService.countByflid(Integer.parseInt(request.getParameter("fid")))==0){
            hbaService.delete(Integer.parseInt(request.getParameter("fid")));
            result.put("msg","0");
        }else{
            result.put("msg","1");
        }
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存内容
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/xgcourse",headers = "content-type=multipart/form-data")
    public String xgcourse(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        cdhba item = new cdhba();
        //修改
        item.setHba002(request.getParameter("t2"));
        item.setHba003(request.getParameter("t3"));
        item.setHba004(request.getParameter("t4"));
        item.setHba005(request.getParameter("t5"));
        if(!request.getParameter("t6").isEmpty())item.setHba006(Float.valueOf(request.getParameter("t6")));
        item.setHba007(request.getParameter("t7"));
        item.setHba008(request.getParameter("t8"));
        item.setHba009(request.getParameter("t9"));
        item.setHba010(request.getParameter("t10"));
        item.setHba011(request.getParameter("t11"));
        if(!request.getParameter("t12").isEmpty())item.setHba012(Float.valueOf(request.getParameter("t12")));
        if(!request.getParameter("t13").isEmpty())item.setHba013(Integer.valueOf(request.getParameter("t13")));
        item.setHba014(request.getParameter("t14"));
        item.setHba015(request.getParameter("t15"));
        item.setHba016(request.getParameter("t16"));
        item.setHba017(request.getParameter("t17"));
        item.setHba019(request.getParameter("t19"));
        Date date = new Date();
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartHttpServletRequest.getFile("t20");
        if(null!=file&&null!=file.getOriginalFilename()&&!file.getOriginalFilename().toString().isEmpty()){
            String filename = sdf.format(date)+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            item.setHba020(filename);
            uploadpic("kcvideo/"+filename,file,"kcvideo/"+request.getParameter("tt20"));
        }
        if(!request.getParameter("t21").isEmpty())item.setHba021(Integer.valueOf(request.getParameter("t21")));
        if(!request.getParameter("t22").isEmpty())item.setHba022(Integer.valueOf(request.getParameter("t22")));
        MultipartFile file1 = multipartHttpServletRequest.getFile("t24");
        if(null!=file1&&null!=file1.getOriginalFilename()&&!file1.getOriginalFilename().toString().isEmpty()){
            String filename = sdf.format(date)+file1.getOriginalFilename().substring(file1.getOriginalFilename().lastIndexOf("."));
            item.setHba024(filename);
            uploadpic("kcimg/"+filename,file1,"kcimg/"+request.getParameter("tt24"));
        }
        if(!request.getParameter("t27").isEmpty())item.setHba027(Float.valueOf(request.getParameter("t27")));
        if(!request.getParameter("t28").isEmpty())item.setHba028(Float.valueOf(request.getParameter("t28")));
        if(!request.getParameter("t29").isEmpty())item.setHba029(Float.valueOf(request.getParameter("t29")));
        if(!request.getParameter("t30").isEmpty())item.setHba030(Float.valueOf(request.getParameter("t30")));
        item.setHba025("");
        item.setHba026("A");
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t3") + "】的课程分类信息";
            item.setHba001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            hbaService.update(item);
            result.put("msg","U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t3")+ "】的课程分类信息";
            addLog(getUse(request).getUse002(),log);
            item = hbaService.insert(item);
            result.put("msg","I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    //后台分类加载
    @RequestMapping("/tocourseyy")
    public ModelAndView tocourseyy(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        int  kcid = Integer.parseInt(request.getParameter("kcid"));
        cdhba hba = hbaService.getByid(kcid);
        mav.addObject("item", hba);
        mav.addObject("pages", request.getParameter("pages"));
        mav.addObject("kcid", request.getParameter("kcid"));
        mav.addObject("name", request.getParameter("name"));
        mav.setViewName("HTcourseyy");
        return mav;
    }

    //后台排课加载
    @RequestMapping("/tocoursepk")
    public ModelAndView tocoursepk(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        int userid = 0;//后台登录用户ID
        userid = Decrypt(session.getAttribute("user").toString());
        // cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        int  kcid = Integer.parseInt(request.getParameter("kcid"));
        cdhba hba = hbaService.getByid(kcid);
        String pkyear = sdf2.format(new Date());
        //获取课程的指定年份排课
        if(request.getParameter("pkyear")!=null) pkyear = request.getParameter("pkyear");

        mav.addObject("hba", hba);
        mav.addObject("pages", request.getParameter("pages"));
        mav.addObject("kcid", kcid);
        mav.addObject("pkyear", pkyear);
        mav.addObject("name", request.getParameter("name"));

        mav.setViewName("HTcoursepk");
        return mav;
    }

    /**
     * 获取当月已排课记录
     * 孙伟丰
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/getcoursepk",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String getcoursepk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"提交保存年排课计划");
        int kcid = Integer.parseInt(request.getParameter("kcid"));
        String pkyear = request.getParameter("pkyear");
        String pkmonth = request.getParameter("pkmonth");
        //获取指定课程的指定月份的排课记录
        List<cdyhd> list = yhdService.getrllist(pkyear+"-"+pkmonth,kcid);
        if(list.size()>0){
            result.put("msg", "Y");
            result.put("list", list);
        }else result.put("msg", "N");
        return JSON.toJSONString(result);
    }


    /**
     * 排课保存
     * 孙伟丰
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/savecoursepk",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String savecoursepk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"提交保存年排课计划");
        int kcid = Integer.parseInt(request.getParameter("kcid"));
        int pkyear = Integer.parseInt(request.getParameter("pkyear"));
        String ispk = request.getParameter("ispk");
        JSONArray conditionlist = null;
        JSONArray dayarrlist = null;
        System.out.println(ispk);
        System.out.println(kcid);
        System.out.println(pkyear);
        System.out.println(request.getParameter("condition"));
        System.out.println(request.getParameter("dayarr"));
        if(request.getParameter("condition")!=null) conditionlist = JSON.parseArray(request.getParameter("condition").toString());
        if(request.getParameter("dayarr")!=null) dayarrlist = JSON.parseArray(request.getParameter("dayarr").toString());

        boolean w0_a=false, w0_b=false, w0_c=false,w1_a=false, w1_b=false, w1_c=false,
                w2_a=false, w2_b=false, w2_c=false,w3_a=false, w3_b=false, w3_c=false,
                w4_a=false, w4_b=false, w4_c=false,w5_a=false, w5_b=false, w5_c=false,
                w6_a=false, w6_b=false, w6_c=false;
        List<timeBetween> dateArray = new ArrayList();
        JSONObject week=null;
        JSONArray datearr = null;
        String wday="";
        String[] wdayarr,wdayarr1;
        ArrayList<cdyhd> saveTemp = new ArrayList<cdyhd>();
        if(conditionlist!=null){
            //先分析星期条件
            for(int i=0;i<7;i++){
                week = conditionlist.getJSONObject(i);
                wday = week.getString("X");
                wdayarr = wday.split("#");
                wdayarr1 = wdayarr[0].split("|");
                switch(i){
                    case 0:
                        w0_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w0_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w0_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                    case 1:
                        w1_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w1_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w1_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                    case 2:
                        w2_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w2_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w2_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                    case 3:
                        w3_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w3_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w3_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                    case 4:
                        w4_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w4_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w4_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                    case 5:
                        w5_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w5_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w5_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                    case 6:
                        w6_a = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[1].split("|");
                        w6_b = wdayarr1[0].equals("Y")?true:false;
                        wdayarr1 = wdayarr[2].split("|");
                        w6_c = wdayarr1[0].equals("Y")?true:false;
                        break;
                }
            }
            //限制日期
            if(conditionlist.size()>7){
                week = conditionlist.getJSONObject(7);
                datearr = week.getJSONArray("clist");
                for(int i=0;i<datearr.size();i++){
                    week = datearr.getJSONObject(i);
                    wday = week.getString("T");
                    //  System.out.println(wday);
                    timeBetween tm = new timeBetween();
                    wdayarr = wday.split("#");
                    tm.setStartTime(LocalDate.parse(wdayarr[0]));
                    tm.setEndTime(LocalDate.parse(wdayarr[1]));
                    dateArray.add(tm);
                }
            }
        }
        //指定年度
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1; //月份是从0开始的，所以需要+1
        int day = calendar.get(Calendar.DAY_OF_MONTH); //当前日期
        LocalDate startDate = LocalDate.of(pkyear, month, day);
        LocalDate endDate = LocalDate.of(pkyear, 12, 31);
        //判断排课Y：已排课，N：未排课 如果已排课并且星期条件不为空 则删除已排课记录
        if(ispk.equals("Y")&&conditionlist!=null) yhdService.deletebykcid(kcid,pkyear);
        //判断是否是已排课状态，同时条件为空 直接循环天修改集合，按天修改
        if(ispk.equals("Y")&&conditionlist==null){
            //如果按天修改的条件不为空，直接循环天修改集合，按天修改
            if(dayarrlist!=null&&dayarrlist.size()>0){
                for(int j=0;j<dayarrlist.size();j++){
                    week = dayarrlist.getJSONObject(j);
                    //判断操作类型D:删除 A:新添加 X:修改
                    cdyhd yhd = null;
                    if(week.getString("cz").equals("D")){
                        yhd = yhdService.getByid(week.getString("id"));
                        if(yhd!=null){
                            if(week.getString("title").indexOf("上午")>=0){
                                yhd.setYhd004("N");
                            }else if(week.getString("title").indexOf("下午")>=0){
                                yhd.setYhd005("N");
                            }else if(week.getString("title").indexOf("晚上")>=0){
                                yhd.setYhd006("N");
                            }
                        }
                    }else if(week.getString("cz").equals("X")){
                        yhd = yhdService.getByid(week.getString("id"));
                        if(week.getString("title").indexOf("上午")>=0){
                            //状态：Y：暂停打开 N：暂停关闭
                            if(week.getString("zt").equals("Y")) yhd.setYhd004("M");
                            else yhd.setYhd004("Y");
                        }else if(week.getString("title").indexOf("下午")>=0){
                            if(week.getString("zt").equals("Y")) yhd.setYhd005("M");
                            else yhd.setYhd005("Y");
                        }else if(week.getString("title").indexOf("晚上")>=0){
                            if(week.getString("zt").equals("Y")) yhd.setYhd006("M");
                            else yhd.setYhd006("Y");
                        }
                    }else if(week.getString("cz").equals("A")){
                        //查找当天的排课记录
                        yhd = yhdService.serachObject(week.getString("start"),kcid);
                        if(yhd!=null){
                            //已有保存，直接在上面记录
                            if(week.getString("title").indexOf("上午")>=0) yhd.setYhd004("Y");
                            else if(week.getString("title").indexOf("下午")>=0) yhd.setYhd005("Y");
                            else if(week.getString("title").indexOf("晚上")>=0) yhd.setYhd006("Y");
                            yhdService.update(yhd);
                        }else{
                            yhd = new cdyhd();
                            yhd.setYhd001(UUID.randomUUID().toString().replaceAll("-",""));
                            yhd.setYhd002(kcid);
                            yhd.setYhd003(week.getDate("start"));
                            if(week.getString("title").indexOf("上午")>=0) {
                                yhd.setYhd004("Y");
                                yhd.setYhd010(0);
                            }else if(week.getString("title").indexOf("下午")>=0) {
                                yhd.setYhd005("Y");
                                yhd.setYhd012(0);
                            }else if(week.getString("title").indexOf("晚上")>=0) {
                                yhd.setYhd006("Y");
                                yhd.setYhd014(0);
                            }
                            yhdService.insert(yhd);
                        }
                    }
                    //判断预约Bean,如果上午下午晚上都是不可预约，直接删除Bean
                    if(yhd!=null&&yhd.getYhd004().equals("N")&&yhd.getYhd005().equals("N")&&yhd.getYhd006().equals("N")){
                        yhdService.delete(yhd.getYhd001());
                    }
                }
            }
        }else{
            //重新按条件排课,本年度本田开始循环每天，依据条件进行排课保存
            boolean isok = true,isdel=false;
            String dateStr = "";
            for(LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                //System.out.println(date.getDayOfMonth());
                //System.out.println(date.getDayOfWeek().getValue());
                //System.out.println(date.getMonthValue());
                //System.out.println(date.getYear());
                dateStr = date.getYear()+"-"+
                        (date.getMonthValue()>9?date.getMonthValue():("0"+date.getMonthValue()))+"-"+
                        (date.getDayOfMonth()>9?date.getDayOfMonth():("0"+date.getDayOfMonth()));
                isok = true;
                for(int i=0;i<dateArray.size();i++){
                    if(isDateWithinRange(date,dateArray.get(i).getStartTime(),dateArray.get(i).getEndTime())){
                        isok = false;
                        break;
                    }
                }
                //不在限制范围内，接着判断周设定
                cdyhd yhd=null;
                if(isok){
                    //判断当前周几，是否是设定的周排课状态 星期一是 1，星期日是 7
                    switch(date.getDayOfWeek().getValue()){
                        case 1:
                            if(w1_a||w1_b||w1_c){
                                yhd = new cdyhd();
                                if(w1_a) yhd.setYhd004("Y");
                                else yhd.setYhd004("N");
                                if(w1_b) yhd.setYhd005("Y");
                                else yhd.setYhd005("N");
                                if(w1_c) yhd.setYhd006("Y");
                                else yhd.setYhd006("N");
                            }
                            break;
                        case 2:
                            if(w2_a||w2_b||w2_c){
                                yhd = new cdyhd();
                                if(w2_a) yhd.setYhd004("Y");
                                else yhd.setYhd004("N");
                                if(w2_b) yhd.setYhd005("Y");
                                else yhd.setYhd005("N");
                                if(w2_c) yhd.setYhd006("Y");
                                else yhd.setYhd006("N");
                            }
                            break;
                        case 3:
                            if(w3_a||w3_b||w3_c){
                                yhd = new cdyhd();
                                if(w3_a) yhd.setYhd004("Y");
                                else yhd.setYhd004("N");
                                if(w3_b) yhd.setYhd005("Y");
                                else yhd.setYhd005("N");
                                if(w3_c) yhd.setYhd006("Y");
                                else yhd.setYhd006("N");
                            }
                            break;
                        case 4:
                            if(w4_a||w4_b||w4_c){
                                yhd = new cdyhd();
                                if(w4_a) yhd.setYhd004("Y");
                                else yhd.setYhd004("N");
                                if(w4_b) yhd.setYhd005("Y");
                                else yhd.setYhd005("N");
                                if(w4_c) yhd.setYhd006("Y");
                                else yhd.setYhd006("N");
                            }
                            break;
                        case 5:
                            if(w5_a||w5_b||w5_c){
                                yhd = new cdyhd();
                                if(w5_a) yhd.setYhd004("Y");
                                if(w5_b) yhd.setYhd005("Y");
                                if(w5_c) yhd.setYhd006("Y");
                            }
                            break;
                        case 6:
                            if(w6_a||w6_b||w6_c){
                                yhd = new cdyhd();
                                if(w6_a) yhd.setYhd004("Y");
                                else yhd.setYhd004("N");
                                if(w6_b) yhd.setYhd005("Y");
                                else yhd.setYhd005("N");
                                if(w6_c) yhd.setYhd006("Y");
                                else yhd.setYhd006("N");
                            }
                            break;
                        case 7:
                            if(w0_a||w0_b||w0_c){
                                yhd = new cdyhd();
                                if(w0_a) yhd.setYhd004("Y");
                                else yhd.setYhd004("N");
                                if(w0_b) yhd.setYhd005("Y");
                                else yhd.setYhd005("N");
                                if(w0_c) yhd.setYhd006("Y");
                                else yhd.setYhd006("N");
                            }
                            break;
                    }
                    //如果预约日期不为空，则保存预约信息
                    if(yhd!=null){
                        //循环日期单天修改，是否有删除或暂停
                        if(dayarrlist!=null){
                            for(int p=0;p<dayarrlist.size();p++){
                                week = dayarrlist.getJSONObject(p);
                                if(week.getString("start").equals(dateStr)){
                                    if(week.getString("title").indexOf("上午")>=0){
                                        //产看操作，A:添加 D:删除 X：暂停
                                        if(week.getString("cz").equals("D")) yhd.setYhd004("N");
                                        else{
                                            if(week.getString("zt").equals("Y")) yhd.setYhd004("M");
                                            else yhd.setYhd004("Y");
                                        }
                                    }else if(week.getString("title").indexOf("下午")>=0){
                                        //产看操作，A:添加 D:删除 X：暂停
                                        if(week.getString("cz").equals("D")) yhd.setYhd005("N");
                                        else{
                                            if(week.getString("zt").equals("Y")) yhd.setYhd005("M");
                                            else yhd.setYhd005("Y");
                                        }
                                    }else if(week.getString("title").indexOf("晚上")>=0){
                                        //产看操作，A:添加 D:删除 X：暂停
                                        if(week.getString("cz").equals("D")) yhd.setYhd006("N");
                                        else{
                                            if(week.getString("zt").equals("Y")) yhd.setYhd006("M");
                                            else yhd.setYhd006("Y");
                                        }
                                    }
                                }
                            }
                        }
                        //如果上下晚状态都是N不可预约，就不与保存
                        if(yhd.getYhd004().equals("N")&&yhd.getYhd005().equals("N")&&yhd.getYhd006().equals("N")){

                        }else{
                            yhd.setYhd001(UUID.randomUUID().toString().replaceAll("-",""));
                            yhd.setYhd002(kcid);
                            yhd.setYhd003(df.parse(dateStr));
                            yhd.setYhd010(0);
                            yhd.setYhd012(0);
                            yhd.setYhd014(0);
                            yhdService.insert(yhd);
                        }
                    }
                }
                //单独循环单天条件，是否在限制周期内---不是---》检测是否在设定的周几内---不是---》
                // ---》新添加到集合内，已被上下晚状态修改，最后到跳出年日期循环后，按集合保存saveTemp
                if(dayarrlist!=null&&dayarrlist.size()>0){
                    for(int m=0;m<dayarrlist.size();m++){
                        week = dayarrlist.getJSONObject(m);
                        isok = true;//默认为true，添加到集合
                        //检测是否在限制周期内
                        if(week.getString("start").equals(dateStr)){
                            //检测是否在设定的周几内，循环
                            switch(date.getDayOfWeek().getValue()){
                                case 1:
                                    if(w1_a||w1_b||w1_c) isok = false;break;
                                case 2:
                                    if(w2_a||w2_b||w2_c) isok = false;break;
                                case 3:
                                    if(w3_a||w3_b||w3_c) isok = false;break;
                                case 4:
                                    if(w4_a||w4_b||w4_c) isok = false;break;
                                case 5:
                                    if(w5_a||w5_b||w5_c) isok = false;break;
                                case 6:
                                    if(w6_a||w6_b||w6_c) isok = false;break;
                                case 7:
                                    if(w0_a||w0_b||w0_c) isok = false;break;
                            }
                            //产生预约信息，保存到集合
                            if(isok){
                                isdel = true;//这里借用标识是否是
                                //循环已保存的集合，存在相同日期，直接取出修改
                                for(int g=0;g<saveTemp.size();g++){
                                    if(saveTemp.get(g).getYhd003().getTime()== df.parse(dateStr).getTime()){
                                        cdyhd yhdtemp = saveTemp.get(g);
                                        if(week.getString("title").indexOf("上午")>=0){
                                            if(week.getString("cz").equals("D")) yhdtemp.setYhd004("N");
                                            else{
                                                if(week.getString("zt").equals("Y")) yhdtemp.setYhd004("M");
                                                else yhdtemp.setYhd004("Y");
                                            }
                                        }else if(week.getString("title").indexOf("下午")>=0){
                                            if(week.getString("cz").equals("D")) yhdtemp.setYhd005("N");
                                            else{
                                                if(week.getString("zt").equals("Y")) yhdtemp.setYhd005("M");
                                                else yhdtemp.setYhd005("Y");
                                            }
                                        }else if(week.getString("title").indexOf("晚上")>=0){
                                            if(week.getString("cz").equals("D")) yhdtemp.setYhd006("N");
                                            else{
                                                if(week.getString("zt").equals("Y")) yhdtemp.setYhd006("M");
                                                else yhdtemp.setYhd006("Y");
                                            }
                                        }
                                        saveTemp.set(g,yhdtemp);
                                        isdel = false;
                                    }
                                }
                                //没有在集合，就重新添加
                                if(isdel){
                                    cdyhd yhdtemp = new cdyhd();
                                    yhdtemp.setYhd001(UUID.randomUUID().toString().replaceAll("-",""));
                                    yhdtemp.setYhd002(kcid);
                                    yhdtemp.setYhd003(df.parse(dateStr));
                                    yhdtemp.setYhd004("N");
                                    yhdtemp.setYhd005("N");
                                    yhdtemp.setYhd006("N");
                                    if(week.getString("title").indexOf("上午")>=0){
                                        if(week.getString("cz").equals("D")) yhdtemp.setYhd004("N");
                                        else{
                                            if(week.getString("zt").equals("Y")) yhdtemp.setYhd004("M");
                                            else yhdtemp.setYhd004("Y");
                                        }
                                    }else if(week.getString("title").indexOf("下午")>=0){
                                        if(week.getString("cz").equals("D")) yhdtemp.setYhd005("N");
                                        else{
                                            if(week.getString("zt").equals("Y")) yhdtemp.setYhd005("M");
                                            else yhdtemp.setYhd005("Y");
                                        }
                                    }else if(week.getString("title").indexOf("晚上")>=0){
                                        if(week.getString("cz").equals("D")) yhdtemp.setYhd006("N");
                                        else{
                                            if(week.getString("zt").equals("Y")) yhdtemp.setYhd006("M");
                                            else yhdtemp.setYhd006("Y");
                                        }
                                    }
                                    yhdtemp.setYhd010(0);
                                    yhdtemp.setYhd012(0);
                                    yhdtemp.setYhd014(0);
                                    saveTemp.add(yhdtemp);
                                }
                            }
                        }
                    }
                }
            }
            //全部结束后，需要循环单独日期设定的集合，删选保存
            for(int j=0;j<saveTemp.size();j++){
                cdyhd yhd = saveTemp.get(j);
                //上下晚都不上课，就不必保存
                if(yhd.getYhd004().equals("N")&&yhd.getYhd005().equals("N")&&yhd.getYhd006().equals("N")){
                }else{
                    System.out.println("---单日排课保存---");
                    yhdService.insert(yhd);
                }
            }
        }
        result.put("msg", "Y");
        return JSON.toJSONString(result);
    }


    //后台分类加载
    @RequestMapping("/tocoursels")
    public ModelAndView tocoursels(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        System.out.println(request);
        mav.addObject("yhclist", yhcService.getAll(request.getParameter("kcid"),request.getParameter("name1")));
        mav.addObject("pages", request.getParameter("pages"));
        mav.addObject("kcid", request.getParameter("kcid"));
        mav.addObject("name", request.getParameter("name"));
        mav.addObject("name1", request.getParameter("name1"));
        mav.setViewName("HTcoursels");
        return mav;
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/delcoursels",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String delcoursels(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"删除了课程分类名称为：【" + request.getParameter("uname") + "】的状态");
        if(yheService.countBylsid(Integer.parseInt(request.getParameter("fid")))==0){
            yhcService.delete(Integer.parseInt(request.getParameter("fid")));
            result.put("msg","0");
        }else{
            result.put("msg","1");
        }
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存内容
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/xgcoursels",headers = "content-type=multipart/form-data")
    public String xgcoursels(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        cdyhc item = new cdyhc();
        //修改
        item.setYhc003(request.getParameter("t3"));
        item.setYhc004(request.getParameter("t4"));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t3") + "】的课程分类信息";
            item.setYhc001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            yhcService.update(item);
            result.put("msg","U");
        }else{
            item.setYhc002(Integer.valueOf(request.getParameter("kcid")));
            String log = "新增了名字为：【" + request.getParameter("t3")+ "】的课程分类信息";
            addLog(getUse(request).getUse002(),log);
            item = yhcService.insert(item);
            result.put("msg","I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    /**
     * 进入管理员管理页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping("/toselect")
    public ModelAndView toselect(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
        if(user.getUse009().equals("A")||user.getUse009().equals("C")){
            mav.addObject("msg", request.getParameter("msg"));
            PageBean pb = new PageBean();
            if (request.getParameter("pages") != null && !request.getParameter("pages").isEmpty())
                pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
            else
                pb.setCurrentPage(1);
            if (request.getParameter("name") != null && !request.getParameter("name").isEmpty()) {
                pb.setOthersql(request.getParameter("name"));
            }
            if (request.getParameter("phone") != null && !request.getParameter("phone").isEmpty()) {
                pb.setOthersql6(request.getParameter("phone"));
            }
            if (request.getParameter("lx") != null && !request.getParameter("lx").isEmpty()) {
                pb.setOthersql1(request.getParameter("lx"));
            }
            mav.addObject("pageobj", smdService.selectPageBean(pb));
            mav.setViewName("HTselect");
        }else{
            mav.addObject("item", smdService.getByid(user.getUse011()));
            mav.addObject("zt", user.getUse013());
            mav.addObject("bz", user.getUse014());
            mav.setViewName("HTselectxq");
        }
        return mav;
    }


    /**
     * 修改账户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgselect")
    public String xgselect(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        cdsmd item = new cdsmd();
        //修改
        item.setSmd002(request.getParameter("t2"));
        item.setSmd003(request.getParameter("t3"));
        item.setSmd004(request.getParameter("t4"));
        item.setSmd005(request.getParameter("t5"));
        item.setSmd006(request.getParameter("t6"));
        item.setSmd007(request.getParameter("t7"));
        item.setSmd009(Integer.valueOf(request.getParameter("t9")));
        item.setSmd010(Integer.valueOf(request.getParameter("t10")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t1") + "】的用户信息";
            item.setSmd001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            smdService.update(item);
            result.put("msg", "U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t1")+ "】的用户信息";
            item.setSmd008(new Date());
            item.setSmd011(0);
            item.setSmd012(0);
            item.setSmd013(0);
            addLog(getUse(request).getUse002(),log);
            item = smdService.insert(item);
            result.put("msg", "I");
        }
        if(request.getParameter("zt")!=null){
            cduse use=new cduse();
            use.setUse001(Decrypt(session.getAttribute("user").toString()));
            use.setUse013("P");
            use.setUse014("");
            useService.update(use);
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }

    /**
     * 进入管理员管理页面
     * othersql:登录名  othersql1:机构
     * @return 用户页面
     */
    @RequestMapping("/toselection")
    public ModelAndView toselection(HttpServletRequest request,HttpServletResponse response) throws Exception{
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        userid = Decrypt(session.getAttribute("user").toString());
        cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
            mav.addObject("msg", request.getParameter("msg"));
            PageBean pb = new PageBean();
            if (request.getParameter("pages") != null && !request.getParameter("pages").isEmpty())
                pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
            else
                pb.setCurrentPage(1);
            if (request.getParameter("name") != null && !request.getParameter("name").isEmpty()) {
                pb.setOthersql(request.getParameter("name"));
            }
            if (request.getParameter("phone") != null && !request.getParameter("phone").isEmpty()) {
                pb.setOthersql6(request.getParameter("phone"));
            }
            if (request.getParameter("lx") != null && !request.getParameter("lx").isEmpty()) {
                pb.setOthersql1(request.getParameter("lx"));
            }
            mav.addObject("pageobj", yheService.selectPageBean(pb));
        mav.addObject("smdlist", smdService.getAll());
        mav.addObject("hbblist", hbbService.getAll());
        mav.addObject("hbalist", hbaService.getAll(null, null));
            mav.setViewName("HTselection");
        return mav;
    }

    /**
     * 删除用户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgztselection",produces= MediaType.APPLICATION_JSON_VALUE+";charset=utf-8")
    public String xgztselection(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        addLog(getUse(request).getUse002(),"修改了选课方名称为：【" + request.getParameter("uname") + "】的课程预约状态");
        cdyheWithBLOBs yhe = yheService.getByid(Integer.valueOf(request.getParameter("fid")));
        yhe.setYhe007(request.getParameter("type"));
        if(request.getParameter("t1")!=null){
            yhe.setYhe030(request.getParameter("t1"));
        }else{
            yhe.setYhe030("");
        }
        yheService.update(yhe);
        result.put("msg","0");
        return JSON.toJSONString(result);
    }

    /**
     * 修改账户
     * 王新苗
     * @param request
     * @param response
     */
    @ResponseBody
    @RequestMapping(value = "/xgselection")
    public String xgselection(HttpServletRequest request, HttpServletResponse response) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        cdyheWithBLOBs item = new cdyheWithBLOBs();
        //修改
        item.setYhe002(Integer.valueOf(request.getParameter("t2")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t1") + "】的用户信息";
            item.setYhe001(Integer.valueOf(request.getParameter("fid")));
            addLog(getUse(request).getUse002(),log);
            yheService.update(item);
            result.put("msg", "U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t1")+ "】的用户信息";
            addLog(getUse(request).getUse002(),log);
            item = yheService.insert(item);
            result.put("msg", "I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }
}
