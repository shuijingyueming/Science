package com.efx.Science.pub;


import com.efx.Science.model.cdxxz;
import com.efx.Science.service.CdxxzService;
import com.efx.Science.service.CdyheService;
import com.efx.Science.wx.HttpGetUtil;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    private final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private CdxxzService xxzService;
    @Autowired
    private CdyheService yheService;

    protected final static SimpleDateFormat DATE1 = new SimpleDateFormat("yyyy-MM");

    @Autowired
    properConfig config;

    //tomcat启动执行此方法
    @Override
    public void run(ApplicationArguments args) throws Exception {
        cdxxz xxz = xxzService.selGetAll();
        //线程获取微信的token
       /* new Thread(){
            public void run(){
                while (true){
                    try {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("secret", PubMessage.secret);
                        params.put("appid", PubMessage.appid);
                        params.put("grant_type", "client_credential");
                        String requestUrl = HttpGetUtil.httpRequestToString("https://api.weixin.qq.com/cgi-bin/token", params);
                        JSONObject result= JSONObject.fromObject(requestUrl);
                        PubMessage.access_token = result.getString("access_token");
                        System.out.println(new Date()+"----微信token获取："+PubMessage.access_token);
                        Thread.sleep(7100000);//7200秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();*/

        new Thread(){
            public void run(){
                this.setName("beifen");
                while (true) {
                    try {
//                        System.out.println("--数据库备份--");
                        long current = System.currentTimeMillis();// 当前时间毫秒数
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(Calendar.DAY_OF_MONTH, 1);
                        calendar.set(Calendar.HOUR_OF_DAY, 2);
                        calendar.set(Calendar.MINUTE, 0);
                        calendar.set(Calendar.SECOND, 0);
                        calendar.set(Calendar.MILLISECOND, 0);
                        long tomorrowzero = calendar.getTimeInMillis();
                        long tomorrowzeroSeconds = (tomorrowzero- current);
                        //按天算+早上2：00,睡眠毫秒数
                        Thread.sleep(((xxz.getXxz010()-1)*86400000)+tomorrowzeroSeconds);
                        if (Datamsg.exportDatabaseTool(config.getJdbcurl(), config.getJdbcdk(),
                                config.getUsername(),config.getPassword(),
                                "c:\\backup\\","kxxk("+sdf1.format(new Date())+").sql",config.getDataname(),
                                this.getClass().getResource("/").getPath()+"\\")) {
                            System.out.println("数据库成功备份！！！");
                        } else {
                            System.out.println("数据库备份失败！！！");
                        }
                    } catch (Exception e) { }
                }
            }
        }.start();

        new Thread(){
            public void run(){
                this.setName("kcjieshu");
                while (true) {
                    try {
//                        System.out.println("--数据库备份--");
                        long current = System.currentTimeMillis();// 当前时间毫秒数
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(Calendar.DAY_OF_MONTH, 1);
                        calendar.set(Calendar.HOUR_OF_DAY, 0);
                        calendar.set(Calendar.MINUTE, 0);
                        calendar.set(Calendar.SECOND, 1);
                        calendar.set(Calendar.MILLISECOND, 0);
                        long tomorrowzero = calendar.getTimeInMillis();
                        long tomorrowzeroSeconds = (tomorrowzero- current);
                        yheService.updatebytime();
                        yheService.updatebytime1();
                        //按天算+早上0：00,睡眠毫秒数
                        Thread.sleep(tomorrowzeroSeconds);
                    } catch (Exception e) { }
                }
            }
        }.start();
    }


}
