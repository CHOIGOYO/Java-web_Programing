package a_conditional;

public class Condition2Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        if(true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4); 
            //조건이 true이면 1,2,3,4를 출력후 조건문을 나가 다음 코드를 실행한다
        }
        // 조건문이 끝나고 다음이어지는 코드
        System.out.println(5);
    }

}
/*
 반대로 if(false)라면 1,2,3,4는 실행되지 않고 5가 출력된다
 */