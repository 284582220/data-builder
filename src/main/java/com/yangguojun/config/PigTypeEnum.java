package com.yangguojun.config;

public enum PigTypeEnum {

    TYPE_1(1, "丹系二元杂"),
    TYPE_2(2, "丹系长白"),
    TYPE_3(3, "二元杂"),
    TYPE_4(4, "其他杜洛克"),
    TYPE_5(5, "加系大白"),
    TYPE_6(6, "丹系大白"),
    TYPE_7(7, "丹系杜洛克"),
    TYPE_8(8, "大长杂"),
    TYPE_9(9, "美丹大白"),
    TYPE_10(10, "美丹杜洛克"),
    TYPE_11(11, "美系二元杂"),
    TYPE_12(12, "美系杜洛克"),
    TYPE_13(13, "自繁大白"),
    TYPE_14(14, "华系长白"),
    TYPE_15(15, "加系长白"),
    TYPE_16(16, "美系长白"),
    TYPE_17(17, "非纯丹系大白"),
    TYPE_18(18, "非纯丹系杜洛克"),
    TYPE_19(19, "非纯丹系长白"),;

    private int pigType;
    private String pigTypeStr;

    PigTypeEnum(int pigType, String pigTypeStr) {
        this.pigType = pigType;
        this.pigTypeStr = pigTypeStr;
    }

    public int getPigType() {
        return pigType;
    }

    public void setPigType(int pigType) {
        this.pigType = pigType;
    }

    public String getPigTypeStr() {
        return pigTypeStr;
    }

    public void setPigTypeStr(String pigTypeStr) {
        this.pigTypeStr = pigTypeStr;
    }

}
