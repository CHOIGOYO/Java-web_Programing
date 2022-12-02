class Data { int x; }
public class Ex6_6 {
    public static void main(String[] args) {
        // 기본형 매개변수  
        /*
        매개변수의 타입이 기본형일 때 기본형 값이 복사되지만, 참조형이면 인스턴스의 주소가 복사된다
        기본형 매개변수는 변수의 값을 읽기만 할 수 있고 
        참조형 매개변수는 값을 읽고, 변경 할 수 있다
         */

         Data d = new Data(); // 인스턴스 생성
         d.x = 10;
         System.out.println("main() : x = " + d.x); // main() : x = 10

         change(d.x); // 호출
         System.out.println("After change (d.x)"); // After change (d.x)
         System.out.println("main () : x = " + d.x); // main () : x = 10 

    }
    static void change(int x) { // 기본형 매개변수
        x = 1000; // 매개변수값 변경 즉, 복사본을 변경함
        System.out.println("change() : x = " + x ); // change() : x = 1000
    }   
}

/*
결과 >
main() : x = 10
change() : x = 1000
After change (d.x)
main () : x = 10 
 */

