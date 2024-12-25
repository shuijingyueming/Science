package com.efx.Science.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.efx.Science.model.cduse;
import com.efx.Science.pub.PubMessage;
import com.efx.Science.until.EncrpytUtil;
import com.efx.Science.until.RSACoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class LoginController extends BaseController {

    private final HttpServletRequest request;
    private final HttpServletResponse response;
    private final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    char[] codeSequence = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
            'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public LoginController(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }

    /**
     * 访问网站后台，检测用户session是否存在，不存在跳转到登陆页面
     *
     * @return
     */
    @RequestMapping(value = "*")
    public ModelAndView toLoginnew() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        if (null == session.getAttribute("user")) {
            mav.addObject("error", request.getParameter("error"));
            session.setAttribute("dnumn", 0);
            mav.setViewName("HTlogin");
            return mav;
        }else{
            cduse use = useService.getByid(Decrypt(session.getAttribute("user").toString()));
            mav.setViewName("redirect:/toHt/toHTindex");
        }
        return mav;
    }


    /**
     * 访问网站后台，检测用户session是否存在，不存在跳转到登陆页面
     *
     * @return
     */
    @RequestMapping(value = "/toLogin")
    public ModelAndView toLogin() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        //直接去掉账号session
        if (null != session.getAttribute("user")) session.removeAttribute("user");
        mav.setViewName("HTlogin");
        return mav;
    }

    @RequestMapping("/code.do")
    public void getCode(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String uname = req.getParameter("uname");
        // 定义图像buffer
        BufferedImage buffImg = new BufferedImage(140, 50, BufferedImage.TYPE_INT_RGB);
        Graphics gd = buffImg.getGraphics();
        // 创建一个随机数生成器类
        Random random = new Random();
        // 将图像填充为白色
        gd.setColor(Color.WHITE);
        gd.fillRect(0, 0, 1450, 50);
        // 创建字体，字体的大小应该根据图片的高度来定。
        Font font = new Font("Fixedsys", Font.BOLD, 38);
        // 设置字体。
        gd.setFont(font);
        // 画边框。
        gd.setColor(Color.BLACK);
        gd.drawRect(0, 0, 140 - 1, 50 - 1);
        // 随机产生40条干扰线，使图象中的认证码不易被其它程序探测到。
        gd.setColor(Color.BLACK);
        for (int i = 0; i < 40; i++) {
            int x = random.nextInt(140);
            int y = random.nextInt(50);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            gd.drawLine(x, y, x + xl, y + yl);
        }
        // randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
        StringBuffer randomCode = new StringBuffer();
        int red = 0, green = 0, blue = 0;
        HttpSession session = req.getSession();
        // 随机产生codeCount数字的验证码。
        String[] sp = null;


        for (int i = 0; i < 4; i++) {
            // 得到随机产生的验证码数字。
            String code = "";
            if (sp != null) code = sp[i];
            else code = String.valueOf(codeSequence[random.nextInt(codeSequence.length - 1)]);
            // 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
           // red = random.nextInt(255);
          //  green = random.nextInt(255);
          //  blue = random.nextInt(255);
            red = 0;
            green = 0;
            blue = 0;
            // 用随机产生的颜色将验证码绘制到图像中。
            gd.setColor(new Color(red, green, blue));
            gd.drawString(code, i == 0 ? 15 : (i + 1) * 25, 40);
            // 将产生的四个随机数组合在一起。
            randomCode.append(code);
        }
        // 将四位数字的验证码保存到Session中。
        PubMessage.dlmap.put(uname + "bcode", randomCode.toString());
        // session.setAttribute("code", randomCode.toString());
        // 禁止图像缓存。
        resp.setHeader("Pragma", "no-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);
        resp.setContentType("image/jpeg");
        // 将图像输出到Servlet输出流中。
        ServletOutputStream sos = resp.getOutputStream();
        ImageIO.write(buffImg, "jpeg", sos);
        sos.close();
    }

    /**
     * 校验登陆
     */
    @ResponseBody
    @RequestMapping(value = "/checkLogin")
    public ModelAndView checkLogin() throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String name = request.getParameter("username");
        String pwd = request.getParameter("userpwd");
        String ycode = request.getParameter("ycode");
        name = EncrpytUtil.decode(name);
        pwd = EncrpytUtil.decode(pwd);
        pwd = EncrpytUtil.getSHA256(pwd);
        HashMap map = new HashMap();
        boolean isok = true;
        request.getHeader("");
        System.out.println(PubMessage.dlmap.get(name + "bcode"));
        System.out.println(ycode);
        if(!PubMessage.dlmap.get(name + "bcode").equals(ycode)) {
            map.put("res", "N");
            map.put("msg", "验证码错误");
        }else{
            cduse use = useService.getLogin(name,pwd);
            if(use!=null){
               // session.invalidate();//session失效
                // 会话重建
                PubMessage.dlmap.remove(name);
                PubMessage.dlmap.remove(name + "dnumn");
                PubMessage.dlmap.remove(name + "bcode");
                String inputStr = use.getUse001() + "";
                byte[] encodedData = RSACoder.encryptByPublicKey(inputStr, EncrpytUtil.publicKey);
                session.setAttribute("user", RSACoder.encryptBASE64(encodedData));
                map.put("res", "Y");
            }else{
                map.put("res", "N");
                map.put("msg", "用户名或密码错误");
            }
        }
        response.getWriter().print(new JSONObject(map));
        return null;
    }

    /**
     * 退出
     */
    @ResponseBody
    @RequestMapping(value = "/toHTtuichu")
    public ModelAndView toHTtuichu() throws Exception {
        ModelAndView mav = new ModelAndView();
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        // 会话失效
        session.invalidate();
        // 会话重建
        session = request.getSession(true);
        mav.addObject("error", "退出成功");
        mav.setViewName("redirect:/toHt/toLogin");
        return mav;
    }

    //修改密码加载
    @RequestMapping("/HTeditpwd")
    public ModelAndView hteditpwd(HttpServletRequest request, HttpServletResponse response) throws Exception{
        HttpSession session = request.getSession();
        if(session.getAttribute("user")==null){
            SystemTZYM(response,"登录失效");
            return null;
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("HTeditpwd");
        return mav;
    }

    /**
     * 修改密码
     */
    @RequestMapping(value = "/updatePwd")
    public ModelAndView updatePwd() throws Exception {
        ModelAndView mav = new ModelAndView();
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            SystemTZYM(response, "登录失效");
            return null;
        }
        Integer userid = Decrypt(session.getAttribute("user").toString());
        cduse useNow =useService.getByid(userid);
        String jiumm = request.getParameter("oldpwd").trim();
        String xinmm = request.getParameter("newpwd").trim();
        if(EncrpytUtil.getSHA256(jiumm).equals(useNow.getUse003())){
            try{
                useNow.setUse003(EncrpytUtil.getSHA256(xinmm));
                useService.update(useNow);
                mav.addObject("msg", "0");
            }catch(Exception e){
                mav.addObject("msg", "1");
            }
        }else{
            mav.addObject("msg", "4");
        }
        mav.setViewName("HTeditpwd");
        return mav;
    }

    /**
     * 图片
     * 20223-04-28
     * 王新苗
     */
    @ResponseBody
    @RequestMapping(value = "/uploadAvatar",headers = "content-type=multipart/form-data")
    public String wx_addpic(HttpServletRequest request) throws Exception {
        Map<String, Object> result = new HashMap<String, Object>();
        // 图片
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        // 获得文件
        MultipartFile file = multipartRequest.getFile("file");
//        System.out.println(request.getParameter("openId"));
        String dz=request.getParameter("dz");
        String openId=request.getParameter("openId");
        String img=request.getParameter("img");
        String filename=(openId.isEmpty()?sdf1.format(new Date()):openId)+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        uploadpic(dz+filename, file,img);
        result.put("img", filename);
        result.put("msg", "Y");
        return JSON.toJSONString(result);
    }

}