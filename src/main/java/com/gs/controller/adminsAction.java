package com.gs.controller;

/**
 * Created by CHEN JX on 2017/8/6.
 */
public class adminsAction {

    private String phone;
    private String pwd;
    private String[] hobby;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String log(){
        System.out.print("phone" + ":" + phone + "," + "pwd" + ":" + pwd);
        for (String s : hobby) {

            System.out.print(s);
        }
        return "log";
    }
    public String a(){
        return "a";
    }
}
