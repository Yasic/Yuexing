package com.yasic.yuexing.Objects;

/**
 * Created by ESIR on 2015/12/8.
 */
public class Motorcade {
    /**
     * 车队名称
     */
    private String motorcadeName;

    /**
     * 车队队长
     */
    private String motocadeMonitor;

    /**
     * 车队logo地址
     */
    private int motorLogo;

    /**
     * 车队类别
     */
    private String motorcadeType;

    /**
     * 创建时间
     */
    private String motorcadeFoundTime;

    public Motorcade(String motorcadeName, String motocadeMonitor, int motorLogo, String motorcadeType, String motorcadeFoundTime){
        this.motorcadeName = motorcadeName;
        this.motocadeMonitor = motocadeMonitor;
        this.motorLogo = motorLogo;
        this.motorcadeType = motorcadeType;
        this.motorcadeFoundTime = motorcadeFoundTime;
    }

    public void setMotorcadeName(String motorcadeName) {
        this.motorcadeName = motorcadeName;
    }

    public void setMotocadeMonitor(String motocadeMonitor) {
        this.motocadeMonitor = motocadeMonitor;
    }

    public void setMotorLogo(int motorLogo) {
        this.motorLogo = motorLogo;
    }

    public void setMotorcadeType(String motorcadeType) {
        this.motorcadeType = motorcadeType;
    }

    public void setMotorcadeFoundTime(String motorcadeFoundTime) {
        this.motorcadeFoundTime = motorcadeFoundTime;
    }

    public String getMotorcadeType() {
        return motorcadeType;
    }

    public String getMotorcadeFoundTime() {
        return motorcadeFoundTime;
    }

    public String getMotorcadeName() {
        return motorcadeName;
    }

    public String getMotocadeMonitor() {
        return motocadeMonitor;
    }

    public int getMotorLogo() {
        return motorLogo;
    }
}
