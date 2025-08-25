package com.kh.memory.run;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("홍길동", "고길동", "짱구");
		//for(int i = 0; i < 10; i++)
		for(String name : names) {
			System.out.println(name + "은(는) 정말 못말려~~");
		}
		System.out.println("===================================");
		names.stream()
			 .map(name -> name + "은(는) 못말려~~")
			 .forEach(System.out::println);
		
		// 스트림(Stream)
		// 컬렉션, 배열 등의 데이터를 선언적으로 처리해주는 API
		// for문 -> 어떻게 반복하는지가 구체적
		// 함수형 -> 무엇을 할지 행위에 집중
		// 파이프라이닝 -> 여러 연산을 연결
		
		System.out.println("===================================");
		// 60점 이상인 점수의 평균을 구해봐야겠다.
		int[] scores = {88, 50, 72, 90, 100, 20, 40};
		int sum = 0;
		int count = 0;
		
		for (int score : scores) {
			if(score >= 60) {
				sum += score;
				count++;
			}
		}
		double average = (double)sum / count;
		System.out.println(average);
		
		double streamAvg = Arrays.stream(scores)
								 .filter(score -> score >= 60)
								 .average()
								 .orElse(0.0);
		
		System.out.println(streamAvg);
		
		/*
		 * 메소드식별자(매개변수){
		 * 		return a;
		 * }
		 * 
		 * print(int a){
		 * 		return a;
		 * }
		 * 
		 * (int a) -> {
		 * 		return a;
		 * }
		 * 
		 * (int a) -> return a;
		 * 
		 * (int a) -> a;
		 * 
		 * (a) -> a;
		 * 
		 * a -> a;
		 */
		// 익명클래스 -> 선언과 동시에 객체를 생성하는 것
		SimpleCal adder = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a + b;
			}
		};
		SimpleCal minuser = new SimpleCal() {
			@Override
			public int cal(int a, int b) {
				return a - b;
			}
		};
		System.out.println("5 + 3 = " + adder.cal(5, 3));
		System.out.println("5 + 3 = " + minuser.cal(5, 3));
		
		SimpleCal adder2 = (a,b) -> a+b;
		SimpleCal minuser2 = (a,b) -> a+b;
		System.out.println("2 + 4 = " + adder.cal(2, 4));
		System.out.println("2 + 4 = " + minuser.cal(2, 4));
		
		// map(), filter()
		
		// filter => 조건에 맞는것만 필터링할 수 있음
		List<String> coffee = Arrays.asList("아메리카노", "라떼", "콜드브루", "에스프레소", "헤이즐넛");
		List<String> longNameCoffee = new ArrayList();
		
		for(String c : coffee) {
			if(c.length() == 5) {
				longNameCoffee.add(c);
			}
		}
		System.out.println(longNameCoffee);
		
		List<String> coffeeList = coffee.stream()
			  							.filter(c -> c.length() == 5)
			  							.collect(Collectors.toList());
		System.out.println(coffeeList);
		
		// map -> 스트림을 이용해서 데이터 변환하는 용도
		List<Integer> nameLength = new ArrayList();
		for(String name : coffee) {
			nameLength.add(name.length());
		}
		System.out.println(nameLength);
		
		List<Integer> lengths = coffee.stream()
									  .map(c -> c.length())
									  .collect(Collectors.toList());
		System.out.println(lengths);
		coffee.stream().map(c -> c + "의 길이 : " + c.length())
					   //.forEach(l -> System.out.println());
					   .forEach(System.out::println);
	}
	
	// 함수형 인터페이스 선언
	@FunctionalInterface	   // 이거 인터페이스 함수형이야~ 컴파일러가 아 이거 함수형 인터페이스구나!
	interface SimpleCal{
		int cal(int a, int b); // 하나의 추상메소드만 가지고 있어야함
	}
}
