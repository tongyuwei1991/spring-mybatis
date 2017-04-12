package org.framestudy.spring_mybatis.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.framestudy.spring_mybatis.usermag.beans.UserInfo;

public interface UserMapper {
	public int saveUserInfo(UserInfo user);
	public int updateInfo(@Param("u")UserInfo user); //取别名
	public int deleteUserInfo(int id);
	public UserInfo getUserInfoById(int id);
	
	public UserInfo getUserByLoginNameAndPwd(@Param("loginName")String loginName,@Param("pwd")String pwd);//给对象取别名，用于在sql语句中获得相应属性
	
	public List<UserInfo> queryUserListByMap(@Param("map")Map map);//为什么要用Map？为什么不可以用UserInfo对象？
	
	public int batchSaveUserInfo(@Param("users")List<UserInfo> users);//在sql中是怎么获得对应属性的值的？没有取别名
	
	public int batchDeleteUserInfo(@Param("users")List<UserInfo> users);
	
	/**
	 * 分页，两个方法：1.统计满足查询条件的总数
	 * 				  2.查询满足条件的所有数据
	 */
	public int countUserListByMapToPage(@Param("map")Map map);
	
	public List<?> getUserListByMapToPage(@Param("map")Map map);
}
