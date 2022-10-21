package java_standard_1;

public class Ex3_5 {
    public static void main (String[]args){
        // 형변환 연산자

        double d = 85.4;
        int score = (int)d; // double형 변수 d를 int형으로 형변환

        System.out.println( score ); // 출력 값 > 85 > int형으로 변환되어 출력됨

        
        System.out.println( d ); // 출력 값 > 85.4 // 형변환 후에도 피 연산자에게는 아무런 변화 없음
    }
}
