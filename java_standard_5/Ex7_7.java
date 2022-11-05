// 참조변수의 형변환 
class Car {
    String color;
    int door;

    void drive(){
        System.out.println("drive, brrrrrr ~~~"); // 운전기능
    }
    void stop(){
        System.out.println("stop!!!"); // 멈추는 기능
    }
}

class FireEngine extends Car{ // 소방차
    void water(){
        System.out.println("water ==="); // 물뿌리는 기능
    }
}

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (Car)fe;
//      car.water();  에러 Car타입의 참조변수로 water() 호출 불가 

        fe2 = (FireEngine)car;
        fe2.water();
    }
}
/*
water ===
water ===
 */