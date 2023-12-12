package com.firstApi.firstapiproject;

public class UserInfo {

    private  int id;

    private  String name;

    private  int age;

    private  String emailId;

    public UserInfo(int id, String name, int age, String emailId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
