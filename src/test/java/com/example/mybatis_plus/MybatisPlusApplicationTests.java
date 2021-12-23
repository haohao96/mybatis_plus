package com.example.mybatis_plus;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.example.mybatis_plus.mapper.UserMapper;
import com.example.mybatis_plus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;


@MybatisPlusTest
public class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void testInsert() {
        User user = new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }

}
