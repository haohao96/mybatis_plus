package com.example.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis_plus.entity.User;
import com.example.mybatis_plus.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@MapperScan("com.example.mybatis_plus.mapper")
@EnableSwagger2
@RunWith(SpringJUnit4ClassRunner.class)
public class MybatisPlusApplication {

    @Resource
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

    @Test
    public void test()
    {
        List<User> users = userMapper.selectList(new QueryWrapper<User>().eq("id", 1));
        users.forEach(System.out::println);
    }
}
