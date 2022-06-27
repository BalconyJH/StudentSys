package com.gk.model;

import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private String sex;
    private String password;
    private String classId;

    public int getId()  {
        return id;
    }
}
