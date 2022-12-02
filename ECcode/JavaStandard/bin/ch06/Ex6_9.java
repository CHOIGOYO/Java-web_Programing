// static 메서드와 인스턴스 메서드
class MyMath2 {
    
    long a, b;

    // 인스턴스 변수만을 이용해서 작업함으로 매개변수 필요X
    long add() { return a+b; }
    long subtract() { return a-b; }
    long multiply() { return a*b; }
    double divide() { return a/b; }

    //인스턴스 변수와 관계없이 매개변수만을 작업 가능 a ,b는 지역변수
    static long add( long a , long b ) { return a+b; }
    static long subtract( long a , long b ) { return a-b; }
    static long multiply( long a , long b ) { return a*b; }
    static long divide( long a , long b ) { return a/b; }
}

public class Ex6_9 {
    public static void main(String[] args) {
        //클래스 매서드 호출 인스턴스 생성없이 호출가능
        System.out.println(MyMath2.add(220L , 100L));
        System.out.println(MyMath2.subtract(200L, 200L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        
        
        
        MyMath2 mm = new MyMath2(); //인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;

        //인스턴스 메서드는 객체 생성 후에만 호출이 가능
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}

/*
결과>
320
0
20000
2
300
100
20000
2.0
*/