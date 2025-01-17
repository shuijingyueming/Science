package com.efx.Science.model;

import java.util.Date;

public class cdyhg {

    private cduse use;

    public cduse getUse() {
        return use;
    }

    public void setUse(cduse use) {
        this.use = use;
    }

    private String yhg001;

    private String yhg002;

    private Date yhg003;

    private String yhg004;

    private Integer yhg005;

    private Integer yhg007;

    private Integer yhg008;

    private String yhg009;

    private String yhg010;

    private String yhg006;

    public String getYhg001() {
        return yhg001;
    }

    public void setYhg001(String yhg001) {
        this.yhg001 = yhg001 == null ? null : yhg001.trim();
    }

    public String getYhg002() {
        return yhg002;
    }

    public void setYhg002(String yhg002) {
        this.yhg002 = yhg002 == null ? null : yhg002.trim();
    }

    public Date getYhg003() {
        return yhg003;
    }

    public void setYhg003(Date yhg003) {
        this.yhg003 = yhg003;
    }

    public String getYhg004() {
        return yhg004;
    }

    public void setYhg004(String yhg004) {
        this.yhg004 = yhg004 == null ? null : yhg004.trim();
    }

    public Integer getYhg005() {
        return yhg005;
    }

    public void setYhg005(Integer yhg005) {
        this.yhg005 = yhg005;
    }

    public Integer getYhg007() {
        return yhg007;
    }

    public void setYhg007(Integer yhg007) {
        this.yhg007 = yhg007;
    }

    public Integer getYhg008() {
        return yhg008;
    }

    public void setYhg008(Integer yhg008) {
        this.yhg008 = yhg008;
    }

    public String getYhg009() {
        return yhg009;
    }

    public void setYhg009(String yhg009) {
        this.yhg009 = yhg009 == null ? null : yhg009.trim();
    }

    public String getYhg010() {
        return yhg010;
    }

    public void setYhg010(String yhg010) {
        this.yhg010 = yhg010 == null ? null : yhg010.trim();
    }

    public String getYhg006() {
        return yhg006;
    }

    public void setYhg006(String yhg006) {
        this.yhg006 = yhg006 == null ? null : yhg006.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yhg001=").append(yhg001);
        sb.append(", yhg002=").append(yhg002);
        sb.append(", yhg003=").append(yhg003);
        sb.append(", yhg004=").append(yhg004);
        sb.append(", yhg005=").append(yhg005);
        sb.append(", yhg007=").append(yhg007);
        sb.append(", yhg008=").append(yhg008);
        sb.append(", yhg009=").append(yhg009);
        sb.append(", yhg010=").append(yhg010);
        sb.append("]");
        return sb.toString();
    }
}