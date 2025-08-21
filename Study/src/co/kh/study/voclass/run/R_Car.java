package co.kh.study.voclass.run;

import java.util.Scanner;

import co.kh.study.voclass.vo.Car;


public class R_Car {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Car car = new Car();
		
		System.out.println("자동차 부릉부릉");
	
		boolean exit = false;
		System.out.print("자동차의 이름을 입력해주세요 > ");
		String name = sc.nextLine();
		car.setName(name);
		System.out.println("");
		
		System.out.print("자동차의 기름량 입력해주세요 > ");
		int fuel = sc.nextInt();
		sc.nextLine();
		car.setFuel(fuel);
		System.out.println("");
		
		System.out.print("자동차의 현재속도를 입력해주세요 > ");
		int speed = sc.nextInt();
		sc.nextLine();
		car.setSpeed(speed);
		System.out.println("");
		
		System.out.print("자동차의 가격을 입력해주세요 > ");
		int price = sc.nextInt();
		sc.nextLine();
		car.setPrice(price);
		System.out.println("");
		
		System.out.println("자동차의 색을 입력해주세요 > ");
		String color = sc.nextLine();
		car.setColor(color);
		System.out.println("");
		
		Car car2 = new Car(car.getName(),car.getFuel(),car.getSpeed(),car.getPrice(),car.getColor());
		
		while(!exit) {
			System.out.println("==================================");
			
			System.out.println("1. 자동차 정보 2. 속도 올리기 3. 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo){
			case 1 : 
				System.out.println(car2.displayInfo());
				break;
			case 2 : 
				car2.speedUp(); 
				break;
			case 3 : 
				exit = true; 
				break;
			default : 
				System.out.println("메뉴를 다시 확인하세요.");
			}
		}
		
		
	}

}
