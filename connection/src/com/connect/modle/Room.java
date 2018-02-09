package com.connect.modle;

import org.hibernate.validator.constraints.NotEmpty;

public class Room {
	private int id;
	private int userid;
	
	@NotEmpty(message="��������")
	private String name;
	
	@NotEmpty(message="��������")
	private String password;
	
	@NotEmpty(message="ѧУ")
	private String schoolname;
	
	@NotEmpty(message="רҵ")
	private String major;
	
	@NotEmpty(message="�꼶")
	private String classid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getClassid() {
		return classid;
	}

	public void setClassid(String classid) {
		this.classid = classid;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", userid=" + userid + ", name=" + name
				+ ", password=" + password + ", schoolname=" + schoolname
				+ ", major=" + major + ", classid=" + classid + "]";
	}
	
	
	
}
