class parent2 {
    int x = 10; // super.x and this.x 모두 가능 
}

class child2 extends parent {
    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("x.super = " + super.x);
    }
}

public class Ex7_3 {
    public static void main(String[] args) {
        child2 c2 = new child2();
        c2.method();
    }
}
/*
result>
x = 10
this.x = 10
x.super = 10
 */