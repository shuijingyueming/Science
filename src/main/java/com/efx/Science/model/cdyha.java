package com.efx.Science.model;

public class cdyha {
    private Integer yha001;

    private String yha002;

    private Integer yha003;

    private Integer yha004;

    private Float yha005;

    private Integer yha006;

    private Float yha007;

    private String yha008;

    private String yha009;

    public Integer getYha001() {
        return yha001;
    }

    public void setYha001(Integer yha001) {
        this.yha001 = yha001;
    }

    public String getYha002() {
        return yha002;
    }

    public void setYha002(String yha002) {
        this.yha002 = yha002 == null ? null : yha002.trim();
    }

    public Integer getYha003() {
        return yha003;
    }

    public void setYha003(Integer yha003) {
        this.yha003 = yha003;
    }

    public Integer getYha004() {
        return yha004;
    }

    public void setYha004(Integer yha004) {
        this.yha004 = yha004;
    }

    public Float getYha005() {
        return yha005;
    }

    public void setYha005(Float yha005) {
        this.yha005 = yha005;
    }

    public Integer getYha006() {
        return yha006;
    }

    public void setYha006(Integer yha006) {
        this.yha006 = yha006;
    }

    public Float getYha007() {
        return yha007;
    }

    public void setYha007(Float yha007) {
        this.yha007 = yha007;
    }

    public String getYha008() {
        return yha008;
    }

    public void setYha008(String yha008) {
        this.yha008 = yha008 == null ? null : yha008.trim();
    }

    public String getYha009() {
        return yha009;
    }

    public void setYha009(String yha009) {
        this.yha009 = yha009 == null ? null : yha009.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yha001=").append(yha001);
        sb.append(", yha002=").append(yha002);
        sb.append(", yha003=").append(yha003);
        sb.append(", yha004=").append(yha004);
        sb.append(", yha005=").append(yha005);
        sb.append(", yha006=").append(yha006);
        sb.append(", yha007=").append(yha007);
        sb.append(", yha008=").append(yha008);
        sb.append(", yha009=").append(yha009);
        sb.append("]");
        return sb.toString();
    }
}