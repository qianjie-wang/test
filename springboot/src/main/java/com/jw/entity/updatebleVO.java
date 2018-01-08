package com.jw.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

public class updatebleVO extends CreatableVO{
	
	@Column(name = "updateDate" , nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	@NotNull
	private Date updateDate;
	
	@Column(name = "updatedBy" , nullable = false)
	private String updatedBy;

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	public updatebleVO() {
		this.updateDate = new Date();
	}

}
