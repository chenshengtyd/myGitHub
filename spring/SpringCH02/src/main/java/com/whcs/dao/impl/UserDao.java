package com.whcs.dao.impl;

import com.whcs.dao.IUserDao;
import com.whcs.entity.TestEntity;
import com.whcs.entity.User;

/**
 * Created by Yegz on 2017/9/4.
 */
public class UserDao implements IUserDao {

    private String username;
    private User user;
    private TestEntity testEntity;

    public UserDao() {
    }

    public UserDao(String username) {
        this.username = username;
    }

    public UserDao(User user) {
        this.user = user;
    }

    @Override
    public void getUserInfo() {
        System.out.println(this.username);
        System.out.println(user.toString());
        this.testEntity.showValue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TestEntity getTestEntity() {
        return testEntity;
    }

    public void setTestEntity(TestEntity testEntity) {
        this.testEntity = testEntity;
    }
}
