package com.eoschu.cosmetic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	private String userId;
	private String password;
	private String emailId;
	private boolean enabled;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", emailId=" + emailId + ", enabled=" + enabled
				+ "]";
	}
	public User(String userId, String password, String emailId, boolean enabled) {
		super();
		this.userId = userId;
		this.password = password;
		this.emailId = emailId;
		this.enabled = enabled;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	
}
