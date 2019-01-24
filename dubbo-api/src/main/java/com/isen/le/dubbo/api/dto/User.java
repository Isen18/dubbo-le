package com.isen.le.dubbo.api.dto;

import java.io.Serializable;

/**
 * @author Isen
 * @date 2019/1/24 15:11
 * @since 1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 7429764128728420098L;
    /**
     * 用户id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
