package com.kh.chap04_assist.model.vo;

import java.io.Serializable;

public class Plant implements Serializable {
	
	private String name;
	private String type;
	
	public Plant() {
		super();
	}
	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	
}
