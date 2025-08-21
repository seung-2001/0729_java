package com.kh.chap07.remote.model.vo;

public class Television {
	
	private boolean On;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "대한민국 24 뉴스채널";
		channel[1] = "시니어토크쇼";
		channel[2] = "스튜디오K";
		channel[3] = "EBS 평생학교 2교시";
		channel[4] = "꾸러기TV";
	}

	public boolean isOn() {
		return On;
	}

	public void setOn(boolean On) {
		this.On = On;
	}

	public String[] getChannel() {
		return channel;
	}

	public void setChannel(String[] channel) {
		this.channel = channel;
	}
	

}
