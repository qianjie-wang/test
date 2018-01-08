package com.jw.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

public class CreatableVO extends EntityVO{

	@Column(name = "createDate" , nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	@NotNull
	private Date createDate;
	
	@Column(name = "createdBy" , nullable = false)
	private String createdBy;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public CreatableVO() {
		this.createDate = new Date();
	}
	
}
