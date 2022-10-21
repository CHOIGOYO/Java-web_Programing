package a_operator;

public class DivisionDemo {

    public static void main(String[] args) {
        // 정수와 실수 타입별로 나누기한 결과구하기
        
        int a = 10;
        int b = 3;
        
        float c = 10.0F;
        float d = 3.0F;
        
        System.out.println( a / b ); //3(int 끼리의 연산) 나머지는 버려져 몫만 출력
        
        System.out.println( c / d ); //3.3333333(float 끼리의 연산) 

        System.out.println( a / d ); //3.3333333(int / float 연산) 암시적 형변환이 일어나 정수가 실수로 계산됨

    }

}
