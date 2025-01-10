package com.efx.Science.model;

import java.util.Date;

public class cduse {

    private cdsmd smd;
    private cdyhb yhb;

    public cdsmd getSmd() {
        return smd;
    }

    public void setSmd(cdsmd smd) {
        this.smd = smd;
    }

    public cdyhb getYhb() {
        return yhb;
    }

    public void setYhb(cdyhb yhb) {
        this.yhb = yhb;
    }

    private Integer use001;

    private String use002;

    private String use003;

    private String use004;

    private String use005;

    private String use006;

    private String use007;

    private String use008;

    private String use009;

    private Date use010;

    private Integer use011;

    private Float use012;

    private String use013;

    private String use014;

    private String use015;

    public Integer getUse001() {
        return use001;
    }

    public void setUse001(Integer use001) {
        this.use001 = use001;
    }

    public String getUse002() {
        return use002;
    }

    public void setUse002(String use002) {
        this.use002 = use002 == null ? null : use002.trim();
    }

    public String getUse003() {
        return use003;
    }

    public void setUse003(String use003) {
        this.use003 = use003 == null ? null : use003.trim();
    }

    public String getUse004() {
        return use004;
    }

    public void setUse004(String use004) {
        this.use004 = use004 == null ? null : use004.trim();
    }

    public String getUse005() {
        return use005;
    }

    public void setUse005(String use005) {
        this.use005 = use005 == null ? null : use005.trim();
    }

    public String getUse006() {
        return use006;
    }

    public void setUse006(String use006) {
        this.use006 = use006 == null ? null : use006.trim();
    }

    public String getUse007() {
        return use007;
    }

    public void setUse007(String use007) {
        this.use007 = use007 == null ? null : use007.trim();
    }

    public String getUse008() {
        return use008;
    }

    public void setUse008(String use008) {
        this.use008 = use008 == null ? null : use008.trim();
    }

    public String getUse009() {
        return use009;
    }

    public void setUse009(String use009) {
        this.use009 = use009 == null ? null : use009.trim();
    }

    public Date getUse010() {
        return use010;
    }

    public void setUse010(Date use010) {
        this.use010 = use010;
    }

    public Integer getUse011() {
        return use011;
    }

    public void setUse011(Integer use011) {
        this.use011 = use011;
    }

    public Float getUse012() {
        return use012;
    }

    public void setUse012(Float use012) {
        this.use012 = use012;
    }

    public String getUse013() {
        return use013;
    }

    public void setUse013(String use013) {
        this.use013 = use013 == null ? null : use013.trim();
    }

    public String getUse014() {
        return use014;
    }

    public void setUse014(String use014) {
        this.use014 = use014 == null ? null : use014.trim();
    }

    public String getUse015() {
        return use015;
    }

    public void setUse015(String use015) {
        this.use015 = use015 == null ? null : use015.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", use001=").append(use001);
        sb.append(", use002=").append(use002);
        sb.append(", use003=").append(use003);
        sb.append(", use004=").append(use004);
        sb.append(", use005=").append(use005);
        sb.append(", use006=").append(use006);
        sb.append(", use007=").append(use007);
        sb.append(", use008=").append(use008);
        sb.append(", use009=").append(use009);
        sb.append(", use010=").append(use010);
        sb.append(", use011=").append(use011);
        sb.append(", use012=").append(use012);
        sb.append(", use013=").append(use013);
        sb.append(", use014=").append(use014);
        sb.append(", use015=").append(use015);
        sb.append("]");
        return sb.toString();
    }
}