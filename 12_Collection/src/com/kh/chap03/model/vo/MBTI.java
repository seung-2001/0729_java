package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {
	
	private String introversionExtroversion;
	private String sensingiNtuition;
	private String thinkingFeeling;
	private String judgingPerceiving;
	
	public MBTI() {
		super();
	}
	public MBTI(String introversionExtroversion, String sensingiNtuition, String thinkingFeeling,
			String judgingPerceiving) {
		super();
		this.introversionExtroversion = introversionExtroversion;
		this.sensingiNtuition = sensingiNtuition;
		this.thinkingFeeling = thinkingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}
	
	
	String getIntroversionExtroversion() {
		return introversionExtroversion;
	}
	void setIntroversionExtroversion(String introversionExtroversion) {
		this.introversionExtroversion = introversionExtroversion;
	}
	String getSensingiNtuition() {
		return sensingiNtuition;
	}
	void setSensingiNtuition(String sensingiNtuition) {
		this.sensingiNtuition = sensingiNtuition;
	}
	String getThinkingFeeling() {
		return thinkingFeeling;
	}
	void setThinkingFeeling(String thinkingFeeling) {
		this.thinkingFeeling = thinkingFeeling;
	}
	String getJudgingPerceiving() {
		return judgingPerceiving;
	}
	void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}
	
	
	@Override
	public String toString() {
		return "MBTI [introversionExtroversion=" + introversionExtroversion + ", sensingiNtuition=" + sensingiNtuition
				+ ", thinkingFeeling=" + thinkingFeeling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(introversionExtroversion, judgingPerceiving, sensingiNtuition, thinkingFeeling);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversionExtroversion, other.introversionExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensingiNtuition, other.sensingiNtuition)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	
	// 결론적으로 우리가 해야할 일
	// 필드의 값이 동일하다면
	// equals()와 hashCode()를 오버라이딩해서 동일한 결과값이 출력되도록 구현해야함
	/*
	@Override
	public boolean equals(Object obj) {
		MBTI mbti = (MBTI)obj;
		// 필드값 비교
		// ei, sn, tf, jp 넷 중 하나라도 다르면 false을 반환
		
		if(!this.introversionExtroversion.equals(mbti.introversionExtroversion) ||
		   !this.sensingiNtuition.equals(mbti.sensingiNtuition) ||
		   !this.thinkingFeeling.equals(mbti.thinkingFeeling) ||
		   !this.judgingPerceiving.equals(mbti.judgingPerceiving)) {
			return false;
		}
		return true;
	}
	*/
	
//	@Override
//	public int hashCode() {
//		// 객체를 가지고 뭐 알아서 10진수로 만들어서 바노한
//		// 필드값 똑같으면 똑같은 해시코드 나오게 하고싶다
//		/*
//		String isfj = "I" + "S" + "T" +  "J";
//		isfj.toString().hashCode();
//		"isfj".toString().hashCode();
//		*/
//		return (introversionExtroversion + sensingiNtuition 
//				+ thinkingFeeling + judgingPerceiving).hashCode();
//	}

	
	
}
