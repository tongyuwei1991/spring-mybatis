package org.framestudy.spring_mybatis.relationmag.beans;

public class Husband {
	private int id;
	private String name;
	
	private Wife wife;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public Husband() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Husband(int id, String name, Wife wife) {
		super();
		this.id = id;
		this.name = name;
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}
	
}
