package com.yasic.yuexing.Objects;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MotorcadeType {
    /**
     * 车队分类名称
     */
    private String motorcadeTypeName;

    /**
     * 分类图片
     */
    private int motorcadeTypeLogo;

    public MotorcadeType(String motorcadeTypeName){
        this.motorcadeTypeName = motorcadeTypeName;
    }

    public MotorcadeType(String motorcadeTypeName, int motorcadeTypeLogo){
        this.motorcadeTypeName = motorcadeTypeName;
        this.motorcadeTypeLogo = motorcadeTypeLogo;
    }

    public void setMotorcadeTypeLogo(int motorcadeTypeLogo) {
        this.motorcadeTypeLogo = motorcadeTypeLogo;
    }

    public void setMotorcadeTypeName(String motorcadeTypeName) {
        this.motorcadeTypeName = motorcadeTypeName;
    }

    public String getMotorcadeTypeName() {
        return motorcadeTypeName;
    }

    public int getMotorcadeTypeLogo() {
        return motorcadeTypeLogo;
    }
}
