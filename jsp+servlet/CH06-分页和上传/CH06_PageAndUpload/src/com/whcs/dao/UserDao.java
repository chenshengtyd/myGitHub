package com.whcs.dao;

import java.sql.SQLException;
import java.util.List;

import com.whcs.entity.User;
import com.whcs.util.Page;

public interface UserDao {

	public List<User> getUserList() throws SQLException;
	public int getTotalCount() throws SQLException;
	//分页查询
	public Page getUserPage(Page page) throws SQLException;
}
