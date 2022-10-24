// 객체의  생성과 사용

public class Ex6_1 {
    public static void main(String[] args) {
        Tv t; // Tv 인스턴스를 참조하기 위해 변수 t선언
        t = new Tv(); // Tv인스턴스 생성
        t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown(); // Tv인스턴스의 매서드 channelDown()을 호출한다.

        System.out.println("현재의 채널은 "+ t.channel + "입니다.");

    }
}

class Tv {
    //TV의 속성 (멤버변수)
    String color;
    boolean power;
    int channel;
    // TV의 기능 (매서드)
    void power() {
        power = !power;
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;
    }
}