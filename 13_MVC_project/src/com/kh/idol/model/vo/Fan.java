package com.kh.idol.model.vo;

public class Fan {
	
	private String userId;
	private String userPwd;
	private String nickName;
	
	public Fan() {
		super();
	}
	public Fan(String userId, String userPwd, String nickName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	String getUserId() {
		return userId;
	}
	void setUserId(String userId) {
		this.userId = userId;
	}
	String getUserPwd() {
		return userPwd;
	}
	void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	String getNickName() {
		return nickName;
	}
	void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String toString() {
		return "Fan [userId=" + userId + ", userPwd=" + userPwd + ", nickName=" + nickName + "]";
	}
}
