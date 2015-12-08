package com.yasic.yuexing.Objects;

/**
 * Created by ESIR on 2015/12/8.
 */
public class MotorcadeType {
    /**
     * 车队分类名称
     */
    private String motorcadeTypeName;

    public MotorcadeType(String motorcadeTypeName){
        this.motorcadeTypeName = motorcadeTypeName;
    }

    public void setMotorcadeTypeName(String motorcadeTypeName) {
        this.motorcadeTypeName = motorcadeTypeName;
    }

    public String getMotorcadeTypeName() {
        return motorcadeTypeName;
    }
}
