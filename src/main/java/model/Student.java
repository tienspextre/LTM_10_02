package model;

import java.io.Serializable;

public class Student implements Serializable {
    static final long serialVersionUID = 2L;
    private String maSV;
    private String hovaten;
    private String IP;
    private int group;

    public Student() {
        // Default constructor
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}

