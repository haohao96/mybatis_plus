package com.example.mybatis_plus.contr;

import com.example.mybatis_plus.mapper.UserMapper;
import com.example.mybatis_plus.pojo.User;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RestController
public class controller {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/pyh")
    public void pyh()
    {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @RequestMapping("/insert")
    public void insertTest()
    {
        User user=new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }
}
