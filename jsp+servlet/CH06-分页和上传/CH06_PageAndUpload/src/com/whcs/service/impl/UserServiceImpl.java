package com.whcs.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.whcs.dao.UserDao;
import com.whcs.dao.impl.UserDaoImpl;
import com.whcs.entity.User;
import com.whcs.service.UserService;
import com.whcs.util.DatabaseUtil;
import com.whcs.util.Page;

public class UserServiceImpl implements UserService{
	
	public static Connection conn = null;
	public static UserDao userDao = null;
	
	static{
		try {
			conn = DatabaseUtil.getConnection();
			userDao = new UserDaoImpl(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> getUserList() throws SQLException {
		return userDao.getUserList();
	}

	@Override
	public int getTotalCount() throws SQLException {
		return userDao.getTotalCount();
	}

	@Override
	public Page getUserPage(Page page) throws SQLException {
		return userDao.getUserPage(page);
	}
}
