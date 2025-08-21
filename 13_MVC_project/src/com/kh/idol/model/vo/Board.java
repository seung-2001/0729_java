package com.kh.idol.model.vo;

public class Board {
	
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private String userId;
	private String createDate;
	
	public Board() {
		super();
	}
	public Board(int boardNo, String boardTitle, String boardContent, String userId, String createDate) {
		super();
		this.boardNo = boardNo;
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.userId = userId;
		this.createDate = createDate;
	}

	int getBoardNo() {
		return boardNo;
	}

	void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	String getBoardTitle() {
		return boardTitle;
	}

	void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	String getBoardContent() {
		return boardContent;
	}

	void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	String getUserId() {
		return userId;
	}

	void setUserId(String userId) {
		this.userId = userId;
	}

	String getCreateDate() {
		return createDate;
	}

	void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}
	
	/*
	 * 제목
	 * 내용
	 * 작성자
	 * 작성일
	 */
	
	
}
