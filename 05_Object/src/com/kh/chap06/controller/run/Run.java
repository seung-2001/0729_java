package com.kh.chap06.controller.run;

import java.util.Arrays;

import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {

	public static void main(String[] args) {
		/*
		 * Human human = new Human(); 
		 * human.hi();
		 */

		/*
		MethodController mc = new MethodController();
		int a = mc.add(1, 2);
		int b = mc.add(2, 3);
		int c = mc.add(3, 4);
		int d = mc.add(4, 5);
		int e = mc.add(5, 6);
		System.out.println("총합 : " + e);
		*/
		
		MethodController mc = new MethodController();
		// int[] dd = new int[3];
		//mc.method1();
		//String returnValue = mc.method2();
		//System.out.println(returnValue);
		//System.out.println(mc.method2());
		// mc.println("method3 호출 결과 : " + mc.method3());
		
		// String parameter = "method3 호출 결과 : " + mc.method3();
		// mc.method4(2);
		
		// int result = mc.method5(3);
		// System.out.println(result);
		// mc.a();
		
		
		// MethodController mc = mc;
		// ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		// mc.test(mc);
		
		// 복습하자~~~
		
		// 객체를 생성하지 않고 메서드를 호출 할 수 이씀
		Math.random();
		int[] arr = {2, 3};
		System.out.println(Arrays.toString(arr));
		MethodController.staticMethod();
		
		// mc.haha(3.34);
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("어라?");
		System.out.println(mc);
		*/
		
		OverloadingController oc = new OverloadingController();
		
		
		// 정적 바인딩(Static Binding)
		// 컴파일이 끝난 시점 어떤 메소드가 호출될지 결정
		// 컴파일러가 알아서 코드를 분석
		oc.test();
		oc.test(2);
		oc.test("인자값(argument)");
		oc.test(1, 2);
		oc.test(2, "sdf");
		oc.test("bbb", 2);
		
		
	}

}
