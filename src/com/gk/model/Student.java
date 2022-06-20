package com.gk.model;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String Sno;
    private String Sname;
    private String Ssex;
    private int Sage;
    private String Clno;

    public String getSno() {
        return Sno;
    }
    public void setSno(String Sno) {
        this.Sno = Sno;
    }
    public String getSname() {
        return Sname;
    }
    public void setSname(String Sname) {
        this.Sname = Sname;
    }
    public int getSage() {
        return Sage;
    }
    public void setSage(int Sage) {
        this.Sage = Sage;
    }
    public String getSsex() {
        return Ssex;
    }
    public void setSex(String Ssex) {
        this.Ssex = Ssex;
    }
    public String getClno() {
        return Clno;
    }
    public void setClno(String Clno) {
        this.Clno = Clno;
    }
}
