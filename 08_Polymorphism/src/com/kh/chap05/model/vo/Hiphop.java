package com.kh.chap05.model.vo;

public class Hiphop extends Music implements MusicI {
	
	@Override
	public void play() {
		System.out.println("힙합을 재생합니다.");
	}
		
	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	}
	
}
