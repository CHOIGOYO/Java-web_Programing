class Data3 { int x; }

public class Ex6_8 {
    public static void main(String[] args) {
        // 참조형 반환타입
        Data3 d = new Data3(); 
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
        

    }

    static Data3 copy(Data3 d) { // 참조형 매개변수 
        Data3 tmp = new Data3(); //새로운 객체 tmp생성

        tmp.x = d.x; // d.x의 값을 tmp.x에 복사

        return tmp; // 복사한 객체의 주소를 반환
    }
}
/*
 결과>
 d.x = 10
 d2.x = 10
 */