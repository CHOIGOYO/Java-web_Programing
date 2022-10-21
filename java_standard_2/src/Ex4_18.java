import java.util.*;

public class Ex4_18 {
    public static void main(String[] args) {
        // break and continue
        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.println("원하는 메뉴 (1~3)를 선택하세요.(종료:0)>");
            
            String tmp = scanner.nextLine(); // 입력받은 문자를 tmp에 저장
            menu = Integer.parseInt(tmp);


            if(menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu<= 3)) {
                System.out.println("메뉴를 다시 선택해 주세요.( 종료 :0 )");
                continue;
            }

            System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
        }


    }// main의 끝
}
