package com.efx.Science.model;

import java.util.Date;

public class cdyhf {

    private cduse use;

    public cduse getUse() {
        return use;
    }

    public void setUse(cduse use) {
        this.use = use;
    }

    private String yhf001;

    private Integer yhf002;

    private String yhf003;

    private String yhf004;

    private String yhf005;

    private String yhf006;

    private Integer yhf007;

    private Date yhf008;

    public String getYhf001() {
        return yhf001;
    }

    public void setYhf001(String yhf001) {
        this.yhf001 = yhf001 == null ? null : yhf001.trim();
    }

    public Integer getYhf002() {
        return yhf002;
    }

    public void setYhf002(Integer yhf002) {
        this.yhf002 = yhf002;
    }

    public String getYhf003() {
        return yhf003;
    }

    public void setYhf003(String yhf003) {
        this.yhf003 = yhf003 == null ? null : yhf003.trim();
    }

    public String getYhf004() {
        return yhf004;
    }

    public void setYhf004(String yhf004) {
        this.yhf004 = yhf004 == null ? null : yhf004.trim();
    }

    public String getYhf005() {
        return yhf005;
    }

    public void setYhf005(String yhf005) {
        this.yhf005 = yhf005 == null ? null : yhf005.trim();
    }

    public String getYhf006() {
        return yhf006;
    }

    public void setYhf006(String yhf006) {
        this.yhf006 = yhf006 == null ? null : yhf006.trim();
    }

    public Integer getYhf007() {
        return yhf007;
    }

    public void setYhf007(Integer yhf007) {
        this.yhf007 = yhf007;
    }

    public Date getYhf008() {
        return yhf008;
    }

    public void setYhf008(Date yhf008) {
        this.yhf008 = yhf008;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yhf001=").append(yhf001);
        sb.append(", yhf002=").append(yhf002);
        sb.append(", yhf003=").append(yhf003);
        sb.append(", yhf004=").append(yhf004);
        sb.append(", yhf005=").append(yhf005);
        sb.append(", yhf006=").append(yhf006);
        sb.append(", yhf007=").append(yhf007);
        sb.append(", yhf008=").append(yhf008);
        sb.append("]");
        return sb.toString();
    }
}