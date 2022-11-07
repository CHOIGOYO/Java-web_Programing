
// 디폴트 메서드와 static 메서드
class Child3 extends Parent3 implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method() in Child3"); //오버라이딩 
    }
}

class Parent3{
    public void method2() {
        System.out.println("method2() in Parent3");
    }
}

interface MyInterface{
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticmethod(){
        System.out.println("staticmethod() in MyInterface");
    }
}

interface MyInterface2{
    default void method1(){
        System.out.println("method1() in MyInterface2");
    }
    static void staticmethod(){
        System.out.println("staticmethod() in MyInterface2");
    }
}

public class Ex7_11 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        c.method1();
        c.method2();
        MyInterface.staticmethod();
        MyInterface2.staticmethod();
    }
}

/*
method() in Child3
method2() in Parent3
staticmethod() in MyInterface
staticmethod() in MyInterface2
 */
