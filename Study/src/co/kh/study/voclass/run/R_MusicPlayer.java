package co.kh.study.voclass.run;


import java.util.Scanner;

import co.kh.study.voclass.vo.MusicPlayer;

public class R_MusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();

        System.out.print("🎵 음악 제목을 입력하세요 > ");
        player.setMusicName(sc.nextLine());

        System.out.print("저장 용량(GB)을 입력하세요 > ");
        player.setStorage(sc.nextInt());

        System.out.print("배터리 사용 가능 시간(시간)을 입력하세요 > ");
        player.setBatteryLifeHours(sc.nextInt());
        sc.nextLine(); // 버퍼 클리어

        System.out.print("지원하는 기기을 입력하세요 (예: MP3) > ");
        player.setSupportedFormats(sc.nextLine());

        System.out.print("📡 블루투스 지원 여부 (true/false): ");
        player.setHasBluetooth(sc.nextBoolean());

        System.out.println("\n✅ MusicPlayer가 성공적으로 생성되었습니다!");
        
        boolean exit = false;
        while (!exit) {
        	System.out.println("===================");
            System.out.println("메뉴를 선택하세요:");
            System.out.println("1. 음악 재생");
            System.out.println("2. 음악 변경");
            System.out.println("3. 상태 확인");
            System.out.println("4. 종료");
            System.out.print("입력 > ");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 클리어

            switch (choice) {
                case 1:
                    player.playMusic();
                    break;
                case 2:
                    System.out.print("변경할 음악 제목 입력 > ");
                    String newMusic = sc.nextLine();
                    player.changeMusic(newMusic);
                    break;
                case 3:
                    System.out.println(player.showStatus());
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("❗ 잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }
}
