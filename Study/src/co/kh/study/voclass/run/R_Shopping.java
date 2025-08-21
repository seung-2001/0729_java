package co.kh.study.voclass.run;

import java.util.Scanner;

import co.kh.study.voclass.vo.Shopping;


public class R_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopping shopping = new Shopping();
        

        System.out.println("=== 쇼핑 정보 입력 ===");

        System.out.print("상품명 > ");
        shopping.setItemName(sc.nextLine());

        System.out.print("수량 > ");
        shopping.setQuantity(sc.nextInt());

        System.out.print("단가 > ");
        shopping.setPricePerUnit(sc.nextDouble());
        sc.nextLine();

        System.out.print("카테고리 > ");
        shopping.setCategory(sc.nextLine());

        shopping.setDelivered(false);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n==============================");
            System.out.println("1. 쇼핑 정보 보기");
            System.out.println("2. 배송 처리");
            System.out.println("3. 총 가격 출력");
            System.out.println("4. 종료");
            System.out.print("선택 > ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println(shopping.showInfo());
                    break;
                case 2:
                    shopping.deliver();
                    break;
                case 3:
                    shopping.printTotalPrice();
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
