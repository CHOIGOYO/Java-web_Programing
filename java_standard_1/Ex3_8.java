package java_standard_1;

public class Ex3_8 {
    public static void main (String[] args) {
        byte a = 10 ;
        byte b = 30 ;
        byte c = (byte)(a * b) ;

        System.out.println( c ); // 44

        /* 44의 결과값이 나온 이유는 10*30의 결과는 300이지만 
        byte가 담을 수 있는 범위를 넘어선 숫자이기 때문에 
        데이터 손실이 발생하여 변수c에 저장된 것이다 */

        int a1 = 10 ;
        int b1 = 30 ;
        int c1 = (a1 * b1) ;

        System.out.println( c1 ); // 300


    }
}
