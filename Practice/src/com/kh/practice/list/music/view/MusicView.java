package com.kh.practice.list.music.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		
		while(true){
			System.out.println("******** 메인 메뉴 ********");
			System.out.println("1. 마지막 위치에 곡추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : >>");
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
				
				switch(menuNo) {
				case 1 : addList(); break;
				case 2 : addAtZero(); break;
				case 3 : printAll(); break;
				case 4 : searchMusic(); break;
				case 5 : removeMusic(); break;
				case 6 : setMusic();break;
				case 9 : return;
				default : System.out.println("잘 못 입력하셨습니다.");
				}
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void addList() {
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.println();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		System.out.println();
		
		int result = mc.addList(new Music(title, singer));
	
		if(result == 1 ) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		
		System.out.print("곡 명 : ");
		String title = sc.nextLine();
		System.out.println();
		
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		System.out.println();
		
		int result = mc.addAtZero(new Music(title, singer));
		
		if(result == 1 ) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void printAll() {
		System.out.println("****** 전체 곡 목록 출력 ******");
		
		List<Music> musicList = mc.printAll();
		for(Music m : musicList) {
			System.out.println(m.getTitle() + " - " + m.getSinger());
		}
	}
	
	public void searchMusic() {
		System.out.println("****** 특정 곡 목록 검색 ******");
		
		System.out.print("검색할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println();
		
		Music music = mc.searchMusic(title);
		System.out.println("검색한 곡은 " + music.getTitle() + "/" + music.getSinger() + " 입니다.");
	}
	
	public void removeMusic() {
		System.out.println("****** 특정 곡 삭제 ******");
		
		System.out.print("삭제 할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println();
		
		Music m = mc.removeMusic(title);
		
		if(m != null) {
			System.out.println( m.getTitle() + " - " + m.getSinger() + "을(를) 삭제했습니다.");
		}else {
			System.out.println("삭제할 곡이 없습니다!");
		}
		
	}
	
	public void setMusic() {
		System.out.println("****** 특정 곡 수정 ******");
		
		System.out.print("수정할 곡 명 : ");
		String title = sc.nextLine();
		System.out.println();
		
		System.out.print("수정할 가수 명 : ");
		String singer = sc.nextLine();
		System.out.println();
		
		
		Music m = null;
		try {
			m = mc.setMusic(title, singer);
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		if( m!= null ) {
			System.out.println("(" + title + ", " + singer + ")의 값이 변경 되었습니다");
		}else {
			System.out.println("수정할 곡이 없습니다.");
		}
		
		
	}
	
}
