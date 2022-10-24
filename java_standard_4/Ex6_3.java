public class Ex6_3 {
    public static void main(String[] args) {
      // 클래스 변수와 인스턴스 변수
      System.out.println("Card.width = " + Card.width);
      System.out.println("Card.height = " + Card.height);   
      //클래스 변수 (static 변수)는 객체 생성없이 '클래스이름.클래스 변수'로 직접 사용 가능

      Card c1 = new Card();
      c1.kind = "Heart";
      c1.number = 7;

      Card c2 = new Card();
      c2.kind = "Spade";
      c2.number = 4; // 인스턴스 변수의 값을 변경

      System.out.println( 
        "c1은" + c1.kind + ", " + c1.number +"이며, 크기는  (" + c1.width + ", " + c1.height +")"
      );

      System.out.println( 
        "c2은" + c2.kind + ", " + c2.number +"이며, 크기는  (" + c2.width + ", " + c2.height +")"
      );
      

      System.out.println("c1의 width와 height를 각각 50화 80으로 변경합니다.");

      c1.width = 50;
      c1.height = 80;


      System.out.println( 
        "c1은" + c1.kind + ", " + c1.number +"이며, 크기는  (" + c1.width + ", " + c1.height +")"
      );

      System.out.println( 
        "c2은" + c2.kind + ", " + c2.number +"이며, 크기는  (" + c2.width + ", " + c2.height +")"
      );
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

/*
 static변수(클래스변수)는 클래스 영역에 선언되며 공통된 저장공간(변수)를 공유하여 한 클래스의 모든 인스턴트들이 공통적인 값을 유지해야하는 속성의경우 사용한다

 인스턴트변수는 클래스 영역에 선언되며 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우 사용한다

 지역변수 매서드 내에 선언되어 지역변수가 선언된 {}를 벗어나면 소멸되어 사용할 수 없게된다
 */