import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        // if 문의 변형 if - else

        System.out.println("숫자를 하나 입력하세요 >");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); //화면을 통해 입력받은 값을 input에 저장

        if (input == 0) {
            System.out.println("zero");
        } else {
            // input != 0인경우
            System.out.println("입력하신 숫자는 0이 아닙니다");
        }

    }
    
}
