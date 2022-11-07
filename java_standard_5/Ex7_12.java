// 내부 클래스의 제어자와 접근성

public class Ex7_12 {
    class InstanceInner {
        int iv = 100;
//      static int cv = 100;  //오류 내부 static class에서 선언할 수 있다
        final static int CONST = 100; // final static 은 상수이므로 허용
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
        //  static int cv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}

/*
100
200
 */