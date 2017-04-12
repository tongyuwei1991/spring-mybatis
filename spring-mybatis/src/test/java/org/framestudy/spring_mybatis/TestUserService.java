package org.framestudy.spring_mybatis;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//使用JUnit测试的时候，启动Spring容器
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestUserService {
	
	@Resource
	private IUserService userServiceImpl; 
	
	@Ignore
	public void testSaveUserInfo(){
		userServiceImpl.saveUserInfo(new UserInfo(1,"tong","123456",25,"c1"));
		
	}
	
	@Test
	public void testGetUserListByMapToPager(){
		int page=1;
		int rows=5;
		String userName="to";
		String loginName="a";
		int index=(page-1)*rows;
		
		Map map = new HashMap();
		map.put("index",index);
		map.put("rows",rows);
		map.put("page", page);
		map.put("userName", userName);
		map.put("loginName", loginName);
		
		Pager pager=userServiceImpl.getUserListByMapToPager(map);
		
		System.out.println("查询到的总页数：");
		for(Object user:pager.getDatas()){
			System.out.println(user);
		}
	}
}
