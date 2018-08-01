package com.whcs.util;

import java.util.List;

import com.whcs.entity.User;

public class Page {

	private int currPageNo = 1; // 当前页码
	private int pageSize = 2; // 页面大小，即每页显示记录数
	private int totalCount; // 记录总数
	private int totalPageCount = 0; // 总页数
	List<User> usersList; // 每页新闻集合

	public int getCurrPageNo() {
		if(totalPageCount == 0){
			return 0;
		}
		return currPageNo;
	}

	public void setCurrPageNo(int currPageNo) {
		if(currPageNo > 0){
			this.currPageNo = currPageNo;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if(pageSize > 0){
			this.pageSize = pageSize;
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		if(totalCount > 0){
			this.totalCount = totalCount;
			totalPageCount = totalCount % pageSize == 0 ? (totalCount / pageSize) : (totalCount / pageSize + 1); 
		}
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

}
