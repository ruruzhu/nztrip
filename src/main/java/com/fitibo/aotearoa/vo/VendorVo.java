package com.fitibo.aotearoa.vo;

/**
 * Created by qianhao.zhou on 8/19/16.
 */
public class VendorVo {

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private int id;
    private String name;
    private String email;
    private String phone;
}
