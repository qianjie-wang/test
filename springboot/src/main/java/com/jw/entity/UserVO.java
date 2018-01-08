package com.jw.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name = "user")
public class UserVO extends updatebleVO{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name" , nullable = false)
	private String name;
	
	@Column(name = "sex" , nullable = false)
	private Boolean sex;
	
	@Column(name = "password" , nullable = false)
	private String password;
	
	@Column(name = "age" , nullable = false)
	private Integer age;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		sb.append("id:" + getId());
		sb.append(",name:" + getName());
		sb.append(",sex:" + (getSex()?"male":"female"));
		sb.append(",age:" + getAge());
		sb.append("]");
		return sb.toString();
	}
	
}
