package com.kh.chap04.model.vo;

public class Fish {
	
	private String taste;
	private String recipe;
	
	
	public Fish() {
		super();
	}

	public Fish(String taste, String recipe) {
		super();
		this.taste = taste;
		this.recipe = recipe;
	}
	
	String getTaste() {
		return taste;
	}
	void setTaste(String taste) {
		this.taste = taste;
	}
	String getRecipe() {
		return recipe;
	}
	void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "Fish [taste=" + taste + ", recipe=" + recipe + "]";
	}
	
	
}
