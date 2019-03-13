package com.treadstone.grpproject.daropointsevents.models.users;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Students {
    @SerializedName("id")
    @Expose
    int id;
    @SerializedName("id")
    @Expose
    String reg_nu;
    @SerializedName("username")
    @Expose
    String username;
    @SerializedName("password")
    @Expose
    String password;
    @SerializedName("first_name")
    @Expose
    String first_name;
    @SerializedName("last_name")
    @Expose
    String last_name;
    @SerializedName("email")
    @Expose
    String email;
    @SerializedName("reg_no")
    @Expose
    String reg_no;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getReg_nu() {
        return reg_nu;
    }

    public void setReg_nu(String reg_nu) {
        this.reg_nu = reg_nu;
    }

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

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
