// 내부 클래스의 제어자와 접근성 

public class Ex7_13 {
    class InstanceInner{}
    static class StaticInner{}
    
    // instance 멤버 간에는 서로 직접 접근이 가능하다
    InstanceInner iv = new InstanceInner();
    // static 멤버 간에는 서로 직접 접근이 가능하다
    StaticInner cv = new StaticInner();

    static void staticMethod(){
        // static 멤버는 instance 멤버에 직접 접근할 수 없다
//      InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 접근 방법
        // instance 클래스는 외브 클래스를 먼저 생성해야만 생성할 수 있다.
        Ex7_13 Outer = new Ex7_13();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod(){
        // instance 메서드에서는 instance 멤버와 static 멤버 모두 접근 가능하다
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접글할 수 없다
//      LocalInner lv = new LocalInner();
    }
   
    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }
}
