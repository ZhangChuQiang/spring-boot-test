package com.springboottest.config.config;

import javax.validation.constraints.NotNull;

/**
 * Created by zhangchuqiang on 2017/3/9.
 */
public class ConfigrationJSR303 {
    @NotNull
    private String name;

    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
