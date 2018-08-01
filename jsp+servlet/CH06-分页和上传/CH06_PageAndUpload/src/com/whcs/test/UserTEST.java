package com.whcs.test;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.whcs.entity.User;
import com.whcs.service.UserService;
import com.whcs.service.impl.UserServiceImpl;
import com.whcs.util.Page;

/**
 * 项目名称：CH06_PageAndUpload   
 * 类名称：UserTEST   
 * 类描述：   
 * 创建人：Yegz  
 * 创建时间：2017年7月28日 下午3:38:17   
 * 修改人：Administrator   
 * 修改时间：2017年7月28日 下午3:38:17   
 * 修改备注：   
 * @version    
 *
 */
public class UserTEST {
	UserService userService = new UserServiceImpl();

	@Test
	public void getUserList() throws SQLException{
		List<User> userList = userService.getUserList();
		for (User user : userList) {
			System.out.println(user.toString());
		}
	}
	
	//1.普通的分页测试
	@Test
	public void testPage() throws SQLException{
		//1.拿到我们的总页数
		Integer totalCount = userService.getTotalCount();
		Integer pageSize = 2;//每一页显示的条数
		Integer totalPageCount = totalCount % pageSize == 0 ? (totalCount / pageSize) : (totalCount / pageSize + 1);//总页数
		
		//2.带着条件查询
		Page page = new Page();
		page.setCurrPageNo(4);
		page.setPageSize(2);
		page.setTotalCount(totalCount);
		page.setTotalPageCount(totalPageCount);
		
		//3.做查询
		Page userPage = userService.getUserPage(page);
		List<User> usersList = userPage.getUsersList();
		for (User user : usersList) {
			System.out.println(user.toString());
		}
		
		/*
		 * 1.jsp进行分页查询 首页 上一页 下一下 尾页
		 * 2.12345 34567 百度贴吧的效果
		 */
	}
}
