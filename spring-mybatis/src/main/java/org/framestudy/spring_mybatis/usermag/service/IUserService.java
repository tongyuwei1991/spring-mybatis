package org.framestudy.spring_mybatis.usermag.service;

import java.util.List;
import java.util.Map;

import org.framestudy.spring_mybatis.pojos.Pager;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface IUserService {
	public int saveUserInfo(UserInfo user);
	public int updateInfo(UserInfo user);
	public int deleteUserInfo(int id);
	public UserInfo getUserInfoById(int id);
	
	public UserInfo getUserByLoginNameAndPwd(String loginName,String pwd);

	public List<UserInfo> queryUserListByMap(Map map); //多参数传递方式map
	
	public int batcheSaveUserInfo(List<UserInfo>users);
	
	public int batcheDeleteUserInfo(List<UserInfo>users);
	
	public Pager getUserListByMapToPager(Map map); //多参数分页查询
}
