package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List list = new ArrayList();

	public int addList(Music music) {
		if (music != null) {
			list.addFirst(music);
			return 1;
		}
		return 0;
	}

	public int addAtZero(Music music) {
		if (music != null) {
			list.addLast(music);
			return 1;
		}
		return 0;
	}

	public List printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		Music m = new Music();
		for (int i = 0; i < list.size(); i++) {
			m = (Music) list.get(i);
			if (title.equals(m.getTitle())) {
				return m;
			}
			break;
		}
		return null;
	}

	public Music removeMusic(String title) {
		Music m = new Music();
		if (!list.isEmpty()) {
			for (int i = 0; i < list.size(); i++) {
				m = (Music) list.get(i);
				if (title.equals(m.getTitle())) {
					list.remove(i);
					return m;
				}
				break;
			}
		}

		return null;
	}

	public Music setMusic(String title, String singer) {
		 
		if(searchMusic(title) != null) {
			Music m = searchMusic(title);
			Scanner sc = new Scanner(System.in);
			System.out.print("수정할 곡 명 : ");
			String newTitle = sc.nextLine();
			
			System.out.print("수정할 가수 명 : ");
			String newSinger = sc.nextLine();
			
			m.setTitle(newTitle);
			m.setSinger(newSinger);
			return m;
		}
			
		return null;
		
		
	}

}
