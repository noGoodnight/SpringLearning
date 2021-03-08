package com.kuang.pojo;

public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void show(){
        System.out.println("Hello"+ str);
    }
}
