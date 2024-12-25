package com.efx.Science.model;

import java.util.Date;

public class cdyhd {
    private String yhd001;

    private Integer yhd002;

    private Date yhd003;

    private String yhd004;

    private String yhd005;

    private String yhd006;

    private Integer yhd007;

    private String yhd008;

    private String yhd009;

    public String getYhd001() {
        return yhd001;
    }

    public void setYhd001(String yhd001) {
        this.yhd001 = yhd001 == null ? null : yhd001.trim();
    }

    public Integer getYhd002() {
        return yhd002;
    }

    public void setYhd002(Integer yhd002) {
        this.yhd002 = yhd002;
    }

    public Date getYhd003() {
        return yhd003;
    }

    public void setYhd003(Date yhd003) {
        this.yhd003 = yhd003;
    }

    public String getYhd004() {
        return yhd004;
    }

    public void setYhd004(String yhd004) {
        this.yhd004 = yhd004 == null ? null : yhd004.trim();
    }

    public String getYhd005() {
        return yhd005;
    }

    public void setYhd005(String yhd005) {
        this.yhd005 = yhd005 == null ? null : yhd005.trim();
    }

    public String getYhd006() {
        return yhd006;
    }

    public void setYhd006(String yhd006) {
        this.yhd006 = yhd006 == null ? null : yhd006.trim();
    }

    public Integer getYhd007() {
        return yhd007;
    }

    public void setYhd007(Integer yhd007) {
        this.yhd007 = yhd007;
    }

    public String getYhd008() {
        return yhd008;
    }

    public void setYhd008(String yhd008) {
        this.yhd008 = yhd008 == null ? null : yhd008.trim();
    }

    public String getYhd009() {
        return yhd009;
    }

    public void setYhd009(String yhd009) {
        this.yhd009 = yhd009 == null ? null : yhd009.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yhd001=").append(yhd001);
        sb.append(", yhd002=").append(yhd002);
        sb.append(", yhd003=").append(yhd003);
        sb.append(", yhd004=").append(yhd004);
        sb.append(", yhd005=").append(yhd005);
        sb.append(", yhd006=").append(yhd006);
        sb.append(", yhd007=").append(yhd007);
        sb.append(", yhd008=").append(yhd008);
        sb.append(", yhd009=").append(yhd009);
        sb.append("]");
        return sb.toString();
    }
}