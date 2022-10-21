package java_standard_1;
public class Ex3_17_1 {
    public static void main(String[] args) {
        // 대입 연산자와 복합 대입 연산자

        int x ,y ;
        x = y = 3 ;

        System.out.println(y);
        System.out.println(x);
        /*
         대입 연산자의 연산결과는  오른쪽에서 왼쪽으로 진행된다 
         3이라는 값이 y에 저장된 후 y가 x에 저장되는 순서
         */

        int i = 0;
        // 3 = i+3 ; -> 오류 lvalue가 저장할 수 있는 공간이 아니다
        // i+3 = i ; -> 오류

         /*
         lvalue 와 rvalue
         lvalue는  반드시 변수처럼 값을 변경할 수 있는 것이어야하고 대입연산자의 왼쪽 피연산자를 말한다
         rvalue는 오른쪽 피연산자를 말한다
         */

        final int Max = 3;
        //Max = 10; -> 오류 
        // final 키워드를 사용하면 상수가되어 값을 변경할 수 없다.


        //복합 대입 연산자
        /* 다른 부호도 이와같이 이해하면 된다
        
         * i = i+3 -> i는 3씩 증가
         * i += 3 -> i는 3씩 증가
         */

    }
}
