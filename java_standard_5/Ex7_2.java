// 참조변수 super
class parent {
    int x = 10; // super.x
}

class child extends parent {
    int x = 20; // this.x
    void method(){
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = 7" + super.x);
    }
}
public class Ex7_2 {
    public static void main(String[] args) {
        child c = new child();
        c.method();
    }    
}

/*
result>
x = 20
this.x = 20
super.x = 10
*/
