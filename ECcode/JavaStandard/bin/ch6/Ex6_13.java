//생성자에서 다른 생성자 호출 this
class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){
        this("white", "auto", 4);
    }

    Car2(String color){
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Ex6_13 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = "+ c1.color +", c1의 gearType = " + c1.gearType +", c1의 door = "+c1.door);
        System.out.println("c2의 color = "+ c2.color +", c2의 gearType = " + c2.gearType +", c2의 door = "+c2.door);
    }
}

/*
result >
c1의 color = white, c1의 gearType = auto, c1의 door = 4
c2의 color = blue, c2의 gearType = auto, c2의 door = 4
 */