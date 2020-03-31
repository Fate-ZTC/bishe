package com.xxl.api.admin.core.model;

import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName TestDemo
 * @Description TODO
 * @Author ZTC
 * @Date 2020/3/31 16:42
 * @Version 1.0
 **/
@Component
public class TestDemo {
    private String name;
    private Integer age;
    private String password;
    private String number;

    public String getName() {
        return name;
    }
    @Value("${name}")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    @Value("${age}")
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    @Value("${password}")
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    @Value("${number}")
    public void setNumber(String number) {
        this.number = number;
    }
}
