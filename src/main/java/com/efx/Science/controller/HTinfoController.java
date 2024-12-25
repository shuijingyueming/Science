package com.efx.Science.controller;


import com.alibaba.fastjson.JSON;
import com.efx.Science.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
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

    //后台分类加载
    @RequestMapping("/toHTmain")
    public ModelAndView htMain(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("usglist",usgService.selectall());
        mav.setViewName("HTmain");
        return mav;
    }

    //后台内容加载
    @RequestMapping("/toHTcon")
    public ModelAndView htCon(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        List<cdusd> cdusdList = usdService.selectall();
        for(int i=0;i<cdusdList.size();i++){
            cdusd usd = cdusdList.get(i);
            if(usd.getUsd002()!=null) {
                cdusa usa = usaService.selectByid(usd.getUsd002());
                usd.setUsa(usa);
                cdusc usc = uscService.selectByid(usa.getUsa003());
                usd.setUsc(usc);
                cdusg usg = usgService.selectByid(usc.getUsc003());
                usd.setUsg(usg);
            }
            if(usd.getUsd006()!=null){
                cdusc usc = uscService.selectByid(usd.getUsd006());
                usd.setUsc(usc);
                cdusg usg = usgService.selectByid(usc.getUsc003());
                usd.setUsg(usg);
            }
            if(usd.getUsd008()!=null){
                usd.setUsg(usgService.selectByid(usd.getUsd008()));
            }
            cdusdList.set(i,usd);
        }
        mav.addObject("usdList",cdusdList);
        List<cdusg> usgList = usgService.selectall();
        mav.addObject("usgList",usgList);
        mav.setViewName("HTcon");
        return mav;
    }

    //后台内容查询
    @ResponseBody
    @RequestMapping("/scrachcon")
    public String scrachcon(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        int oneid = Integer.parseInt(request.getParameter("oneid"));
        int twoid = 0;
        if(!request.getParameter("twoid").equals("null")) twoid = Integer.parseInt(request.getParameter("twoid"));
        int threeid = 0;
        if(!request.getParameter("threeid").equals("null")) threeid = Integer.parseInt(request.getParameter("threeid"));
        if(threeid>0){
            List<cdusd> usdList = usdService.selectForthreeType(threeid);
            for(int i=0;i<usdList.size();i++){
                cdusd usd = usdList.get(i);
                cdusa usa = usaService.selectByid(usd.getUsd002());
                usd.setUsa(usa);
                cdusc usc = uscService.selectByid(usa.getUsa003());
                usd.setUsc(usc);
                cdusg usg = usgService.selectByid(usc.getUsc003());
                usd.setUsg(usg);
                usdList.set(i,usd);
            }
            result.put("usdList", usdList);
        }else if(twoid>0) {
            List<cdusd> usdList = new ArrayList<cdusd>();
            usdList.addAll(usdService.selectFortwoType(twoid));
            //获取二级类目下的所有三级类ID
            List<cdusa> usaList = uscService.selectByid(twoid).getUsalist();
            for(int i=0;i<usaList.size();i++){
                usdList.addAll(usdService.selectForthreeType(usaList.get(i).getUsa001()));
            }
            for(int i=0;i<usdList.size();i++){
                cdusd usd = usdList.get(i);
                cdusc usc = uscService.selectByid(usd.getUsd006());
                usd.setUsc(usc);
                cdusg usg = usgService.selectByid(usc.getUsc003());
                usd.setUsg(usg);
                usdList.set(i,usd);
            }
            result.put("usdList",usdList);
        } else if(oneid>0) {
            List<cdusd> usdList = new ArrayList<cdusd>();
            usdList.addAll(usdService.selectForoneType(oneid));
            //获取一级类目下的所有二级类ID
            List<cdusc> uscList = usgService.selectByid(oneid).getUsclist();
            for(int i=0;i<uscList.size();i++){
                usdList.addAll(usdService.selectFortwoType(uscList.get(i).getUsc001()));
                List<cdusa> usaList = uscList.get(i).getUsalist();
                for(int j=0;j<usaList.size();j++){
                    usdList.addAll(usdService.selectForthreeType(usaList.get(j).getUsa001()));
                }
            }
            for(int i=0;i<usdList.size();i++){
                cdusd usd = usdList.get(i);
                cdusg usg = usgService.selectByid(usd.getUsd002());
                usd.setUsg(usg);
                usdList.set(i,usd);
            }
            result.put("usdList",usdList);
        }else{
            List<cdusd> cdusdList = usdService.selectall();
            for(int i=0;i<cdusdList.size();i++){
                cdusd usd = cdusdList.get(i);
                if(usd.getUsd002()!=null) {
                    cdusa usa = usaService.selectByid(usd.getUsd002());
                    usd.setUsa(usa);
                    cdusc usc = uscService.selectByid(usa.getUsa003());
                    usd.setUsc(usc);
                    cdusg usg = usgService.selectByid(usc.getUsc003());
                    usd.setUsg(usg);
                }
                if(usd.getUsd006()!=null){
                    cdusc usc = uscService.selectByid(usd.getUsd006());
                    usd.setUsc(usc);
                    cdusg usg = usgService.selectByid(usc.getUsc003());
                    usd.setUsg(usg);
                }
                if(usd.getUsd008()!=null){
                    usd.setUsg(usgService.selectByid(usd.getUsd008()));
                }
                cdusdList.set(i,usd);
            }
            result.put("usdList",cdusdList);
        }
        return JSON.toJSONString(result);
    }

    //查询一级对应下的二级
    @ResponseBody
    @RequestMapping("/scrachcononeType")
    public String scrachcononeType(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        int id = Integer.parseInt(request.getParameter("id"));
        cdusg usg = usgService.selectByid(id);
        result.put("uscList", usg.getUsclist());
        return JSON.toJSONString(result);
    }

    //查询二级对应下的三级
    @ResponseBody
    @RequestMapping("/scrachcontwoType")
    public String scrachcontwoType(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        int id = Integer.parseInt(request.getParameter("id"));
        cdusc usc = uscService.selectByid(id);
        result.put("usaList", usc.getUsalist());
        return JSON.toJSONString(result);
    }

    //后台首页加载
    @RequestMapping("/toHThome")
    public ModelAndView toHThome(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        mav.addObject("usbList",usbService.selectall());
        mav.setViewName("HThome");
        return mav;
    }

    /**
     * ajax删除分类下的图片
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/delOneTypePic",headers = "content-type=multipart/form-data")
    public String delOneTypePic(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String fid = request.getParameter("fid");
        String stype = request.getParameter("stype");
        if(fid!=null&&!fid.isEmpty()){
            File file;
            String filePath = this.getClass().getResource("/").getPath();
            if(stype.equals("A")){
               cdusg usg = usgService.selectByid(Integer.parseInt(fid));
               file = new File(filePath+usg.getUsg004());
               if(file.exists()) file.deleteOnExit();
               usg.setUsg004("");
               usgService.update(usg);
            }else if(stype.equals("B")){
                cdusc usc = uscService.selectByid(Integer.parseInt(fid));
                file = new File(filePath+usc.getUsc004());
                if(file.exists()) file.deleteOnExit();
                usc.setUsc004("");
                uscService.update(usc);
            }else if(stype.equals("C")){
                cdusa usa = usaService.selectByid(Integer.parseInt(fid));
                file = new File(filePath+usa.getUsa004());
                if(file.exists()) file.deleteOnExit();
                usa.setUsa004("");
                usaService.update(usa);
            }
        }
        result.put("msg", 0);
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存一级分类
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/saveOneType",headers = "content-type=multipart/form-data")
    public String serachsqnf(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String date = sdf.format(new Date());
        String stype = request.getParameter("stype");
        String sid = request.getParameter("sid");
        String fid = request.getParameter("fid");
        String fname = request.getParameter("fname");
        String fext = request.getParameter("fext");
        String fileString = request.getParameter("picfile");
        String qy = request.getParameter("qy");
        String wurl = request.getParameter("wurl");
        //如果分类ID不为空，标识是编辑
        String filePath = this.getClass().getResource("/").getPath();
        //一级分类操作
        if(stype.equals("A")){
            filePath = filePath.substring(1,filePath.length())+"static/upload/pimg/";
            if(fid!=null&&!fid.isEmpty()){
                cdusg usg = usgService.selectByid(Integer.parseInt(fid));
                if(usg!=null){
                    usg.setUsg002(fname);//分类名称
                    usg.setUsg005(qy);//是否启用
                    usg.setUsg006(wurl);
                    if(fileString.indexOf("data:image/jpeg;base64,")>=0){
                        //先删除原图片
                        File oldFile = new File(filePath+usg.getUsg004());
                        if(oldFile.exists()) oldFile.deleteOnExit();
                        //加入新图片
                        uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                        usg.setUsg004(date+"."+fext);
                    }
                    usgService.update(usg);
                    result.put("usg", usg);
                    result.put("msg", "修改一级分类成功");
                }
            }else{
                //新插入分类
                cdusg usg = new cdusg();
                usg.setUsg002(fname);//分类名称
                usg.setUsg005(qy);//是否启用
                usg.setUsg006(wurl);
                if(fileString.indexOf("data:image/jpeg;base64,")>=0){
                    //加入新图片
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usg.setUsg004(date+"."+fext);
                }
                usg = usgService.insert(usg);
                result.put("usg", usg);
                result.put("msg", "添加一级分类成功");
            }
        }else if(stype.equals("B")){
            filePath = filePath.substring(1,filePath.length())+"static/upload/fimg/";
            if(fid!=null&&!fid.isEmpty()){
                cdusc usc = uscService.selectByid(Integer.parseInt(fid));
                if(usc!=null){
                   usc.setUsc002(fname);
                   usc.setUsc003(Integer.parseInt(sid));
                   usc.setUsc005(qy);
                   usc.setUsc006(wurl);
                   System.out.println(fileString.indexOf("data:image/jpeg;base64,"));
                    if(fileString.indexOf("data:image/jpeg;base64,")>=0){
                        //先删除原图片
                        File oldFile = new File(filePath+usc.getUsc004());
                        if(oldFile.exists()) oldFile.deleteOnExit();
                        //加入新图片
                        uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                        usc.setUsc004(date+"."+fext);
                    }
                    uscService.update(usc);
                    result.put("usc", usc);
                    result.put("msg", "修改二级分类成功");
                }
            }else{
                //新插入二级分类
                cdusc usc = new cdusc();
                usc.setUsc002(fname);
                usc.setUsc003(Integer.parseInt(sid));
                usc.setUsc005(qy);
                usc.setUsc006(wurl);
                if(fileString.indexOf("data:image/jpeg;base64,")>=0){
                    //加入新图片
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usc.setUsc004(date+"."+fext);
                }
                usc = uscService.insert(usc);
                result.put("usc", usc);
                result.put("msg", "添加二级分类成功");
            }
        }else if(stype.equals("C")) {
            filePath = filePath.substring(1,filePath.length())+"static/upload/mimg/";
            if(fid!=null&&!fid.isEmpty()){
                cdusa usa = usaService.selectByid(Integer.parseInt(fid));
                if(usa!=null){
                    usa.setUsa002(fname);
                    usa.setUsa003(Integer.parseInt(sid));
                    usa.setUsa005(qy);
                    usa.setUsa006(wurl);
                    if(fileString.indexOf("data:image/jpeg;base64,")>=0){
                        //先删除原图片
                        File oldFile = new File(filePath+usa.getUsa004());
                        if(oldFile.exists()) oldFile.deleteOnExit();
                        //加入新图片
                        uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                        usa.setUsa004(date+"."+fext);
                    }
                    usaService.update(usa);
                    result.put("usa", usa);
                    result.put("msg", "修改三级分类成功");
                }
            }else{
                //新插入二级分类
                cdusa usa = new cdusa();
                usa.setUsa002(fname);
                usa.setUsa003(Integer.parseInt(sid));
                usa.setUsa005(qy);
                usa.setUsa006(wurl);
                if(fileString.indexOf("data:image/jpeg;base64,")>=0){
                    //加入新图片
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usa.setUsa004(date+"."+fext);
                }
                usa = usaService.insert(usa);
                result.put("usa", usa);
                result.put("msg", "添加三级分类成功");
            }
        }
        result.put("stype", stype);
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存首页
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/savehome",headers = "content-type=multipart/form-data")
    public String savehome(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String date = sdf.format(new Date());
        String fid = request.getParameter("fid");
        String fext = request.getParameter("fext");
        String fileString = request.getParameter("picfile");
        String qy = request.getParameter("qy");
        File vmfile;
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/simg/";
       // System.out.println(fid);
        if(fid!=null&&!fid.isEmpty()){
           cdusb usb = usbService.selectById(Integer.parseInt(fid));
           usb.setUsb003(qy);
           if(fileString.indexOf("upload/simg/")<0){
               //删除原图片或视频
               vmfile = new File(filePath+usb.getUsb002());
               if(vmfile.exists()) vmfile.deleteOnExit();
               //加入新图片
               if(qy.equals("Y")){
                   uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
               }else{
                   uploadvidao_Base64(fileString,filePath+date+"."+fext);
               }
               usb.setUsb002(date+"."+fext);
           }
            usbService.update(usb);
            result.put("usb",usb);
            result.put("msg","修改成功");
        }else{
           // System.out.println(fileString);
            cdusb usb = new cdusb();
            usb.setUsb003(qy);
            if(fileString.indexOf("upload/simg/")<0){
                //加入新图片
                if(qy.equals("Y")){
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                }else{
                    uploadvidao_Base64(fileString,filePath+date+"."+fext);
                }
                usb.setUsb002(date+"."+fext);
            }
            usb = usbService.insert(usb);
            result.put("usb",usb);
            result.put("msg","添加成功");
        }
        return JSON.toJSONString(result);
    }

    /**
     * ajax删除一级分类
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/delOneType")
    public String delsqnf(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String stype =  request.getParameter("stype");
        String fid = request.getParameter("fid");
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/pimg/";
        cdusd usd;
        File file;
        cdusa usa;
        cdusc usc;
        List<cdusc> usclist;
        List<cdusa> usalist;
        //删除一级分类及以下份类
        if(stype.equals("A")){
            cdusg usg = usgService.selectByid(Integer.parseInt(fid));
            //删除一级分类下的内容
            if(usg.getUsdlist()!=null){
                for(int i=0;i<usg.getUsdlist().size();i++){
                    usd = usg.getUsdlist().get(i);
                    file = new File(filePath+usd.getUsd005());
                    if(file.exists()) file.deleteOnExit();
                    usdService.delete(usd.getUsd001());
                }
            }
            //删除风雷下二级分类
            usclist = usg.getUsclist();
            if(usclist!=null){
                for(int i=0;i<usclist.size();i++){
                    usc = usclist.get(i);
                    //删除二级类下文件
                    if(usc.getUsdlist()!=null){
                        for(int j=0;j<usc.getUsdlist().size();j++){
                            usd = usc.getUsdlist().get(j);
                            file = new File(filePath+usd.getUsd005());
                            if(file.exists()) file.deleteOnExit();
                            usdService.delete(usd.getUsd001());
                        }
                    }
                    //删除此类别下的三级分类
                    usalist = usc.getUsalist();
                    if(usalist!=null){
                        for(int j=0;j<usalist.size();j++){
                            usa = usalist.get(j);
                            //删除三级类下文件
                            if(usa.getUsdlist()!=null){
                                for(int k=0;k<usa.getUsdlist().size();k++){
                                    usd = usa.getUsdlist().get(k);
                                    file = new File(filePath+usd.getUsd005());
                                    if(file.exists()) file.deleteOnExit();
                                    usdService.delete(usd.getUsd001());
                                }
                            }
                            //删除本级分类
                            usaService.delete(usa.getUsa001());
                        }
                    }
                    //删除本级分类
                    uscService.delete(usc.getUsc001());
                }
            }
            //删除本级分类
            usgService.delete(usg.getUsg001());
        }else if(stype.equals("B")){
            usc = uscService.selectByid(Integer.parseInt(fid));
            //删除二级类下文件
            if(usc.getUsdlist()!=null){
                for(int j=0;j<usc.getUsdlist().size();j++){
                    usd = usc.getUsdlist().get(j);
                    file = new File(filePath+usd.getUsd005());
                    if(file.exists()) file.deleteOnExit();
                    usdService.delete(usd.getUsd001());
                }
            }
            //删除此类别下的三级分类
            usalist = usc.getUsalist();
            if(usalist!=null){
                for(int j=0;j<usalist.size();j++){
                    usa = usalist.get(j);
                    //删除三级类下文件
                    if(usa.getUsdlist()!=null){
                        for(int k=0;k<usa.getUsdlist().size();k++){
                            usd = usa.getUsdlist().get(k);
                            file = new File(filePath+usd.getUsd005());
                            if(file.exists()) file.deleteOnExit();
                            usdService.delete(usd.getUsd001());
                        }
                    }
                    //删除本级分类
                    usaService.delete(usa.getUsa001());
                }
            }
            //删除本级分类
            uscService.delete(usc.getUsc001());
        }else if(stype.equals("C")){
            usa = usaService.selectByid(Integer.parseInt(fid));
            //删除三级类下文件
            if(usa.getUsdlist()!=null){
                for(int k=0;k<usa.getUsdlist().size();k++){
                    usd = usa.getUsdlist().get(k);
                    file = new File(filePath+usd.getUsd005());
                    if(file.exists()) file.deleteOnExit();
                    usdService.delete(usd.getUsd001());
                }
            }
            usaService.delete(usa.getUsa001());
        }
        result.put("msg","Y");
        return JSON.toJSONString(result);
    }

    /**
     * ajax删除一级分类
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/delhome")
    public String delhome(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String fid = request.getParameter("fid");
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/simg/";
        cdusb usb = usbService.selectById(Integer.parseInt(fid));
        if(usb.getUsb002()!=null&&!usb.getUsb002().isEmpty()){
            File file = new File(filePath+usb.getUsb002());
            if(file.exists()) file.deleteOnExit();
        }
        usbService.delete(usb.getUsb001());
        result.put("msg","Y");
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存内容
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/savecon",headers = "content-type=multipart/form-data")
    public String savecon(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String date = sdf.format(new Date());
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/cimg/";
        int fid = 0;
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()) {
            fid = Integer.parseInt(request.getParameter("fid"));
        }
        int sone = Integer.parseInt(request.getParameter("sonetype"));
        int stwo = Integer.parseInt(request.getParameter("stwotype"));
        int sthree = Integer.parseInt(request.getParameter("sthreetype"));
        String lx = request.getParameter("lx");
        String fext = request.getParameter("fext");
        String wtxt = request.getParameter("wtxt");
        String fileString = request.getParameter("picfile");
        String wurl = request.getParameter("wurl");
        cdusd usd;
        File file;
        if(fid>0){
            //编辑
            usd = usdService.selectByid(fid);
            usd.setUsd003(lx);
            usd.setUsd007(wurl);
            if(lx.equals("B")){
                usd.setUsd004(wtxt);
                if(fileString.indexOf("upload/cimg/")<0){
                    if(usd.getUsd005()!=null&&!usd.getUsd005().isEmpty()){
                        file = new File(filePath+usd.getUsd005());
                        if(file.exists()) file.deleteOnExit();
                    }
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usd.setUsd005(date+"."+fext);
                }
            }else{
                usd.setUsd004(null);
                if(fileString.indexOf("upload/cimg/")<0){
                    if(usd.getUsd005()!=null&&!usd.getUsd005().isEmpty()){
                        file = new File(filePath+usd.getUsd005());
                        if(file.exists()) file.deleteOnExit();
                    }
                    uploadvidao_Base64(fileString,filePath+date+"."+fext);
                    usd.setUsd005(date+"."+fext);
                }
            }
            if(sthree>0) usd.setUsd002(sthree);
            else if(stwo>0) usd.setUsd006(stwo);
            else if(sone>0) usd.setUsd008(sone);
            usdService.update(usd);
            result.put("msg","修改成功");
        }else{
            usd = new cdusd();
            usd.setUsd003(lx);
            usd.setUsd007(wurl);
            if(lx.equals("B")){
                usd.setUsd004(wtxt);
                if(fileString.indexOf("upload/cimg/")<0){
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usd.setUsd005(date+"."+fext);
                }
            }else{
                usd.setUsd004(null);
                if(fileString.indexOf("upload/cimg/")<0){
                    uploadvidao_Base64(fileString,filePath+date+"."+fext);
                    usd.setUsd005(date+"."+fext);
                }
            }
            if(sthree>0) usd.setUsd002(sthree);
            else if(stwo>0) usd.setUsd006(stwo);
            else if(sone>0) usd.setUsd008(sone);
            usd = usdService.insert(usd);
            result.put("msg","添加成功");
        }
        result.put("usd",usd);
        return JSON.toJSONString(result);
    }

    /**
     * ajax删除内容
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/delcon")
    public String delcon(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String fid = request.getParameter("fid");
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/cimg/";
        cdusd usd = usdService.selectByid(Integer.parseInt(fid));
        if(usd.getUsd005()!=null&&!usd.getUsd005().isEmpty()){
            File file = new File(filePath+usd.getUsd005());
            if(file.exists()) file.deleteOnExit();
        }
        usdService.delete(usd.getUsd001());
        result.put("msg","Y");
        return JSON.toJSONString(result);
    }


    /**
     * 前端加载一级分类
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/qt_onetype")
    public String qt_onetype(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        List<cdusg> usgList = usgService.selectall_qt();
        result.put("usgList",usgList);
        return JSON.toJSONString(result);
    }

    /**
     * 前端加载二级分类
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/qt_twotype")
    public String qt_twotype(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        int usgid = Integer.parseInt(request.getParameter("usgid"));
        List<cdusc> uscList = uscService.selectall_qt(usgid);
        result.put("uscList",uscList);
        return JSON.toJSONString(result);
    }

    /**
     * 前端加载三级分类
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/qt_threetype")
    public String qt_threetype(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        int uscid = Integer.parseInt(request.getParameter("uscid"));
        List<cdusa> usaList = usaService.selectall_qt(uscid);
        result.put("usaList",usaList);
        return JSON.toJSONString(result);
    }

    /**
     * 前端加载首页轮播
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @ResponseBody
    @RequestMapping("/qt_home")
    public String qt_home(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HashMap result = new HashMap();
        List<cdusb> usbList = usbService.selectall_qt();
        result.put("usbList",usbList);
        return JSON.toJSONString(result);
    }

    //后台内容附加加载
    @RequestMapping("/toHTfjcon")
    public ModelAndView htfjCon(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        int id=0;
        if(request.getParameter("id")!=null&&!request.getParameter("id").isEmpty()) id = Integer.parseInt(request.getParameter("id"));
        else id = Integer.parseInt(session.getAttribute("conid").toString());
        List<cdusf> usflist = usfService.selectForusdId(id);
        mav.addObject("usflist",usflist);
        session.setAttribute("conid",id);
        mav.setViewName("HTFJcon");
        return mav;
    }


    /**
     * ajax删除内容
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/delfjcon")
    public String delfjcon(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String fid = request.getParameter("fid");
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/cimg/";
        cdusf usf = usfService.selectByid(Integer.parseInt(fid));
        if(usf.getUsf005()!=null&&!usf.getUsf005().isEmpty()){
            File file = new File(filePath+usf.getUsf005());
            if(file.exists()) file.deleteOnExit();
        }
        usfService.delete(usf.getUsf001());
        result.put("msg","Y");
        return JSON.toJSONString(result);
    }

    /**
     * ajax保存内容
     * 2023-03-24
     * 王新苗
     * @param request
     */
    @ResponseBody
    @RequestMapping(value = "/savefjcon",headers = "content-type=multipart/form-data")
    public String savefjcon(HttpServletRequest request) throws Exception {
        HashMap result = new HashMap();
        HttpSession session = request.getSession();
        String date = sdf.format(new Date());
        String filePath = this.getClass().getResource("/").getPath();
        filePath = filePath.substring(1,filePath.length())+"static/upload/cimg/";
        int fid = 0;
        if(request.getParameter("fid")!=null&&!request.getParameter("fid").isEmpty()) {
            fid = Integer.parseInt(request.getParameter("fid"));
        }
        int conid = Integer.parseInt(request.getParameter("conid"));
        String lx = request.getParameter("lx");
        String fext = request.getParameter("fext");
        String wtxt = request.getParameter("wtxt");
        String fileString = request.getParameter("picfile");
        String wurl = request.getParameter("wurl");
        cdusf usf;
        File file;
        if(fid>0){
            //编辑
            usf = usfService.selectByid(fid);
            usf.setUsf003(lx);
            usf.setUsf007(wurl);
            usf.setUsf002(conid);
            if(lx.equals("B")){
                usf.setUsf004(wtxt);
                if(fileString.indexOf("upload/cimg/")<0){
                    if(usf.getUsf005()!=null&&!usf.getUsf005().isEmpty()){
                        file = new File(filePath+usf.getUsf005());
                        if(file.exists()) file.deleteOnExit();
                    }
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usf.setUsf005(date+"."+fext);
                }
            }else{
                usf.setUsf004(null);
                if(fileString.indexOf("upload/cimg/")<0){
                    if(usf.getUsf005()!=null&&!usf.getUsf005().isEmpty()){
                        file = new File(filePath+usf.getUsf005());
                        if(file.exists()) file.deleteOnExit();
                    }
                    uploadvidao_Base64(fileString,filePath+date+"."+fext);
                    usf.setUsf005(date+"."+fext);
                }
            }
            usfService.update(usf);
            result.put("msg","修改成功");
        }else{
            usf = new cdusf();
            usf.setUsf002(conid);
            usf.setUsf003(lx);
            usf.setUsf007(wurl);
            if(lx.equals("B")){
                usf.setUsf004(wtxt);
                if(fileString.indexOf("upload/cimg/")<0){
                    uploadpic_Base64(fileString,filePath+date+"."+fext,fext);
                    usf.setUsf005(date+"."+fext);
                }
            }else{
                usf.setUsf004(null);
                if(fileString.indexOf("upload/cimg/")<0){
                    uploadvidao_Base64(fileString,filePath+date+"."+fext);
                    usf.setUsf005(date+"."+fext);
                }
            }
            usf = usfService.insert(usf);
            result.put("msg","添加成功");
        }
        result.put("usf",usf);
        return JSON.toJSONString(result);
    }



}
