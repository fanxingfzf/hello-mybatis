package com.fzf.mybatis.mapper;

import com.fzf.mybatis.entity.User;

/**
 * @author fanZhiFei
 * @create 2022/7/3
 * dao层接口
 */
public interface UserMapper {

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    User selectUserById(Integer id);
}
