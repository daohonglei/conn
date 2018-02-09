package com.connect.modle;

import org.hibernate.validator.constraints.NotEmpty;

public class User {
private int id;
	
	@NotEmpty(message="����")
	private String name;
	
	@NotEmpty(message="�ǳ�")
	private String nickname;
	
	@NotEmpty(message="ѧ��")
	private String schoolid;
	
	@NotEmpty(message="רҵ")
	private String major;
	
	@NotEmpty(message="ѧУ")
	private String schoolname;
	
	@NotEmpty(message="��ַ")
	private String address;
	
	@NotEmpty(message="����")
	private String job;
	
	@NotEmpty(message="����")
	private String password;
	
	@NotEmpty(message="�绰")
	private String phone;
	
	@NotEmpty(message="����")
	private String email;
	
	@NotEmpty(message="��ϸ��ַ")
	private String point;

	private boolean perclass;
	private boolean permajor;
	private boolean perschool;
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
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getSchoolid() {
		return schoolid;
	}
	public void setSchoolid(String schoolid) {
		this.schoolid = schoolid;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public boolean isPerclass() {
		return perclass;
	}
	public void setPerclass(boolean perclass) {
		this.perclass = perclass;
	}
	public boolean isPermajor() {
		return permajor;
	}
	public void setPermajor(boolean permajor) {
		this.permajor = permajor;
	}
	public boolean isPerschool() {
		return perschool;
	}
	public void setPerschool(boolean perschool) {
		this.perschool = perschool;
	}
	
}
