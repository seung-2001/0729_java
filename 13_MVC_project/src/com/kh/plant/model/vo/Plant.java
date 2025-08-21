package com.kh.plant.model.vo;

// Model : 데이터 관련 작업
// VO : 프로그램 실행 중 만들어진 값(Value)를 담는 객체(Object)
public class Plant {
	private String name;
	private String type;
	
	// VO 만들기 졸업
	// 기본생성자, 매개변수 생성자, getter, setter, toString+
	// Alt + Shift + s => o => Alt + d => Alt + g
	public Plant() {
	}
	
	// Alt + Shift + s => o => Alt + g
	public Plant(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	// Alt + Shift + s => r => Alt + a => Alt + r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	// Alt + Shift + s => s => r
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	
	
}
