package com.myexample.mydemo.entity;

import java.util.Date;

public class Message {
    private String code;
    private String creator;
    private Integer id;

    public String getCode() {
        return code;
    }
    public String getCreator() {
        return creator;
    }
    public Integer getId() {
        return id;
    }

    public void setName(String code) {
        this.code =code;
    }
}
