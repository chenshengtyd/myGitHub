package com.whcs.service.impl;

import com.whcs.service.IUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Yegz on 2017/9/4.
 */
@Service("userService")
public class UserService implements IUserService {


    @Override
    public void getUserInfo() {
        System.out.println("这是获取用户信息的方法");
    }
}
