package JScode.java_standard_4;

import javax.swing.event.SwingPropertyChangeSupport;

// 매개변수가 있는 생성자
class Car{
    String color; //색상
    String gearType; // 변속기 종류 - (auto) or (manual)
    int door; // 문의 개수

    Car(){}

    Car(String c, String g , int d){
        color = c;
        gearType = g;
        door = d;
    }
}
public class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car(); 

        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4); 

        System.out.println("c1의 color  = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2의 color  = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
    }
}

/*
result>
c1의 color  = white, c1.gearType = auto, c1.door = 4
c2의 color  = white, c2.gearType = auto, c2.door = 4
 */