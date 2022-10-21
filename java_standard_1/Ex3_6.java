package java_standard_1;
// 사칙 연산자
public class Ex3_6{
    public static void main (String[] args) {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n" , a, b, a+b);
        System.out.printf("%d - %d = %d%n" , a, b, a-b);
        System.out.printf("%d * %d = %d%n" , a, b, a*b);
        System.out.printf("%d / %d = %d%n" , a, b, a/b);

        System.out.printf("%d / %f = %f%n" , a, (float)b, a/(float)b);
        
        /*
         int 타입끼리의 연산결과는 int로 반환된다  int 10/ int 4 = int 2
         float은 int형을 포함하는 데이터 타입이라 자동형변환이 일어난 것 
         10.0 / 4.0 = 2.500000
         */
    }
} 