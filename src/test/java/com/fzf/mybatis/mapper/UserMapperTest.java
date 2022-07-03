package com.fzf.mybatis.mapper;

import com.fzf.mybatis.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest {

    @Test
    void selectUserById() {

        try {
            //1、读取mybatis的配置文件
            InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
            //2、创建SqlSession会话,mybatis使用工厂建造者的方式创建
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(resource);
            SqlSession sqlSession=factory.openSession();

            //3、获取要执行操作的接口
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

            //4、执行查询
            User user = userMapper.selectUserById(1);
            //查看数据
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}