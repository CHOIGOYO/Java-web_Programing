
public class Ex4_17{
    public static void main(String[] args) {
         //continue 문
         // 1 ~ 10 사이의 숫자 출력 단 3의 배수는 제외

         for (int i = 0; i <= 10; i++) {
            if(i %3 == 0) { // i를 3으로 나누었을 때 나머지 값이 0인값 즉, 3의 배수는 아래 코드 continue를 실행한다
                continue;   
            }

            System.out.println(i);
         }
     }
}