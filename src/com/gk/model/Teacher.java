package com.gk.model;

public class Teacher {
    private int id;
    private String name;
    private String sex;
    private String title;
    private String password;
    private int age;

    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
