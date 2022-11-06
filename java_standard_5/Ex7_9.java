// 여러 종류의 객체를 배열로 다루기
class Product2 {
    int price;
    int bonuspoint;

    Product2(int price) { // 매개변수 존재 생성자 Product2
        this.price = price;
        bonuspoint = (int)(price/10.0);
    }

    Product2() { // 기본 생성자 Product2
    }
}

class Tv2 extends Product2{
    Tv2(){   super(200);   }
    public String toString() {   return "TV";   }
}
class Computer2 extends Product2{
    Computer2(){    super(400);   }
    public String toString() {return "Computer";}
}
class Audio2 extends Product2{
    Audio2(){    super(100);    }
    public String toString() {return "Audio";}
}

class Buyer2{
    int money = 1000;
    int bonuspoint = 0;

    Product2[] cart = new Product2[10]; // 구입한 상품을 저장하기 위한 배열 
    int i = 0;

    void Buy (Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다.");
            return ; 
        }

        money -= p.price;
        bonuspoint += p.bonuspoint;
        cart[i++] = p; // cart 배열에 p를 차례로 저장 
        System.out.println(p + "을/를 구매하였습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";
        //반복문 사용 _구입한 물건 금액의 합과 내역 목록 생성
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) break;
                
            sum += cart[i].price;
            itemList += cart[i] + ", " ;
        }
        System.out.println("구입하신 물품은 " + itemList + "입니다.");
        System.out.println("구입하신 물품의 총 금액은 " + sum + "입니다.");
    }
}

public class Ex7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.Buy(new Tv2());
        b.Buy(new Computer2());
        b.Buy(new Audio2());
        b.summary();
    }
}

/*
TV을/를 구매하였습니다.
Computer을/를 구매하였습니다.
Audio을/를 구매하였습니다.
구입하신 물품은 TV, Computer, Audio, 입니다.
구입하신 물품의 총 금액은 700입니다.
 */