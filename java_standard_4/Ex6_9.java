package JScode.java_standard_4;

import java.lang.Character.Subset;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class MyMath2{
    long a, b;

    // 인스턴스 변수 a, b만을 이용해서 작업함으로 매개변수가 필요 없다
    long add() {return a + b;}
    long substract() {return a - b;}
    long multifly() {return a * b;}
    double divide() {return a / b;}    

    //인스턴스와 관계없이 매개변수만으로 작업이 가능하다
    static long add(long a , long b) {return a + b;}
    static long substract(long a ,long b) {return a - b;}
    static long multifly(long a ,long b) {return a * b;}
    static long divide(long a ,long b) {return a / b;}


}

public class Ex6_9 {
    public static void main(String[] args) {
        //클래스 메서드 호출 인스턴스 생성 없이 호출 가능
        System.out.println(MyMath2.add(200L,100L));
        System.out.println(MyMath2.substract(200L,100L));
        System.out.println(MyMath2.multifly(200L,100L));
        System.out.println(MyMath2.divide(200L,100L));

        //인스턴스 생성
        MyMath2 m2 = new MyMath2();
        m2.a = 200L;
        m2.b = 100L;

        //인스턴스 메서드는 객체생성 후에만 호출이 가능함
        System.out.println(m2.add());
        System.out.println(m2.substract());
        System.out.println(m2.multifly());
        System.out.println(m2.divide());
    }
}

/*
 resurt >
 300
 100
 20000
 2
 300
 100
 20000
 2.0
*/
