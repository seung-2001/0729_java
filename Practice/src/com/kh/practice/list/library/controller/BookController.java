package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	private List list = new ArrayList();

	public BookController() {
		super();
	}

	public BookController(List list) {
		super();
		this.list = list;
	}

	public void insertbook(Book bk) {
		if (bk != null) {
			list.add(bk);
		}
	}

	public ArrayList selectList() {
		return (ArrayList) list;
	}


	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			Book book = (Book) list.get(i);
			if (book.getTitle().contains(keyword)) {
				searchList.add(book); // 검색된 도서를 결과에 추가
			}
		}

		return searchList; // 검색 결과가 없으면 비어 있는 리스트가 리턴됨
	}

	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		
		for(int i = 0; i < list.size(); i++) {
			Book book = (Book)list.get(i);
			if(title.equals(book.getTitle()) && author.equals(book.getAuthor())) {
				removeBook = book;
				list.remove(i);
				
			}
			break;
		}
			return removeBook;
	}

}
