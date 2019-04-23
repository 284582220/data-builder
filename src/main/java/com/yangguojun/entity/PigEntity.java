package com.yangguojun.entity;

public class PigEntity {

    /**
     * 猪只编码
     */
    private long fnumbe;

    /**
     * 猪只耳号
     */
    private long earno;

    /**
     * 猪只品种
     */
    private long breeding;

    /**
     * 猪只品种名称
     */
    private String breeding_name;

    /**
     * 猪只胎次
     */
    private long parity;

    /**
     * 猪只猪场ID
     */
    private long farm_id;

    /**
     * 猪只公司ID
     */
    private long master_org_id;

    /**
     * 栏位ID
     */
    private long lanid;

    public String getLanname() {
        return lanname;
    }

    public void setLanname(String lanname) {
        this.lanname = lanname;
    }

    /**
     * 栏位名称
     */
    private String lanname;

    /**
     * 舍ID
     */
    private long sheid;

    /**
     * 舍名称
     */
    private String shename;

    /**
     * 楼ID
     */
    private long louid;

    /**
     * 楼名称
     */
    private String louname;

    /**
     * 猪只状态
     */
    private String estatus;

    /**
     * 猪只当前带仔数
     */
    private int pignum;

    public PigEntity(long fnumbe, long earno, long breeding, String breeding_name, long parity, long farm_id, long master_org_id, long lanid, String lanname, long sheid, String shename, long louid, String louname, String estatus, int pignum) {
        this.fnumbe = fnumbe;
        this.earno = earno;
        this.breeding = breeding;
        this.breeding_name = breeding_name;
        this.parity = parity;
        this.farm_id = farm_id;
        this.master_org_id = master_org_id;
        this.lanid = lanid;
        this.lanname = lanname;
        this.sheid = sheid;
        this.shename = shename;
        this.louid = louid;
        this.louname = louname;
        this.estatus = estatus;
        this.pignum = pignum;
    }


    public long getFnumbe() {
        return fnumbe;
    }

    public void setFnumbe(long fnumbe) {
        this.fnumbe = fnumbe;
    }

    public long getEarno() {
        return earno;
    }

    public void setEarno(long earno) {
        this.earno = earno;
    }

    public long getBreeding() {
        return breeding;
    }

    public void setBreeding(long breeding) {
        this.breeding = breeding;
    }

    public String getBreeding_name() {
        return breeding_name;
    }

    public void setBreeding_name(String breeding_name) {
        this.breeding_name = breeding_name;
    }

    public long getParity() {
        return parity;
    }

    public void setParity(long parity) {
        this.parity = parity;
    }

    public long getFarm_id() {
        return farm_id;
    }

    public void setFarm_id(long farm_id) {
        this.farm_id = farm_id;
    }

    public long getMaster_org_id() {
        return master_org_id;
    }

    public void setMaster_org_id(long master_org_id) {
        this.master_org_id = master_org_id;
    }

    public long getLanid() {
        return lanid;
    }

    public void setLanid(long lanid) {
        this.lanid = lanid;
    }


    public long getSheid() {
        return sheid;
    }

    public void setSheid(long sheid) {
        this.sheid = sheid;
    }

    public String getShename() {
        return shename;
    }

    public void setShename(String shename) {
        this.shename = shename;
    }

    public long getLouid() {
        return louid;
    }

    public void setLouid(long louid) {
        this.louid = louid;
    }

    public String getLouname() {
        return louname;
    }

    public void setLouname(String louname) {
        this.louname = louname;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getPignum() {
        return pignum;
    }

    public void setPignum(int pignum) {
        this.pignum = pignum;
    }


    @Override
    public String toString() {
        return "PigEntity{" +
                "fnumbe=" + fnumbe +
                ", earno=" + earno +
                ", breeding=" + breeding +
                ", breeding_name='" + breeding_name + '\'' +
                ", parity=" + parity +
                ", farm_id=" + farm_id +
                ", master_org_id=" + master_org_id +
                ", lanid=" + lanid +
                ", lanname='" + lanname + '\'' +
                ", sheid=" + sheid +
                ", shename='" + shename + '\'' +
                ", louid=" + louid +
                ", louname='" + louname + '\'' +
                ", estatus='" + estatus + '\'' +
                ", pignum=" + pignum +
                '}';
    }
}
