package com.bee.sample.ch3.controller.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.bee.sample.ch3.controller.validate.WorkOverTime;

public class WorkInfoForm {
	
	public interface Update{}
	public interface Add{}
	
	
	@NotNull(groups={Update.class})
	@Null(groups={Update.class})
	Long id;
	@Size(min=3,max=20)
	String name;
	@Email
	String email;
	@WorkOverTime(max=5)
	Integer workTime;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Integer workTime) {
		this.workTime = workTime;
	}
	

}
