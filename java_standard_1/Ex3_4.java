package java_standard_1;

public class Ex3_4 {
    public static void main (String[]args){
    // 부호 연산자

    int i = -10;
    
    i = +i;

    System.out.println(i); // 결과 값 = -10

    i = -10;

    i = -i;
    System.out.println(i); // 결과 값 = 10
    }
    /*
      부호 연산자 -는 피연산자의 부호를 반대로 변경한 결과를 반환시킨다
      부호 연산자 + 는 쓰이는 경우가 거의 없으며, 형식적으로 존재한다 생각해도 무방
     */
}
