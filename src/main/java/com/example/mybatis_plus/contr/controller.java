package com.example.mybatis_plus.contr;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis_plus.entity.User;
import com.example.mybatis_plus.mapper.UserMapper;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RestController
public class controller {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/pyh")
    public void pyh()
    {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    /*@RequestMapping("/insert")
    public void insertTest()
    {
        User user=new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }*/

    @RequestMapping("/selectList")
    public List<User> selectList()
    {
        List<User> users = userMapper.selectList(new QueryWrapper<User>().eq("id", 1));
        users.forEach(System.out::println);
        return users;
    }
}
