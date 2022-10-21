import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {
        int menu = 0 , num = 0 ;
        Scanner scanner = new Scanner(System.in); 

        outer :
        while (true) {
            System.out.println("(1) square " );
            System.out.println("(2) square root" );
            System.out.println("(3) log" );
            System.out.print(" 원하시는 메뉴 (1~3)를 선택하세요. (종료:0) > " );

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu ==0 ) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)){
                System.out.println("메뉴를 다시 선택해주세요."); 
                continue;
            }
            for(;;){
                System.out.print("계산할 값을 입력하세요. (계산 종료: 0 , 전체 종료:99) > ");
                tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장 
                num = Integer.parseInt(tmp); // 입력받은 문자열 tmp를 int형으로 변환

                if(num == 0){
                    break;
                }
                if(num == 99) {
                    break outer; // outer while (전체 종료)
                }

                switch(menu){
                    case 1:
                    System.out.println("result = " + menu);
                    break;
                
                    case 2:
                    System.out.println("result = " + Math.sqrt(menu));
                    break;

                    case 3:
                    System.out.println("result = " + Math.log(menu));
                    break;
                }
                    

            }
        }

    }
}