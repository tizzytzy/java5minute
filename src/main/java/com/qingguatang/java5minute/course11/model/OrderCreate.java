package com.qingguatang.java5minute.course11.model;

import java.util.Date;

public class OrderCreate {

    private String nickName;

    //下单备注
    private String content;


    private Date createTime;


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



}
