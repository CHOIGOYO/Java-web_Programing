import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        // while
        int num = 0 ,sum = 0;

        System.out.print("Please enter a number : (ex > 1234)");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();

        num = Integer.parseInt(tmp); // 입력받은 문자열 tmp를 숫자로 전환하여 num에 저장

        while(num !=0 ) {
            // sum 은 num 을 10으로 나눈 나머지만큼 증감한다
            sum += num%10 ; // sum = sum + num%10;
            System.out.printf("sum = %3d num %d%n" , sum , num);
            num /= 10; // num = num/10; 
        }
        System.out.println("각 자리수의 합 :" + sum);
    }
}
