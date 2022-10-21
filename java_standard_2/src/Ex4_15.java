import java.util.Scanner;

public class Ex4_15 {
    public static void main(String[] args) {
        // do while문  -> 처음 한번은 무조건 실행하고 조건식을 판단한다 

        int input = 0 , answer  = 0;

        answer = (int)(Math.random() * 100 ) + 1; // 1 ~ 100까지 임의의 수 저장 
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1 에서 100 사이의 정수를 입력하세요 >");
            input = scanner.nextInt(); //사용자에게 입력 값을 받아 저장

            if( input > answer ){ 
                System.out.println("더 작은 수로 시도해보세요  ");
            } else if ( input < answer ) {
                System.err.println(" 더 큰 수로 시도해보세요 ");
            }
        } 
        while (input != answer);

        System.out.println(" 정답 입니다 ");

    }
}
