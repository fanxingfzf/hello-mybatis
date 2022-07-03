package com.fzf.mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author fanZhiFei
 * @create 2022/7/3
 */
@Data
public class User {
    /**
     * id
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     *密码
     */
    private String password;
    /**
     *性别
     */
    private Integer sex;
    /**
     *生日
     */
    private Date birthday;
    /**
     * 注册时间
     */
    private Date registerTime;
}
