package org.framestudy.spring_mybatis.usermag.beans;

import java.io.Serializable;

public class UserInfo implements Serializable,Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -223639821875984586L;
	private int id;
	private String userName;
	private String pwd;
	private int age;
	private String loginName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfo(int id, String userName, String pwd, int age, String loginName) {
		super();
		this.id = id;
		this.userName = userName;
		this.pwd = pwd;
		this.age = age;
		this.loginName = loginName;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", pwd=" + pwd + ", age=" + age + ", loginName="
				+ loginName + "]";
	}
	
}
