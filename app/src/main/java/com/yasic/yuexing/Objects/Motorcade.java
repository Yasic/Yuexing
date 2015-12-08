package com.yasic.yuexing.Objects;

/**
 * Created by ESIR on 2015/12/8.
 */
public class Motorcade {
    /**
     * 车队名称
     */
    String motorcadeName;

    /**
     * 车队队长
     */
    String motocadeMonitor;

    /**
     * 车队logo地址
     */
    int motorLogo;

    public Motorcade(String motorcadeName, String motocadeMonitor, int motorLogo){
        this.motorcadeName = motorcadeName;
        this.motocadeMonitor = motocadeMonitor;
        this.motorLogo = motorLogo;
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
