package com.whcs.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.whcs.dao.BaseDao;
import com.whcs.dao.UserDao;
import com.whcs.entity.User;
import com.whcs.util.Page;

public class UserDaoImpl extends BaseDao implements UserDao {

	public UserDaoImpl(Connection conn) {
		super(conn);
	}

	@Override
	public List<User> getUserList() throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = " select * from user ";
		ResultSet executeQuery = this.executeQuery(sql);
		while(executeQuery.next()){
			User user = new User(
				executeQuery.getInt("uid"),
				executeQuery.getString("uname"),
				executeQuery.getString("upwd"),
				executeQuery.getInt("uage"),
				executeQuery.getString("uaddress")
			);
			list.add(user);
		}
		return list;
	}

	//获取分页的总条数
	@Override
	public int getTotalCount() throws SQLException {
		int result = 0;
		String sql = " select count(1) from user ";
		ResultSet executeQuery = this.executeQuery(sql);
		while(executeQuery.next()){
			result = executeQuery.getInt(1);
		}
		return result;
	}

	@Override
	public Page getUserPage(Page page) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = " select * from user limit ?,? ";
		ResultSet executeQuery = this.executeQuery(sql, (page.getCurrPageNo()-1)*page.getPageSize(), page.getPageSize());
		while(executeQuery.next()){
			User user = new User(
				executeQuery.getInt("uid"),
				executeQuery.getString("uname"),
				executeQuery.getString("upwd"),
				executeQuery.getInt("uage"),
				executeQuery.getString("uaddress")
			);
			list.add(user);
		}
		page.setUsersList(list);
		return page;
	}
}
