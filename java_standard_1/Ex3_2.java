package java_standard_1;

public class Ex3_2 {
    public static void main(String[] args) {
        //증감 연산자 ++ 와 --

        int i = 5 , j = 0 ;

        j = i++; // 후위형 증감연산사로 i의 증가하기 전 값이 j에 참조된 후 i의 값이 1씩 증가한다

        System.out.println("j = i++; 실행 후 , i =" + i + ", j = " + j );
    }
}
