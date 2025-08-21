package co.kh.study.voclass.run;

import java.util.Scanner;

import co.kh.study.voclass.vo.RealEstate;


public class R_RealEstate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RealEstate estate = new RealEstate();

        System.out.println("=== 부동산 정보 입력 ===");

        System.out.print("주소 > ");
        estate.setAddress(sc.nextLine());

        System.out.print("종류(아파트, 주택 등) > ");
        estate.setType(sc.nextLine());

        System.out.print("면적(㎡) > ");
        estate.setArea(sc.nextInt());

        System.out.print("방 개수 > ");
        estate.setRooms(sc.nextInt());

        System.out.print("가격(만원) > ");
        estate.setPrice(sc.nextInt());
        sc.nextLine();

        boolean exit = false;
        while (!exit) {
            System.out.println("\n==============================");
            System.out.println("1. 부동산 정보 보기");
            System.out.println("2. 가격 올리기");
            System.out.println("3. 리모델링");
            System.out.println("4. 종료");
            System.out.print("선택 > ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch(menu) {
                case 1:
                    System.out.println(estate.showInfo());
                    break;
                case 2:
                    System.out.print("올릴 금액(만원) > ");
                    int amount = sc.nextInt();
                    sc.nextLine();
                    estate.increasePrice(amount);
                    break;
                case 3:
                    estate.renovate();
                    break;
                case 4:
                    exit = true;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }
        }
    }
}
