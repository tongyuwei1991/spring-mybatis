package org.framestudy.spring_mybatis.relationmag.beans;

public class Wife {
	private int id;
	private String name;
	
	private Husband husband;

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

	public Husband getHusband() {
		return husband;
	}

	public void setHusband(Husband husband) {
		this.husband = husband;
	}

	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wife(int id, String name, Husband husband) {
		super();
		this.id = id;
		this.name = name;
		this.husband = husband;
	}

	@Override
	public String toString() {
		return "Wife [id=" + id + ", name=" + name + ", husband=" + husband + "]";
	}
	
}
