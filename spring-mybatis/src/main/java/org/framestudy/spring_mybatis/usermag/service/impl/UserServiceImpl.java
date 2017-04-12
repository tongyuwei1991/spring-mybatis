package org.framestudy.spring_mybatis.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.framestudy.spring_mybatis.usermag.dao.impl.UserDaoImpl;
import org.framestudy.spring_mybatis.usermag.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{
	
	@Resource
	private IUserDao userDaoImpl;
	
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUserInfo(user);
	}

	public int updateInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateInfo(user);
	}

	public int deleteUserInfo(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(int id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserInfoById(id);
	}

	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserByLoginNameAndPwd(loginName, pwd);
	}

	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.queryUserListByMap(map);
	}

	public int batcheSaveUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return userDaoImpl.batcheSaveUserInfo(users);
	}

	public int batcheDeleteUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return userDaoImpl.batcheDeleteUserInfo(users);
	}

	public Pager getUserListByMapToPager(Map map) {
		// TODO Auto-generated method stub
		Pager pager = new Pager();
		int totalRows = userDaoImpl.countUserListByMapToPage(map);
		List<?> list = userDaoImpl.getUserListByMapToPage(map);
		return new Pager(totalRows, list);
	}

}
