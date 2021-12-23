package com.example.mybatis_plus.service.impl;

import com.example.mybatis_plus.entity.User;
import com.example.mybatis_plus.mapper.UserMapper;
import com.example.mybatis_plus.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 皮一豪
 * @since 2021-12-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
