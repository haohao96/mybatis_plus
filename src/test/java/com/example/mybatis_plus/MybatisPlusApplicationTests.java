package com.example.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatis_plus.entity.User;
import com.example.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MybatisPlusApplicationTests {

    @Resource
    private UserMapper userMapper;

    /*@Test
    void testInsert() {
        User user = new User();
        userMapper.insert(user);
        assertThat(user.getId()).isNotNull();
    }*/

    @Test
    public void test()
    {
        HashMap<String, String> map = new HashMap<String, String>(){{put("id","2");put("name","Jack");}};
        userMapper.deleteById(2);
        System.out.println("userMapper.selectById(2)===="+userMapper.selectById(2));
        List<User> users = userMapper.selectList(new QueryWrapper<User>()
//                .allEq(( k, v)->k.indexOf("i")>=0,map)
                .eq("id",2)
//                .likeLeft("name","J")
        );
        System.out.println("wrapper 条件查询得到的：");
        users.forEach(System.out::println);
    }

    @Test
    public void testPage()
    {
        Page<User> page=new Page<>(2,2);
        Page<User> userPage = userMapper.selectPage(page,null);
        userPage.getRecords().forEach(System.out::println);
    }

}
