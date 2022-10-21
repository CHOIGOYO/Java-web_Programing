import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        // switch 
        System.out.print("현재 월을 입력하세요 >");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); //화면을 통해 받은 (숫자)값을 month에 저장

        switch(month){
            case 3 :
            case 4 :
            case 5 :
                System.out.println("현재의 계절은 봄 입니다.");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("현재의 계절은 가을 입니다.");
                break;
            case 12 :
            case 1 :
            case 2 :
                System.out.println("현재의 계절은 겨울 입니다.");
                break;
        } // main의 끝


    }
}
