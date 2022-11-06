package java_standard.java_standard_5;
class Product{
    int price; // 제품의 가격
    int bonuspoint; // 제품 구매 시 제공하는 보너스 점수

    Product (int price){
        this.price = price;
        bonuspoint = (int)(price/10.0);  // 제품가격의 10%
    }
}

class Tv1 extends Product{
    Tv1() {
        super(100); // 조상 클래스의 Product(int price) 호출 ,Tv1의 가격은 100
    }
    public String toString (){
        return "TV!!"; // object class의 toString오버라이딩 (상속관계에서 자식 클래스에 맞게 재정의)
    }
}

class Computer extends Product {
    Computer(){
        super(200);// 조상 클래스의 Product(int price) 호출 ,Computer의 가격은 200
    }
    public String toString (){
        return "Computer!!"; // object class의 toString오버라이딩 (상속관계에서 자식 클래스에 맞게 재정의)
    }
}

class Buyer {
    int money = 2000;
    int bonuspoint = 0;
    
    void buy(Product p){
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= p.price;
        bonuspoint += p.bonuspoint;
        System.out.println( p + "을/를 구매하셨습니다.");
        
    }
    
}

public class Ex7_8{
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 잔액은 " + b.money + " 입니다");
        System.out.println("현재 소지한 보너스 포인트 잔액은 " + b.bonuspoint + " 입니다");
    }
}
/*
TV!!을/를 구매하셨습니다.
Computer!!을/를 구매하셨습니다.
현재 잔액은 1700 입니다
현재 소지한 보너스 포인트 잔액은 30 입니다
 */
