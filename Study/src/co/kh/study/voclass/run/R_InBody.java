package co.kh.study.voclass.run;

import java.util.Scanner;

import co.kh.study.voclass.vo.InBody;


public class R_InBody {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InBody body = new InBody();

        System.out.println("=== InBody 정보 입력 ===");

        System.out.print("이름 > ");
        String name = sc.nextLine();
        body.setName(name);

        System.out.print("나이 > ");
        int age = sc.nextInt();
        sc.nextLine();
        body.setAge(age);

        System.out.print("키(cm) > ");
        double height = sc.nextDouble();
        sc.nextLine();
        body.setHeight(height);

        System.out.print("몸무게(kg) > ");
        double weight = sc.nextDouble();
        sc.nextLine();
        body.setWeight(weight);

        System.out.print("성별(M/F) > ");
        String gender = sc.nextLine();
        body.setGender(gender);
        
        InBody body2 = new InBody(body.getName()
        						,body.getAge()
        						,body.getHeight()
        						,body.getWeight()
        						,body.getGender());

        boolean exit = false;
        while (!exit) {
            System.out.println("\n==============================");
            System.out.println("1. InBody 정보 보기");
            System.out.println("2. 신체 상태(BMI, 체지방률) 업데이트");
            System.out.println("3. 종료");
            System.out.print("선택 > ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.println(body2.showStatus()); 
                    break;
                case 2:
                    body2.updateBodyStats();
                    System.out.println("신체 상태가 업데이트 되었습니다.");
                    break;
                case 3:
                    exit = true;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("메뉴를 다시 확인하세요.");
            }
        }

    }
}
