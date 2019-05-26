package com.example.bean;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Arrays;

@Entity
@Table(name = "hq_portal_img")
public class Img {

    @Id
    private String id;
    private String name;
    @Lob
    private byte[] bytes;

    @Column(name = "createtime")
//    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", bytes=" + Arrays.toString(bytes) +
                ", createTime=" + createTime +
                '}';
    }
}
