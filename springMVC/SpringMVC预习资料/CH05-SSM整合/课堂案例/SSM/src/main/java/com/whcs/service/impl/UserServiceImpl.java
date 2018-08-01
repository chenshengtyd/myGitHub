package com.whcs.service.impl;

import com.whcs.dao.UserMapper;
import com.whcs.entity.User;
import com.whcs.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Yegz on 2017/7/18.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }

}
