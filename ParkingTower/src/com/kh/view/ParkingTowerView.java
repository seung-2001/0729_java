package com.kh.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.controller.ParkingTowerController;
import com.kh.model.vo.Car;

public class ParkingTowerView {

	private Scanner sc = new Scanner(System.in);
	private ParkingTowerController ptc = new ParkingTowerController();

	public void mainMenu() {
		while (true) {

			System.out.println("== 메인 메뉴 ==");
			System.out.println("");
			System.out.println("1. 차량 주차");
			System.out.println("2. 차량 출차");
			System.out.println("3. 주차된 차량 검색");
			System.out.println("4. 전체 출력");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("번호를 입력해주세요 : >> ");
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();

				switch (menuNo) {
				case 1:
					insertCar();
					break;
				case 2:
					deleteCar();
					break;
				case 3:
					searchCar();
					break;
				case 4:
					selectList();
					break;
				case 0:
					System.out.println("주차 프로그램을 종료합니다.");
					return;
				default:
					System.out.println("다시 확인해서 입력해주세요");
					continue;
				}

			} catch (InputMismatchException e) {
				e.printStackTrace();
			}

		}
	}

	public void insertCar() {

		System.out.println(" == 차량 주차 메뉴 ==");
		System.out.print("차량 번호를 입력해주세요 : >> ");
		int carNum = sc.nextInt();
		sc.nextLine();

		int num = 0;
		while (true) {
			System.out.println("1.경차\t2.세단\t3.SUV\t4.트럭");
			System.out.print("차량 타입을 선택해주세요 : >> ");
			int carType = sc.nextInt();
			sc.nextLine();
			if (0 < carType && carType < 5) {
				num = carType;
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.print("성함을 입력해주세요 : >> ");
		String owner = sc.nextLine();

		ptc.insertCar(carNum, num, owner);

	}

	public void deleteCar() {
		System.out.println(" == 차량 출차 메뉴 == ");
		System.out.print("차량 번호를 입력해주세요 : >> ");

		int carNum = sc.nextInt();
		sc.nextLine();

		int result = ptc.deleteCar(carNum);

		if (result == 1) {
			System.out.println("안녕히 가세요");
		} else {
			System.out.println("차량이 없습니당");
		}
	}

	public void searchCar() {
		System.out.println("== 차량 검색 메뉴 == ");
		System.out.print("성함을 입력해주세요 : >> ");
		String owner = sc.nextLine();

		ArrayList<Car> carOwner = ptc.searchCar(owner);
		if (!carOwner.isEmpty()) {
			for (Car car : carOwner) {
				System.out.println(car.toString());
			}
		}
	}

	public void selectList() {
		System.out.println("== 차량 목록 ==");

		ArrayList<Car> car = ptc.selectList();

	}
}
