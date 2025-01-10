package com.efx.Science.model;

public class cdyheWithBLOBs extends cdyhe {

    private cdsmd smd;
    private cdyhb yhb;
    private cdhba hba;
    private cdyhc yhc;

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

    public cdhba getHba() {
        return hba;
    }

    public void setHba(cdhba hba) {
        this.hba = hba;
    }

    public cdyhc getYhc() {
        return yhc;
    }

    public void setYhc(cdyhc yhc) {
        this.yhc = yhc;
    }
    private String yhe029;

    private String yhe030;

    private String yhe031;

    private String yhe039;

    public String getYhe029() {
        return yhe029;
    }

    public void setYhe029(String yhe029) {
        this.yhe029 = yhe029 == null ? null : yhe029.trim();
    }

    public String getYhe030() {
        return yhe030;
    }

    public void setYhe030(String yhe030) {
        this.yhe030 = yhe030 == null ? null : yhe030.trim();
    }

    public String getYhe031() {
        return yhe031;
    }

    public void setYhe031(String yhe031) {
        this.yhe031 = yhe031 == null ? null : yhe031.trim();
    }

    public String getYhe039() {
        return yhe039;
    }

    public void setYhe039(String yhe039) {
        this.yhe039 = yhe039 == null ? null : yhe039.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", yhe029=").append(yhe029);
        sb.append(", yhe030=").append(yhe030);
        sb.append(", yhe031=").append(yhe031);
        sb.append(", yhe039=").append(yhe039);
        sb.append("]");
        return sb.toString();
    }
}