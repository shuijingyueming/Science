package com.efx.Science.model;

import java.io.Serializable;

/**
 * @Author Sunweifeng
 * @Date 2023/3/16 11:16
 */
public class user implements Serializable {

    private static final long serialVersionUID=1L;

    private String uname;//用户名称

    private String js;//角色名称

    private String jstype;//角色类型

    private String jsqx;//角色权限

    private String jname;//机构名称

    private String jtype;//机构类型

    private Integer jdid;

    private Integer jgid;

    private Integer ds=16;//东胜街道

    private String rj="41#54#";//戎家社区

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getJs() {
        return js;
    }

    public void setJs(String js) {
        this.js = js;
    }

    public String getJstype() {
        return jstype;
    }

    public void setJstype(String jstype) {
        this.jstype = jstype;
    }

    public String getJsqx() {
        return jsqx;
    }

    public void setJsqx(String jsqx) {
        this.jsqx = jsqx;
    }

    public String getJtype() {
        return jtype;
    }

    public void setJtype(String jtype) {
        this.jtype = jtype;
    }

    public Integer getJdid() {
        return jdid;
    }

    public void setJdid(Integer jdid) {
        this.jdid = jdid;
    }

    public Integer getDs() {
        return ds;
    }

    public void setDs(Integer ds) {
        this.ds = ds;
    }

    public Integer getJgid() {
        return jgid;
    }

    public void setJgid(Integer jgid) {
        this.jgid = jgid;
    }

    public String getRj() {
        return rj;
    }

    public void setRj(String rj) {
        this.rj = rj;
    }
}
