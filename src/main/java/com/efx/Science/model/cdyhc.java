package com.efx.Science.model;

import java.util.Date;

public class cdyhc {
    private Integer yhc001;

    private Integer yhc002;

    private String yhc003;

    private Integer yhc005;

    private Date yhc006;

    private String yhc007;

    private String yhc008;

    private String yhc004;

    public Integer getYhc001() {
        return yhc001;
    }

    public void setYhc001(Integer yhc001) {
        this.yhc001 = yhc001;
    }

    public Integer getYhc002() {
        return yhc002;
    }

    public void setYhc002(Integer yhc002) {
        this.yhc002 = yhc002;
    }

    public String getYhc003() {
        return yhc003;
    }

    public void setYhc003(String yhc003) {
        this.yhc003 = yhc003 == null ? null : yhc003.trim();
    }

    public Integer getYhc005() {
        return yhc005;
    }

    public void setYhc005(Integer yhc005) {
        this.yhc005 = yhc005;
    }

    public Date getYhc006() {
        return yhc006;
    }

    public void setYhc006(Date yhc006) {
        this.yhc006 = yhc006;
    }

    public String getYhc007() {
        return yhc007;
    }

    public void setYhc007(String yhc007) {
        this.yhc007 = yhc007 == null ? null : yhc007.trim();
    }

    public String getYhc008() {
        return yhc008;
    }

    public void setYhc008(String yhc008) {
        this.yhc008 = yhc008 == null ? null : yhc008.trim();
    }

    public String getYhc004() {
        return yhc004;
    }

    public void setYhc004(String yhc004) {
        this.yhc004 = yhc004 == null ? null : yhc004.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yhc001=").append(yhc001);
        sb.append(", yhc002=").append(yhc002);
        sb.append(", yhc003=").append(yhc003);
        sb.append(", yhc005=").append(yhc005);
        sb.append(", yhc006=").append(yhc006);
        sb.append(", yhc007=").append(yhc007);
        sb.append(", yhc008=").append(yhc008);
        sb.append(", yhc004=").append(yhc004);
        sb.append("]");
        return sb.toString();
    }
}