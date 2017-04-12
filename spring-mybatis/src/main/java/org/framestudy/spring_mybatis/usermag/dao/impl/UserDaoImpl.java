package org.framestudy.spring_mybatis.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;
import org.framestudy.spring_mybatis.usermag.dao.IUserDao;
import org.framestudy.spring_mybatis.usermag.mapper.UserMapper;
import org.framestudy.spring_mybatis.utils.SessionUtils;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements IUserDao {
	
	private UserMapper um;
	public void setSession(SqlSession session){
		um = session.getMapper(UserMapper.class);
	}
	
	public int saveUserInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return um.saveUserInfo(user);
	}

	public int updateInfo(UserInfo user) {
		// TODO Auto-generated method stub
		return um.updateInfo(user);
	}

	public int deleteUserInfo(int id) {
		// TODO Auto-generated method stub
		return um.deleteUserInfo(id);
	}

	public UserInfo getUserInfoById(int id) {
		// TODO Auto-generated method stub
		return um.getUserInfoById(id);
	}

	public UserInfo getUserByLoginNameAndPwd(String loginName, String pwd) {
		// TODO Auto-generated method stub
		return um.getUserByLoginNameAndPwd(loginName, pwd);
	}

	public List<UserInfo> queryUserListByMap(Map map) {
		// TODO Auto-generated method stub
		return um.queryUserListByMap(map);
	}

	public int batcheSaveUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return um.batchSaveUserInfo(users);
	}

	public int batcheDeleteUserInfo(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return um.batchDeleteUserInfo(users);
	}

	public int countUserListByMapToPage(Map map) {
		// TODO Auto-generated method stub
		return um.countUserListByMapToPage(map);
	}

	public List<?> getUserListByMapToPage(Map map) {
		// TODO Auto-generated method stub
		return um.getUserListByMapToPage(map);
	}

}
