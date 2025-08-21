package com.kh.chap05.model.vo;

public class Jazz implements MusicI {

	@Override
	public void play() {
		System.out.println("재즈란 말이죵~");
	}

	@Override
	public void stop() {
		System.out.println("음악을 멈춥니다.");
	}
}
