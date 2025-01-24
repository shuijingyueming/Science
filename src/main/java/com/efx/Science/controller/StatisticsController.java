package com.efx.Science.controller;


import com.efx.Science.model.*;
import com.efx.Science.until.ExcelExport;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.TemplateEngine;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;


@Controller
@RequestMapping("/toSt")
public class StatisticsController extends BaseController {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private TemplateEngine templateEngine;

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjsk")
    public ModelAndView  totjsk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb.setOthersql2("A");
        pb=smdService.selectPageBean(pb);
        List<cdsmd> list =pb.getResultList();
        for (cdsmd smd:list) {
            smd.setFwcc(yheService.countByfwcc(smd.getSmd001(),null, pb.getOthersql5(), pb.getOthersql6()));
            smd.setFwrc(yheService.countByfwrc(smd.getSmd001(), null, pb.getOthersql5(),pb.getOthersql6()));
            smd.setJtbt(yheService.countByjtbt(smd.getSmd001(), null, pb.getOthersql5(),pb.getOthersql6()));
            smd.setKcje(yheService.countBykcje(smd.getSmd001(),pb.getOthersql5(),pb.getOthersql6()));
        }
        if(pb.getCurrentPage()==1){
            cdsmd smd = new cdsmd();
            smd.setSmd003("个人专家");
            smd.setFwcc(yheService.countByfwcc1(pb.getOthersql5(), pb.getOthersql6()));
            smd.setFwrc(yheService.countByfwrc1(pb.getOthersql5(),pb.getOthersql6()));
            smd.setJtbt(yheService.countByjtbt1(pb.getOthersql5(),pb.getOthersql6()));
            smd.setKcje(yheService.countBykcje1(pb.getOthersql5(),pb.getOthersql6()));
            mav.addObject("gr", smd);
        }

        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjsk");
        return mav;
    }

    /**
     * 统计
     * @return 用户页面
     */
    @RequestMapping("/toxq")
    public ModelAndView toxq(HttpServletRequest request,HttpServletResponse response) throws Exception{
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
        if (request.getParameter("pages1") != null && !request.getParameter("pages1").isEmpty())
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages1")));
        else
            pb.setCurrentPage(1);
        if(request.getParameter("zt") != null && !request.getParameter("zt").isEmpty()){
            pb.setOthersql3(request.getParameter("zt"));
        }else{
            if(request.getParameter("skid") != null && !request.getParameter("skid").isEmpty()) {
                pb.setOthersql5(request.getParameter("skid"));
            }
            if(request.getParameter("xkid") != null && !request.getParameter("xkid").isEmpty()) {
                pb.setOthersql6(request.getParameter("xkid"));
            }
        }
        if(request.getParameter("start") != null && !request.getParameter("start").isEmpty()) {
            pb.setOthersql1(request.getParameter("start"));
        }
        if(request.getParameter("end") != null && !request.getParameter("end").isEmpty()) {
            pb.setOthersql2(request.getParameter("end"));
        }
        if(request.getParameter("fhlx") != null && !request.getParameter("fhlx").isEmpty()) {
            pb.setOthersql(request.getParameter("fhlx"));
        }
        System.out.println("type:"+request.getParameter("type"));
        if(request.getParameter("type")!=null && request.getParameter("type").equals("DC")){
            pb.setOthersql4("DC");
            pb=yheService.selectPageBean1(pb);
            if(request.getParameter("skid") != null && !request.getParameter("skid").isEmpty()) {
                cdsmd smd= smdService.getByid(Integer.valueOf(request.getParameter("skid")));
                new ExcelExport().ExcelexportyYYMX(request, response,pb,smd.getSmd003());
            }else{
                cdyhb yhb = yhbService.getByid(Integer.valueOf(request.getParameter("xkid")));
                new ExcelExport().ExcelexportyYYMX(request, response,pb,yhb.getYhb004());
            }
            return null;
        }
        mav.addObject("pageobj", yheService.selectPageBean1(pb));
        mav.addObject("name", request.getParameter("name"));
        mav.addObject("pages", request.getParameter("pages"));
        mav.setViewName("HTtjxq");
        return mav;
    }

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjjtbt")
    public ModelAndView  totjjtbt(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb=yhbService.selectPageBean(pb);
        List<cdyhb> list =pb.getResultList();
        for (cdyhb item:list) {
            item.setJtbt(yheService.countByjtbt(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6()));
        }
        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjjtbt");
        return mav;
    }

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjxk")
    public ModelAndView  totjxk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb=yhbService.selectPageBean(pb);
        List<cdyhb> list =pb.getResultList();
        for (cdyhb item:list) {
            item.setFwcc(yheService.countByfwcc(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6()));
            item.setFwrc(yheService.countByfwrc(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6()));
            item.setFwrcx(yheService.countByfwrcx(item.getYhb001(),pb.getOthersql5(),pb.getOthersql6()));
        }
        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjxk");
        return mav;
    }

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjxk1")
    public ModelAndView  totjxk1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb=yhaService.selectPageBean(pb);
        List<cdyha> list =pb.getResultList();
        for (cdyha item:list) {
            item.setFwcc(yheService.countByfwcc2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6()));
            item.setFwrc(yheService.countByfwrc2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6()));
            item.setFwrcx(yheService.countByfwrcx2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6()));
        }
        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjxk1");
        return mav;
    }

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjpjsk")
    public ModelAndView  totjpjsk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb=smdService.selectPageBean(pb);
        List<cdsmd> list =pb.getResultList();
        for (cdsmd smd:list) {
            smd.setFwcc(yheService.countByfwcc(smd.getSmd001(), null , pb.getOthersql5(), pb.getOthersql6()));
            smd.setFwpjA(yheService.countByfwrwpj(smd.getSmd001(), null, pb.getOthersql5(),pb.getOthersql6(),"A"));
            smd.setFwpjB(yheService.countByfwrwpj(smd.getSmd001(), null, pb.getOthersql5(),pb.getOthersql6(),"B"));
            smd.setFwpjC(yheService.countByfwrwpj(smd.getSmd001(), null, pb.getOthersql5(),pb.getOthersql6(),"C"));
            smd.setFwpjD(yheService.countByfwrwpj(smd.getSmd001(), null, pb.getOthersql5(),pb.getOthersql6(),"D"));
        }
        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjpjsk");
        return mav;
    }

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjpjxk")
    public ModelAndView  totjpjxk(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb=yhbService.selectPageBean(pb);
        List<cdyhb> list =pb.getResultList();
        for (cdyhb item:list) {
            item.setFwcc(yheService.countByfwcc(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6()));
            item.setFwpjA(yheService.countByfwrwpj(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6(),"A"));
            item.setFwpjB(yheService.countByfwrwpj(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6(),"B"));
            item.setFwpjC(yheService.countByfwrwpj(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6(),"C"));
            item.setFwpjD(yheService.countByfwrwpj(null,item.getYhb001(),pb.getOthersql5(),pb.getOthersql6(),"D"));
        }
        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjpjxk");
        return mav;
    }

    /**
     * 统计
     * 王新苗
     */
    @RequestMapping("/totjpjxk1")
    public ModelAndView  totjpjxk1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        PageBean pb = new PageBean();
        if (request.getParameter("pages") != null && StringUtils.isNotEmpty(request.getParameter("pages")))
            pb.setCurrentPage(Integer.valueOf(request.getParameter("pages")));
        else
            pb.setCurrentPage(1);
        if (request.getParameter("name") != null && StringUtils.isNotEmpty(request.getParameter("name")))
            pb.setOthersql(request.getParameter("name"));
        if (request.getParameter("start") != null && StringUtils.isNotEmpty(request.getParameter("start")))
            pb.setOthersql5(request.getParameter("start"));
        if (request.getParameter("end") != null && StringUtils.isNotEmpty(request.getParameter("end")))
            pb.setOthersql6(request.getParameter("end"));
        pb=yhaService.selectPageBean(pb);
        List<cdyha> list =pb.getResultList();
        for (cdyha item:list) {
            item.setFwcc(yheService.countByfwcc2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6()));
            item.setFwpjA(yheService.countByfwrwpj2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6(),"A"));
            item.setFwpjB(yheService.countByfwrwpj2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6(),"B"));
            item.setFwpjC(yheService.countByfwrwpj2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6(),"C"));
            item.setFwpjD(yheService.countByfwrwpj2(item.getYha001(),pb.getOthersql5(),pb.getOthersql6(),"D"));
        }
        mav.addObject("pageobj", pb);
        mav.setViewName("HTtjpjxk1");
        return mav;
    }

}
