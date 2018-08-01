package com.whcs.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.whcs.entity.User;
import com.whcs.entity.UserGroup;

public class FastJsonTest {

	public static void main(String[] args) {
		// 构建用户geust
		User guestUser = new User();
		guestUser.setName("潘大蟀");
		guestUser.setAge(18);
		// 构建用户root
		User rootUser = new User();
		rootUser.setName("女捧菲");
		rootUser.setAge(16);

		// 构建用户组对象
		UserGroup group = new UserGroup();
		group.setName("神奇的Java02男生联盟搞基班");
		List<User> listUser = new ArrayList<>();
		listUser.add(guestUser);
		listUser.add(rootUser);
		group.setUsers(listUser);

		// 用户组对象转JSON串
		String jsonString = JSON.toJSONString(group);
		System.out.println("jsonString:" + jsonString);
		// JSON串转用户组对象
		UserGroup group2 = JSON.parseObject(jsonString, UserGroup.class);
		System.out.println("group2:" + group2);

		// 构建用户对象数组
		User[] users = new User[2];
		users[0] = guestUser;
		users[1] = rootUser;
		// 用户对象数组转JSON串
		String jsonString2 = JSON.toJSONString(users);
		System.out.println("jsonString2:" + jsonString2);

		// JSON串转用户对象List集合(列表)
		List<User> users2 = JSON.parseArray(jsonString2, User.class);
		System.out.println("users2:" + users2);

		/*
		 * 总结： 
		 * 1.toJSONString 将对象 或者 数组 或者 集合 转成JSON字符串
		 * 2.JSON.parseObject(json_str，Class) 将JSON字符串转成 对象
		 * 3.JSON.parseArray(json_str，Class) 将JSON字符串转成 对象集合
		 */

		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "小");
		map.put("b", "中");
		map.put("c", "大");
		/*第二个参数：是否采用好看的格式*/
		String json = JSON.toJSONString(map, false);
		System.out.println(json);
		
		// JSON -> Map
		Map<String, String> map1 = (Map<String, String>) JSON.parse(json);
		for (String key : map1.keySet()) {
			System.out.println(key + ":" + map1.get(key));
		}
	}

}
