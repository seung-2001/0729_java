package com.kh.chap03.model.vo;

public class PaperBook extends Book{
	
	private int lostPage;
	
	public PaperBook() {}
	public PaperBook(String title, String publisher,
					 String author, int price,
					 int lostPage) {
		
		super(title, publisher, author, price);
		this.lostPage = lostPage;
		
	}
	
	public int getlostPage() {
		return lostPage;
	}
	public void setlostPage(int lostPage) {
		this.lostPage = lostPage;
	}
	
	public String information() {
		return super.information() + ", 잃어버린 페이지 : " + lostPage + "]";
	}
	
	public String toString() {
		return super.information() + ", 잃어버린 페이지 : " + lostPage + "]";
	}
	
}
