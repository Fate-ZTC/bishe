package com.xxl.api.admin.dao;

/**
 * @ClassName TestUser
 * @Description TODO
 * @Author ZTC
 * @Date 2020/5/25 23:02
 * @Version 1.0
 **/
public class TestUser {
    private String username;
    private String password;
    private Integer age;
    private String  phoneNumber;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String  getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
