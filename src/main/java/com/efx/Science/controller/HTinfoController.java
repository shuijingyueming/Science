package com.efx.Science.controller;


import com.alibaba.fastjson.JSON;
import com.efx.Science.model.*;
import com.efx.Science.until.EncrpytUtil;
import com.efx.Science.until.ExcelExport;
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
import java.io.File;
import java.io.InputStream;
import java.util.*;


@Controller
@RequestMapping("/toHt")
public class HTinfoController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;

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
        }else{
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
            mav.addObject("pageobj", useService.selectPageBean(pb));
            if(pb.getOthersql1().equals("B")){
                mav.addObject("smdlist", smdService.getAll());
            }else if(pb.getOthersql1().equals("C")){

            }
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
        use.setUse013(request.getParameter("type"));
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
        if(request.getParameter("t11")!=null&&request.getParameter("t11").isEmpty())item.setUse011(Integer.valueOf(request.getParameter("t11")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t1") + "】的用户信息";
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
            String log = "新增了名字为：【" + request.getParameter("t1")+ "】的用户信息";
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

    //后台分类加载
    @RequestMapping("/tolevel")
    public ModelAndView tolevel(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }else{
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
        }
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

    //后台分类加载
    @RequestMapping("/tocourselx")
    public ModelAndView tocourselx(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        ModelAndView mav = new ModelAndView();
        int userid = 0;//后台登录用户ID
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }else{
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
        }
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
        }else{
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
            mav.addObject("pageobj", hbaService.selectPageBean(pb));
            mav.addObject("smdlist", smdService.getAll());
            mav.addObject("hbblist", hbbService.getAll());
        }
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
        item.setHba019(request.getParameter("t15"));
        item.setHba018(request.getParameter("t16"));
        item.setHba017(request.getParameter("t17"));
        item.setHba019(request.getParameter("t19"));
        Date date = new Date();
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartHttpServletRequest.getFile("t20");
        if(null!=file.getOriginalFilename()&&!file.getOriginalFilename().toString().isEmpty()){
            String filename = sdf.format(date)+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            item.setHba020(filename);
            uploadpic("kcvideo/"+filename,file,"kcvideo/"+request.getParameter("tt20"));
        }
        if(!request.getParameter("t21").isEmpty())item.setHba021(Integer.valueOf(request.getParameter("t21")));
        if(!request.getParameter("t22").isEmpty())item.setHba022(Integer.valueOf(request.getParameter("t22")));
        if(!request.getParameter("t27").isEmpty())item.setHba027(Float.valueOf(request.getParameter("t27")));
        if(!request.getParameter("t28").isEmpty())item.setHba028(Float.valueOf(request.getParameter("t28")));
        if(!request.getParameter("t29").isEmpty())item.setHba029(Float.valueOf(request.getParameter("t29")));
        if(!request.getParameter("t30").isEmpty())item.setHba030(Float.valueOf(request.getParameter("t30")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t3") + "】的课程分类信息";
            item.setHba001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            hbaService.update(item);
            result.put("msg","U");
        }else{
            item.setHba026("A");
            String log = "新增了名字为：【" + request.getParameter("t3")+ "】的课程分类信息";
            addLog(getUse(request).getUse002(),log);
            item = hbaService.insert(item);
            result.put("msg","I");
        }
        result.put("d",item);
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
        }else{
            userid = Decrypt(session.getAttribute("user").toString());
            cduse user = useService.getByid(Decrypt(session.getAttribute("user").toString()));
            System.out.println(request);
            mav.addObject("yhclist", yhcService.getAll(request.getParameter("kcid"),request.getParameter("name1")));
            mav.addObject("pages", request.getParameter("pages"));
            mav.addObject("kcid", request.getParameter("kcid"));
            mav.addObject("name", request.getParameter("name"));
            mav.addObject("name1", request.getParameter("name1"));
        }
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
        }else{
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
            mav.addObject("pageobj", smdService.selectPageBean(pb));
        }
        mav.setViewName("HTselect");
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
        item.setSmd008(DATE.parse(request.getParameter("t8")));
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()){
            String log = "修改了名字为：【" + request.getParameter("t1") + "】的用户信息";
            item.setSmd001(Integer.valueOf((request.getParameter("fid"))));
            addLog(getUse(request).getUse002(),log);
            smdService.update(item);
            result.put("msg", "U");
        }else{
            String log = "新增了名字为：【" + request.getParameter("t1")+ "】的用户信息";
            item.setSmd011(0);
            item.setSmd012(0);
            item.setSmd013(0);
            addLog(getUse(request).getUse002(),log);
            item = smdService.insert(item);
            result.put("msg", "I");
        }
        result.put("d",item);
        return JSON.toJSONString(result);
    }
}
