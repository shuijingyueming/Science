package com.efx.Science.model;

public class cdhbb {
    private Integer hbb001;

    private String hbb002;

    private Integer hbb003;

    private String hbb004;

    private String hbb005;

    public Integer getHbb001() {
        return hbb001;
    }

    public void setHbb001(Integer hbb001) {
        this.hbb001 = hbb001;
    }

    public String getHbb002() {
        return hbb002;
    }

    public void setHbb002(String hbb002) {
        this.hbb002 = hbb002 == null ? null : hbb002.trim();
    }

    public Integer getHbb003() {
        return hbb003;
    }

    public void setHbb003(Integer hbb003) {
        this.hbb003 = hbb003;
    }

    public String getHbb004() {
        return hbb004;
    }

    public void setHbb004(String hbb004) {
        this.hbb004 = hbb004 == null ? null : hbb004.trim();
    }

    public String getHbb005() {
        return hbb005;
    }

    public void setHbb005(String hbb005) {
        this.hbb005 = hbb005 == null ? null : hbb005.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hbb001=").append(hbb001);
        sb.append(", hbb002=").append(hbb002);
        sb.append(", hbb003=").append(hbb003);
        sb.append(", hbb004=").append(hbb004);
        sb.append(", hbb005=").append(hbb005);
        sb.append("]");
        return sb.toString();
    }
}